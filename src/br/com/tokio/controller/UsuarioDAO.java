package br.com.tokio.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.tokio.connection.ConnectionFactory;
import br.com.tokio.model.Seguro;
import br.com.tokio.model.Usuario;
import br.com.tokio.util.CriptografiaAES;

public class UsuarioDAO {
	// Atributos
	private Connection conexao;

	// Construtor
	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	// Checar senha (maior igual 8 digitos, minuscula e maiuscula e caracter
	// especial)
	public static boolean verificarSenha(String senha) {
		if (senha.length() >= 8) {
			boolean isAlphanumeric = senha.matches("^.*[^a-zA-Z0-9 ].*$");
			if (isAlphanumeric) {
				return true;
			}
		}
		return false;
	}

	// Criptografar Senha
	public static String criptografar(String senha) {
		try {
			senha = CriptografiaAES.criptografar(senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return senha;
	}

	// Metodo Criar Usuario e enviar para o banco de dados
	public void insert(Usuario usuario) {
		String sql = "INSERT INTO t_ceap_cliente (nmr_cpf_cliente, nm_cliente, senha_cliente, dt_nascimento_cliente, ds_sexo_cliente, tel_cliente) values (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			// Complemento da Query
			stmt.setString(1, usuario.getCpf());
			stmt.setString(2, usuario.getNome());
			stmt.setString(3, criptografar(usuario.getSenha()));
			stmt.setString(4, usuario.getDtNascimento());
			stmt.setString(5, usuario.getSexo());
			stmt.setString(6, usuario.getTelefone());
			// Executa a query
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Usuario Criado");

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
				usuario.setDtNascimento(rs.getString("DT_NASCIMENTO_CLIENTE"));
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
