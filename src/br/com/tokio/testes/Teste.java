package br.com.tokio.testes;


import br.com.tokio.controller.UsuarioDAO;
import br.com.tokio.model.Usuario;

public class Teste {

	public static void main(String[] args) {
		UsuarioDAO dao = new UsuarioDAO();
		Usuario novoUsuario = new Usuario(574162138,"Arthur","Fiap@123", "11082005", "masc", 181134165);
		dao.insert(novoUsuario);
		System.out.println(dao.selectAll());
	}

}
