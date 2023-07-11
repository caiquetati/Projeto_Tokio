package br.com.tokio.main;

import br.com.tokio.controller.CorretorDAO;
import br.com.tokio.model.Usuario;
import br.com.tokio.view.SplashScreen;

public class Main {

	Usuario usuarioAtual;
	
	public static void main(String[] args) {
		CorretorDAO corretores = new CorretorDAO();
		corretores.Gerar();
		SplashScreen tela = new SplashScreen();
		tela.frame.setVisible(true);
	}

}
