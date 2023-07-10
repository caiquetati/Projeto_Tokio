package br.com.tokio.model;

public class Seguro {
	
	private Long idSeguro;
	private int vlSeguro;
	private String tipoSeguro, planoSeguro;
	private int pg;
	private Corretor idCorretor;
	private Usuario usuario;
	
	public Seguro() {
		
	}
	public Seguro(Long idSeguro, String tipoSeguro, String planoSeguro, int vlSeguro, int pg, Corretor idCorretor, Usuario usuario) {
		this.idSeguro = idSeguro;
		this.tipoSeguro = tipoSeguro;
		this.planoSeguro = planoSeguro;
		this.vlSeguro = vlSeguro;
		this.pg = pg;
		this.idCorretor = idCorretor;
		this.usuario = usuario;
	}

	public Long getIdSeguro() {
		return idSeguro;
	}

	public void setIdSeguro(Long idSeguro) {
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
	public int getPg() {
		return pg;
	}
	public void setPg(int pg) {
		this.pg = pg;
	}
	public Corretor getIdCorretor() {
		return idCorretor;
	}
	public void setIdCorretor(Corretor idCorretor) {
		this.idCorretor = idCorretor;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
