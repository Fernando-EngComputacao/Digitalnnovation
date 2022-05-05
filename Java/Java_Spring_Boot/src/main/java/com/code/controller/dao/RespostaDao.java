package com.code.controller.dao;

import java.time.LocalDateTime;

import com.code.modelo.Resposta;

public class RespostaDao {

	private Long id;
	private String mensagem;
	private LocalDateTime dtCriacao;
	private String nomeAutor;
	
	//Constructor
	public RespostaDao(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.dtCriacao = resposta.getDataCriacao();
		this.nomeAutor = resposta.getAutor().getNome();
	}

	//Getters
	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDtCriacao() {
		return dtCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}
	
}
