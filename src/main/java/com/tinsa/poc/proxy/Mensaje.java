package com.tinsa.poc.proxy;

public class Mensaje {
	
	private Long id;
	private String destino;
	private String tipoEnvio;
	private String mensaje;
	
	public Mensaje(Long id, String sendTo, String tipoEnvio, String mensaje) {
		super();
		this.id = id;
		this.destino = sendTo;
		this.tipoEnvio = tipoEnvio;
		this.mensaje = mensaje;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getTipoEnvio() {
		return tipoEnvio;
	}
	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
