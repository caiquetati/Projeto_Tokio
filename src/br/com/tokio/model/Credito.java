package br.com.tokio.model;

import java.util.Date;

public class Credito extends FormaPagamento{
	//Atributos
	private int codCredito, nmrCartao, nmrCVV, qtdParcelas;
	private Date validade;
	//Construtor
	public Credito(int codCredito, int nmrCartao, int nmrCVV, int qtdParcelas, Date validade) {
		this.codCredito = codCredito;
		this.nmrCartao = nmrCartao;
		this.nmrCVV = nmrCVV;
		this.qtdParcelas = qtdParcelas;
		this.validade = validade;
	}
	//Getters and setters
	public int getCodCredito() {
		return codCredito;
	}
	public void setCodCredito(int codCredito) {
		this.codCredito = codCredito;
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
	public int getQtdParcelas() {
		return qtdParcelas;
	}
	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	

}
