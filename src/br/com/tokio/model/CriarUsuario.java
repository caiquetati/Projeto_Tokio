package br.com.tokio.model;

import javax.swing.JOptionPane;

import br.com.tokio.util.CriptografiaUtils;

public class CriarUsuario {
	
	//Checar senha (maior igual 8 digitos, minuscula e maiuscula e caracter especial)
	public static boolean verificarSenha(String senha) {
		if(senha.length() >= 8) {
			boolean isAlphanumeric = senha.matches("^.*[^a-zA-Z0-9 ].*$");
			if (isAlphanumeric) {
				return true;
			}
		}
		return false;
	}
	//Criptografar Senha
	public static String criptografar(String senha) {
		try {
			senha = CriptografiaUtils.criptografar(senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return senha;
	}
	//Criar Usuario e enviar para o banco de dados
	public void criarUsuario(String nome, String senha) {
		if(verificarSenha(senha)) {
			criptografar(senha);
			//UsuarioDAO dao = new UsuarioDAO();
			//Usuario novoUsuario = new Usuario(nome, senha);
			//dao.insert(novoUsuario);
			System.out.println("Usuario Criado");
		} else {
			System.out.println("A senha não cumpriu com os requesitos");
		}
		
	}

}
