package br.com.tokio.testes;

import java.util.List;

import br.com.tokio.controller.CorretorDAO;
import br.com.tokio.controller.UsuarioDAO;
import br.com.tokio.model.Usuario;

public class Teste {

	public static void main(String[] args) {
		UsuarioDAO dao = new UsuarioDAO();
//		Date dtNascimento = new Date(2004,16,04);
//		Usuario usuario = new Usuario(59186, "tatibana", "Fiap@123", dtNascimento, "masculino", 85491);
//		dao.insert(usuario);
		
		CorretorDAO c = new CorretorDAO();
		c.Gerar();
		
		List<Usuario> listaUsuario = dao.selectAll();
		for(Usuario usuario : listaUsuario) {
			System.out.println(usuario.getCpf());
			System.out.println(usuario.getNome());
			System.out.println(usuario.getSenha());
		}
	}

}
