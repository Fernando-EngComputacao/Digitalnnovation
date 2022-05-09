package com.code.controller;

import java.net.URI;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.code.controller.dao.DetalheTopicoDao;
import com.code.controller.dao.TopicoDao;
import com.code.controller.form.TopicoForm;
import com.code.controller.form.TopicoUpdateForm;
import com.code.modelo.Topico;
import com.code.repository.CursoRepository;
import com.code.repository.TopicoRepository;

@RestController
@RequestMapping("/topico")
public class TopicoController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@Autowired
	private CursoRepository cursoRepository;
	
	//@RequestMapping(value = "/topico", method = RequestMethod.GET)
	@GetMapping
	@Cacheable(value = "listaDeTopico")
	public Page<TopicoDao> lista(@RequestParam(required = false) String nomeCurso, 
			@PageableDefault(sort = "id", direction =  Direction.DESC, page = 0, size = 10 ) Pageable paginacao){
		//public Page<TopicoDao> lista(@RequestParam(required = false) String nomeCurso, 
		//		@RequestParam int pagina, @RequestParam int qnt,
		//		@RequestParam String ordenacao){
		
		//Pageable paginacao = PageRequest.of(pagina, qnt, Direction.ASC, ordenacao);
		
		// Para pegar dados no Postman, use: localhost:8081/topico?page=1&size=10&sort=id,asc
		if (nomeCurso == null) {
			Page<Topico> topico = topicoRepository.findAll(paginacao);
			return TopicoDao.converter(topico);
		} else {
			Page<Topico> topico = topicoRepository.findByCursoNome(nomeCurso, paginacao);
			return TopicoDao.converter(topico);
		}
	}
	
	//@RequestMapping(value = "/topico" // method = RequestMethod.POST) 

	@PostMapping
	@Transactional
	@CacheEvict(value = "listaDeTopico", allEntries = true)
	public ResponseEntity<TopicoDao> cadastrar(@RequestBody @Valid TopicoForm form, UriComponentsBuilder uriBuilder) {
		 Topico topico = form.converter(cursoRepository);
		 topicoRepository.save(topico); 
		 
		 URI uri = uriBuilder.path("/topico/{id}").buildAndExpand(topico.getId()).toUri();
		 return ResponseEntity.created(uri).body(new TopicoDao(topico));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DetalheTopicoDao> detalhar(@PathVariable Long id) { //@PathVariable("id") Long codigo ---> no bloco de código se usaria "codigo" (sem aspas).
		Optional<Topico> topico = topicoRepository.findById(id);
		
		if(topico.isPresent())
			return ResponseEntity.ok(new DetalheTopicoDao(topico.get()));
		
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaDeTopico", allEntries = true)
	public ResponseEntity<TopicoDao> atualizar(@PathVariable Long id, @RequestBody @Valid TopicoUpdateForm form){
		Optional<Topico> optional = topicoRepository.findById(id);
		
		if (optional.isPresent()) {
			Topico topico = form.atualizar(id, topicoRepository);
			return ResponseEntity.ok(new TopicoDao (topico));
		}
	
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaDeTopico", allEntries = true)
	public ResponseEntity<?> deletar(@PathVariable Long id ){
		topicoRepository.deleteById(id);
		
		return ResponseEntity.ok().build();
	}
}