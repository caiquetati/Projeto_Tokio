package br.com.tokio.model;

import java.util.Date;

public class Boleto {
	//Atributos
	private int codBoleto;
	private Date dtEmissao, dtPagamento, dtExpiracao;	
	//Construtor
	public Boleto(int codBoleto, Date dtEmissao, Date dtPagamento, Date dtExpiracao) {
		super();
		this.codBoleto = codBoleto;
		this.dtEmissao = dtEmissao;
		this.dtPagamento = dtPagamento;
		this.dtExpiracao = dtExpiracao;
	}
	//Getters and Setters
	public int getCodBoleto() {
		return codBoleto;
	}
	public void setCodBoleto(int codBoleto) {
		this.codBoleto = codBoleto;
	}
	public Date getDtEmissao() {
		return dtEmissao;
	}
	public void setDtEmissao(Date dtEmissao) {
		this.dtEmissao = dtEmissao;
	}
	public Date getDtPagamento() {
		return dtPagamento;
	}
	public void setDtPagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}
	public Date getDtExpiracao() {
		return dtExpiracao;
	}
	public void setDtExpiracao(Date dtExpiracao) {
		this.dtExpiracao = dtExpiracao;
	}
	
	

}
