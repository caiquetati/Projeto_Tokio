package br.com.tokio.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.tokio.connection.ConnectionFactory;

public class CorretorDAO {
	//Atributos
	private Connection conexao;
	//Construtor
	public CorretorDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}
	//Gerar 10 corretores aleatorios
	public void Gerar() {
		String sql = "INSERT INTO T_CEAP_CORRETOR (id_corretor, nm_corretor, ds_email_corretor, tel_corretor, nmr_crf) VALUES (?, ?, ?, ?, ?);";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, 1);
			stmt.setString(2, "Joao Silva");
			stmt.setString(3, "joaosilva@gmail.com");
			stmt.setInt(4, 12345678);
			stmt.setInt(5, 12345);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sql = "(2, 'Pedro Santos','pedrosantos@gmail.com', 0087654321, 67890);";
		sql = "(2, 'Cássio Oliveira','cassiooliveira@gmail.com', 0024681357, 24680);";
	}
	
	
	
}
