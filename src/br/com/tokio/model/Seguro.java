package br.com.tokio.model;

public class Seguro {
	
	private int idSeguro, vlSeguro;
	private String tipoSeguro, planoSeguro, tipoAssistenca;
	
	public Seguro() {
		
	}
	public Seguro(int idSeguro, String tipoSeguro, String planoSeguro, String tipoAssistenca, int vlSeguro) {
		this.idSeguro = idSeguro;
		this.tipoSeguro = tipoSeguro;
		this.planoSeguro = planoSeguro;
		this.tipoAssistenca = tipoAssistenca;
		this.vlSeguro = vlSeguro;
	}

	public int getIdSeguro() {
		return idSeguro;
	}

	public void setIdSeguro(int idSeguro) {
		this.idSeguro = idSeguro;
	}
	
	public String getTipoAssistenca() {
		return tipoAssistenca;
	}
	
	public void setTipoAssistenca(String tipoAssistenca) {
		this.tipoAssistenca = tipoAssistenca;
	}
	
	public int getVlSeguro() {
		return vlSeguro;
	}

	public void setVlSeguro(int vlSeguro) {
		this.vlSeguro = vlSeguro;
	}

	public String getTipoSeguro() {
		return tipoSeguro;
	}

	public void setTipoSeguro(String tipSeguro) {
		this.tipoSeguro = tipSeguro;
	}

	public String getPlanoSeguro() {
		return planoSeguro;
	}

	public void setPlanoSeguro(String planoSeguro) {
		this.planoSeguro = planoSeguro;
	}
	

}
