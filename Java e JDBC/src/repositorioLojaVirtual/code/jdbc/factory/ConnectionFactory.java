package repositorioLojaVirtual.code.jdbc.factory;

import java.sql.*;

import javax.management.RuntimeErrorException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
		
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/lojaVirtualAlura?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("123456789");
		comboPooledDataSource.setMaxPoolSize(20);
		
		this.dataSource = comboPooledDataSource;
	}
	
	public Connection iniciaConexao() {
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
