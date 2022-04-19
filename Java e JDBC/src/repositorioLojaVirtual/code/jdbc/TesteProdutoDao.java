package repositorioLojaVirtual.code.jdbc;

import repositorioLojaVirtual.code.jdbc.controller.*;
import repositorioLojaVirtual.code.jdbc.factory.*;
import repositorioLojaVirtual.code.jdbc.modelo.Produto;
import repositorioLojaVirtual.code.jdbc.dao.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.*;

public class TesteProdutoDao {

	public static void main(String[] args) throws SQLException {
		Produto produto = new Produto(JOptionPane.showInputDialog("Nome: "), JOptionPane.showInputDialog("Descrição:"));		
		
		try(Connection conexao = new ConnectionFactory().iniciaConexao()){
			ProdutoDao produtoDao = new ProdutoDao(conexao);
			produtoDao.salvar(produto);
			
			List<Produto> vetorProduto = produtoDao.listar();
			vetorProduto.stream().forEach(lista -> System.out.println(lista));
		}
	}
}
