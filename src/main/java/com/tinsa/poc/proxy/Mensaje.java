package com.tinsa.poc.proxy;

public class Notificacion {

	private String destino;
	private String tipoEnvio;
	private String mensaje;
	
	public Notificacion(String sendTo, String tipoEnvio, String mensaje) {
		super();
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

}
