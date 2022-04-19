package repositorioLojaVirtual.code.jdbc.controller;

import repositorioLojaVirtual.code.jdbc.dao.CategoriaDao;
import repositorioLojaVirtual.code.jdbc.factory.ConnectionFactory;
import repositorioLojaVirtual.code.jdbc.modelo.*;

import java.sql.*;
import java.util.*;


public class CategoriaController {
	
	private CategoriaDao categoriaDao;
	
	public CategoriaController() {
		Connection conexao = new ConnectionFactory().iniciaConexao();
		this.categoriaDao = new CategoriaDao(conexao);
	}

	public List<Categoria> listar() throws SQLException {
		return this.categoriaDao.listar();
	}
}