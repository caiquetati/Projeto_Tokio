package br.com.tokio.model;

import java.sql.Date;

public class Usuario {
	//Atributos
	private String cpf, nome, senha, sexo, telefone;
	private Date dtNascimento;
	
	//Construtor Vazio
	public Usuario() {
	}
	//Construtor
	public Usuario(String cpf, String nome, String senha, Date dtNascimento, String sexo, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
		this.telefone = telefone;
	}
	//Getters and Setters
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
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
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	

}
