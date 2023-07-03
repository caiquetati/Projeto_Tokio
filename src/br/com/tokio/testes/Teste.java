package br.com.tokio.testes;

import javax.swing.JOptionPane;

import br.com.tokio.model.CriarUsuario;

public class Teste {

	public static void main(String[] args) {
		String senha = JOptionPane.showInputDialog(null,"digite uma senha");
		
		boolean resp = CriarUsuario.verificarSenha(senha);
		JOptionPane.showMessageDialog(null, "A senha passou no teste: " + resp);
	}

}
