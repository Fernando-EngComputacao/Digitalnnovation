package com.code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.dao.TopicoDao;
import com.code.modelo.Topico;
import com.code.repository.TopicoRepository;

@RestController
public class TopicoController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topico")
	public List<TopicoDao> lista(String nomeCurso){
		System.out.println(nomeCurso);
		if (nomeCurso == null) {
			List<Topico> topico = topicoRepository.findAll();
			return TopicoDao.converter(topico);
		} else {
			List<Topico> topico = topicoRepository.findByCurso_Nome(nomeCurso);
			return TopicoDao.converter(topico);
		}
	}
}