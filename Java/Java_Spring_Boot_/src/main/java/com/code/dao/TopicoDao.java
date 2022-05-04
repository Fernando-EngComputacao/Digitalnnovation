package com.code.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.code.modelo.Topico;

public class TopicoDao {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dtCricao;
	
	//Constructor
	public TopicoDao(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dtCricao = topico.getDataCriacao();
	}
	
	//Methods
	//public List<TopicoDao> converter(List<Topico> topico) {
	//	return topico.stream().map(TopicoDao::new).collect(Collectors.toList());
	//}
	
	//Getters and Setters
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDtCricao() {
		return dtCricao;
	}

	public static List<TopicoDao> converter(List<Topico> topico) {
		return topico.stream().map(TopicoDao::new).collect(Collectors.toList());
	}
	
	
}
