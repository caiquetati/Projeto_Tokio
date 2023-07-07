package br.com.tokio.testes;

import br.com.tokio.controller.UsuarioDAO;
import br.com.tokio.model.Seguro;
import br.com.tokio.model.Usuario;

public class Teste {

	public static void main(String[] args) {
		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuario = new Usuario(454584, "Otavio", "Fiap@123", "16/06/2004", "masculino", 4875);
		Seguro seguro = new Seguro(1,"casa","basico",100000);
		dao.insert(usuario, seguro);
	}

}
