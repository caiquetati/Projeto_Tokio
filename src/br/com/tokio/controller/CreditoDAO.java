package br.com.tokio.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.tokio.connection.ConnectionFactory;
import br.com.tokio.model.Credito;
import br.com.tokio.model.Usuario;

public class CreditoDAO {

	// Atributos
	private Connection conexao;
	
	public CreditoDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	// Metodo para Criar um credito e enviar para o banco de dados
	//(ds_forma_pagamento, T_CEAP_DEBITO_COD_DEBITO, T_CEAP_CREDITO_COD_CREDITO, T_CEAP_PIX_COD_PIX, T_CEAP_BOLETO_COD_BOLETO) values (?, ?, ?, ?, ?)
	public void insert(Credito credito) {
		String sql = "INSERT INTO t_ceap_credito (cod_credito, nmr_cartao_credito, nmr_cvv_credito, dt_validade_credito, nmr_parcelas_credito) values (?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			// Complemento da Query
			stmt.setInt(1, 1);
			stmt.setInt(2, credito.getNmrCartao());
			stmt.setInt(3, credito.getNmrCVV());
			stmt.setDate(4, credito.getValidade());
			stmt.setInt(5, credito.getQtdParcelas());
			// Executa a query
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// Funcao para ver a lista de usuarios do banco de dados
	public List<Usuario> selectAll() {
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		String sql = "SELECT * FROM t_ceap_cliente order by NM_CLIENTE";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			// Loop que roda enquanto tiver dados na tabela
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setCpf(rs.getString("NMR_CPF_CLIENTE"));
				usuario.setNome(rs.getString("NM_CLIENTE"));
				usuario.setSenha(rs.getString("SENHA_CLIENTE"));
				usuario.setDtNascimento(rs.getDate("DT_NASCIMENTO_CLIENTE"));
				usuario.setSexo(rs.getString("DS_SEXO_CLIENTE"));
				usuario.setTelefone(rs.getString("TEL_CLIENTE"));
				listaUsuarios.add(usuario);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaUsuarios;
	}

	public Usuario selectById(String id) {
		Usuario usuario = null;
		String sql = "select * from t_ceap_cliente where nmr_cpf_cliente=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				usuario = new Usuario();
				usuario.setCpf(rs.getString("NMR_CPF_CLIENTE"));
				usuario.setNome(rs.getString("NM_CLIENTE"));
				usuario.setSenha(rs.getString("SENHA_CLIENTE"));
				usuario.setDtNascimento(rs.getDate("DT_NASCIMENTO_CLIENTE"));
				usuario.setSexo(rs.getString("DS_SEXO_CLIENTE"));
				usuario.setTelefone(rs.getString("TEL_CLIENTE"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuario;
	}

	// delete - Configurar
	public void delete(long id) {
		String sql = "delete from t_ceap_cliente where nmr_cpf_cliente=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// update - Configurar
	public void update(Usuario usuario) {
		String sql = "update t_ceap_cliente set nm_cliente=?, senha_cliente=? where nmr_cpf_cliente=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			stmt.setString(3, usuario.getCpf());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
