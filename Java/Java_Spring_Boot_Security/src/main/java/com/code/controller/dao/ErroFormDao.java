package com.code.controller.dao;

public class ErroFormDao {

	private String campo;
	private String erro;
	
	// Constructor
	public ErroFormDao(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}

	
	//Getters
	public String getCampo() {
		return campo;
	}
	public String getErro() {
		return erro;
	}
	
	
	
	
	
}
