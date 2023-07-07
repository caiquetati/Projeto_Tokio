package br.com.tokio.model;

import java.sql.Date;

public class Usuario {
	//Atributos
	private int cpf, telefone;
	private String nome, senha, sexo;
	private Date dtNascimento;
	
	//Construtor Vazio
	public Usuario() {
	}
	//Construtor
	public Usuario(int cpf, String nome, String senha, Date dtNascimento, String sexo, int telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
		this.telefone = telefone;
	}
	//Getters and Setters
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public java.sql.Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	

}
