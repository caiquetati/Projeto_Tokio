package br.com.tokio.testes;

import br.com.tokio.util.CriptografiaAES;

public class Teste {

	public static void main(String[] args) {
		String texto = "fiap123";
		System.out.println(texto);
		String textoC = CriptografiaAES.criptografar(texto);
		System.out.println(textoC);
		String textoD = CriptografiaAES.descriptografar(textoC);
		System.out.println(textoD);
	}

}
