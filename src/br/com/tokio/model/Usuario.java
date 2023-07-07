package br.com.tokio.model;

public class Usuario {
	//Atributos
	private int cpf, telefone, idSeguro;
	private String nome, senha, sexo, dtNascimento;
	//private Date dtNascimento;
	//Construtor Vazio
	public Usuario() {
	}
	//Construtor
	public Usuario(int cpf, String nome, String senha, String dtNascimento, String sexo, int telefone) {
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
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public int getIdSeguro() {
		return idSeguro;
	}
	public void setIdSeguro(int idSeguro) {
		this.idSeguro = idSeguro;
	}
	
	

}
