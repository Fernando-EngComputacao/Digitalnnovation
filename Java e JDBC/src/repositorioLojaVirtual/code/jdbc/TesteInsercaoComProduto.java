package repositorioLojaVirtual.code.jdbc;

import repositorioLojaVirtual.code.jdbc.controller.*;
import repositorioLojaVirtual.code.jdbc.modelo.Produto;

import java.sql.*;

public class TesteInsercaoComProduto {

	public static void main(String[] args) throws SQLException {
		Produto produto = new Produto("Celular", "Anos 2000");
		Produto produto2 = new Produto();
		
		produto.add();
		produto2 = produto2.add("Teclado", "Black");
		
		System.out.println(produto);
		System.out.println(produto2);
	}
}
