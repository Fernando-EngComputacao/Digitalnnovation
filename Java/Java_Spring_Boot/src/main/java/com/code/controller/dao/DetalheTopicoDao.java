package com.code.controller.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.code.modelo.StatusTopico;
import com.code.modelo.Topico;

public class DetalheTopicoDao {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dtCricao;
	private String nomeAutor;
	private StatusTopico status;
	private List<RespostaDao> respostas;
	
	//Constructor
	public DetalheTopicoDao(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dtCricao = topico.getDataCriacao();
		this.nomeAutor = topico.getAutor().getNome();
		this.status = topico.getStatus();
		this.respostas = new ArrayList<>();
		this.respostas.addAll(topico.getRespostas().stream().map(RespostaDao::new).collect(Collectors.toList()));
	}

		
	//Getters 
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
	public String getNomeAutor() {
		return nomeAutor;
	}
	public StatusTopico getStatus() {
		return status;
	}
	public List<RespostaDao> getRespostas() {
		return respostas;
	}		
}
