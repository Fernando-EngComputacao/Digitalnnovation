package repositorioLojaVirtual.code.jdbc;

import repositorioLojaVirtual.code.jdbc.controller.*;
import repositorioLojaVirtual.code.jdbc.dao.*;
import repositorioLojaVirtual.code.jdbc.factory.*;
import repositorioLojaVirtual.code.jdbc.modelo.Categoria;
import repositorioLojaVirtual.code.jdbc.modelo.Produto;

import java.sql.*;
import java.util.List;

//import javax.swing.JOptionPane;

public class TesteCategoriaDao {

	public static void main(String[] args) throws SQLException {
		
		//Categoria categ = new Categoria(JOptionPane.showInputDialog("Nome"));
		
		//try(Connection conexao = new ConnectionFactory().iniciaConexao()){
			//CategoriaDao categoriaDao = new CategoriaDao(conexao);
			//categoriaDao.salvar(categ);
			
			//List<Categoria> vetorCategoria = categoriaDao.listar();
			//vetorCategoria.stream().forEach(lista -> System.out.println(lista.getId() +", "+lista.getNome()));
		
		//#Com Query
		try(Connection conexao = new ConnectionFactory().iniciaConexao()){
			CategoriaDao categoriaDao = new CategoriaDao(conexao);
			
			List<Categoria> vetorCategoria = categoriaDao.listar();
			vetorCategoria.stream().forEach(lista -> {
				System.out.println(lista.getNome());
				
				try {
					for (Produto produto : lista.getProdutos()) {
						System.out.println(lista.getNome()+" -> "+produto.getNome());
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			});
		}
		
	}
}
