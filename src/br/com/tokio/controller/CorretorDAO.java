package br.com.tokio.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
		String sql = "INSERT INTO T_CEAP_CORRETOR (id_corretor, nm_corretor, ds_email_corretor, tel_corretor, nmr_crf) VALUES (1, 'João Silva', 'joaosilva@gmail.com', '(XX)1234-5678', 12345)";
		try {
			Statement stmt = conexao.createStatement();
			stmt.executeUpdate(sql);
			sql = "INSERT INTO T_CEAP_CORRETOR (id_corretor, nm_corretor, ds_email_corretor, tel_corretor, nmr_crf) VALUES (2, 'Pedro Santos','pedrosantos@gmail.com', '(XX)8765-4321', 6789)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO T_CEAP_CORRETOR (id_corretor, nm_corretor, ds_email_corretor, tel_corretor, nmr_crf) VALUES (3, 'Cássio Oliveira','cassiooliveira@gmail.com', '(XX)2468-1357', 24680)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO T_CEAP_CORRETOR (id_corretor, nm_corretor, ds_email_corretor, tel_corretor, nmr_crf) VALUES (4, 'Neymar da Silva Santos Júnior', 'neymarsilvasantosjunior@gmail.com', '(XX)9876-5432', 98765)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO T_CEAP_CORRETOR (id_corretor, nm_corretor, ds_email_corretor, tel_corretor, nmr_crf) VALUES (5, 'Yuri Alberto Rodrigues', 'yurialbertorodrigues@gmail.com', '(XX)5432-9876', 54321)";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
