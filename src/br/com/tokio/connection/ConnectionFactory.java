package br.com.tokio.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection conectar() {
		try {
			System.out.println("Fazendo a conexão com o banco de dados da oracle");
			return DriverManager.getConnection("URL","usuario","senha");
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} finally {
			System.out.println("Fim da conexão");
		}
		
	}

}
