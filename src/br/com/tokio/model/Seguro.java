package br.com.tokio.model;

public class Seguro {
	
	private int idSeguro, vlSeguro;
	private String tipoSeguro, planoSeguro, tipoAssistencia;
	
	public Seguro() {
		
	}
	public Seguro(int idSeguro, String tipoSeguro, String planoSeguro, String tipoAssistencia,int vlSeguro) {
		this.idSeguro = idSeguro;
		this.tipoSeguro = tipoSeguro;
		this.planoSeguro = planoSeguro;
		this.tipoAssistencia = tipoAssistencia;
		this.vlSeguro = vlSeguro;
	}

	public int getIdSeguro() {
		return idSeguro;
	}

	public void setIdSeguro(int idSeguro) {
		this.idSeguro = idSeguro;
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
	public String getTipoAssistencia() {
		return tipoAssistencia;
	}
	public void setTipoAssistencia(String tipoAssistencia) {
		this.tipoAssistencia = tipoAssistencia;
	}
	

}
