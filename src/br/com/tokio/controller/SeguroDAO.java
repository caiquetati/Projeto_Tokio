package br.com.tokio.controller;

import java.sql.Connection;

import br.com.tokio.connection.ConnectionFactory;
import br.com.tokio.model.Corretor;
import br.com.tokio.model.FormaPagamento;
import br.com.tokio.model.Seguro;
import br.com.tokio.model.Usuario;

public class SeguroDAO {
	// Conexão
	private Connection conexao;
	//Construtor
	public SeguroDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}
	public void insert (Seguro seguro, FormaPagamento pagamento, Corretor corretor, Usuario usuario) {
		
	}

}
