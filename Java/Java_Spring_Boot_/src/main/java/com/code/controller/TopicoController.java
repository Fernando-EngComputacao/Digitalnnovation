package com.code.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.dao.TopicoDao;
import com.code.modelo.Curso;
import com.code.modelo.Topico;
import com.code.repository.TopicoRepository;

@RestController
public class TopicoController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topico")
	public List<TopicoDao> lista(){
		List<Topico> topico = topicoRepository.findAll();
		
		return TopicoDao.converter(topico);
	}
}