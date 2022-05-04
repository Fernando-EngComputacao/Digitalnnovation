package com.code.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.dao.TopicoDao;
import com.code.modelo.Curso;
import com.code.modelo.Topico;

@Controller
public class TopicoController {
	@RequestMapping("/topico")
	@ResponseBody
	public List<TopicoDao> lista(){
		Topico topico = new Topico("Dúvida", "sobre Python", new Curso("Python3","programação"));
		
		return TopicoDao.converter(Arrays.asList(topico, topico, topico));
	}
}