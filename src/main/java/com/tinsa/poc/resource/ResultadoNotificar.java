package com.tinsa.poc.resource;

public class ResultadoNotificar {

	private Long idMensaje;
	private int estadoMensaje;
	
	public ResultadoNotificar(Long idMensaje, int estadoMensaje) {
		super();
		this.idMensaje = idMensaje;
		this.estadoMensaje = estadoMensaje;
	}
	
	public Long getIdMensaje() {
		return idMensaje;
	}
	public void setIdMensaje(Long idMensaje) {
		this.idMensaje = idMensaje;
	}
	public int getEstadoMensaje() {
		return estadoMensaje;
	}
	public void setEstadoMensaje(int estadoMensaje) {
		this.estadoMensaje = estadoMensaje;
	}
	
	
}
