package com.tinsa.poc.resource;

/**
 * Clase ResultadoNotificar. Representará la información a devolver por la operación POST /notificar 
 */
public class ResultadoNotificar {

	/** Id del mensaje. */
	private Long idMensaje;
	
	/** Estado del mensaje. */
	private int estadoMensaje;
	
	/**
	 * Constructor de la clase.
	 *
	 * @param idMensaje 
	 * @param estadoMensaje
	 */
	public ResultadoNotificar(Long idMensaje, int estadoMensaje) {
		super();
		this.idMensaje = idMensaje;
		this.estadoMensaje = estadoMensaje;
	}
	
	/**
	 * Devuelve la propiedad idMensaje.
	 *
	 * @return idMensaje
	 */
	public Long getIdMensaje() {
		return idMensaje;
	}
	
	/**
	 * Informa la propiedad idMensaje.
	 *
	 * @param idMensaje
	 */
	public void setIdMensaje(Long idMensaje) {
		this.idMensaje = idMensaje;
	}
	
	/**
	 * Devuelve el estado del mensaje notificado.
	 *
	 * @return estadoMensaje
	 */
	public int getEstadoMensaje() {
		return estadoMensaje;
	}
	
	/**
	 * Informa el estado del mensaje notificado.
	 *
	 * @param estadoMensaje
	 */
	public void setEstadoMensaje(int estadoMensaje) {
		this.estadoMensaje = estadoMensaje;
	}
	
	
}
