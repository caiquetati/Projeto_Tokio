package br.com.tokio.model;

import java.util.Date;

public class Debito {
	//Atributos
	private int codDebito, nmrCartao, nmrCVV;
	private Date validade;
	//Construtor
	public Debito(int codigoDebito, int numeroCartao, int cvv, Date validade) {
		this.codDebito = codigoDebito;
		this.nmrCartao = numeroCartao;
		this.nmrCVV = cvv;
		this.validade = validade;
	}
	//Getters and Setters
	public int getCodDebito() {
		return codDebito;
	}
	public void setCodDebito(int codDebito) {
		this.codDebito = codDebito;
	}
	public int getNmrCartao() {
		return nmrCartao;
	}
	public void setNmrCartao(int nmrCartao) {
		this.nmrCartao = nmrCartao;
	}
	public int getNmrCVV() {
		return nmrCVV;
	}
	public void setNmrCVV(int nmrCVV) {
		this.nmrCVV = nmrCVV;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	
	

}
