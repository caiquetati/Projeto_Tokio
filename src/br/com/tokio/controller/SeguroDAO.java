package br.com.tokio.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	// Metodo Criar Usuario e enviar para o banco de dados
	public void insert(Seguro seguro, FormaPagamento pg, Corretor corretor, Usuario usuario) {
		String sql = "INSERT INTO t_ceap_seguro (id_seguro, ds_tipo_seguro, ds_plano_seguro, T_CEAP_PAGAMENTO_DS_FORMA_PAGAMENTO, T_CEAP_CORRETOR_ID_CORRETOR, T_CEAP_CLIENTE_NMR_CPF_CLIENTE) values (?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			// Complemento da Query
			stmt.setLong(1, seguro.getIdSeguro());
			stmt.setString(2, seguro.getTipoSeguro());
			stmt.setString(3, seguro.getPlanoSeguro());
			stmt.setInt(4, pg.getFormaPagamento());
			stmt.setInt(5, corretor.getId());
			stmt.setString(6, usuario.getCpf());
			// Executa a query
			stmt.execute();
			stmt.close();
			System.out.println("Seguro Criado");
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
				Seguro seguro = new Seguro();
				seguro.setIdSeguro(rs.getLong("id_seguro"));
				seguro.setTipoSeguro(rs.getString("ds_tipo_seguro"));
				seguro.setPlanoSeguro(rs.getString("ds_plano_seguro"));
				seguro.setVlSeguro(rs.getInt("vl_seguro"));
				seguro.setPg(rs.getInt("forma_pagamento"));
				//seguro.setIdCorretor(rs.getInt("Corretor"));
				//listaUsuarios.add(seguro);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaUsuarios;
	}

	public Usuario selectById(int id) {
		Usuario usuario = null;
		String sql = "select * from t_ceap_cliente where nmr_cpf_cliente=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				usuario = new Usuario();
				usuario.setCpf(rs.getString("NMR_CPF_CLIENTE"));
				usuario.setNome(rs.getString("NM_CLIENTE"));
				usuario.setSenha(rs.getString("SENHA_CLIENTE"));
				usuario.setDtNascimento(rs.getString("DT_NASCIMENTO_CLIENTE"));
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
