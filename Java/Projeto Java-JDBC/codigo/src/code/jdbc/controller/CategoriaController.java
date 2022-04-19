package code.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import code.jdbc.dao.CategoriaDAO;
import code.jdbc.factory.ConnectionFactory;
import code.jdbc.modelo.Categoria;

public class CategoriaController {

	private CategoriaDAO categoriaDAO;

	public CategoriaController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.categoriaDAO = new CategoriaDAO(connection);
	}

	public List<Categoria> listar() {
		return this.categoriaDAO.listar();
	}
}
