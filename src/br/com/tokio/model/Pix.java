package br.com.tokio.model;

import java.util.Date;

public class Pix extends FormaPagamento{
	//Atributos
	private int codPix;
	private Date dtEmissao, dtPagamento, dtExpiracao;
	//Construtor
	public Pix(int codPix, Date dtEmissao, Date dtPagamento, Date dtExpiracao) {
		super();
		this.codPix = codPix;
		this.dtEmissao = dtEmissao;
		this.dtPagamento = dtPagamento;
		this.dtExpiracao = dtExpiracao;
	}
	public int getCodPix() {
		return codPix;
	}
	public void setCodPix(int codPix) {
		this.codPix = codPix;
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
