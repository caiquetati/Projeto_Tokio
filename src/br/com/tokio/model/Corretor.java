package br.com.tokio.model;

public class Corretor {
	//Atributos
	private int id, telefone, crf;	
	private String nome, email;
	
	
	//Construtor 
	public Corretor(int id, String nome, String email, int telefone, int crf) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.crf = crf;
	}
	//Getters and Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public int getCrf() {
		return crf;
	}


	public void setCrf(int crf) {
		this.crf = crf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
}
