package com.tinsa.poc.resource;

// TODO: Auto-generated Javadoc
/**
 * The Class ResultadoNotificar.
 */
public class ResultadoNotificar {

	/** The id mensaje. */
	private Long idMensaje;
	
	/** The estado mensaje. */
	private int estadoMensaje;
	
	/**
	 * Instantiates a new resultado notificar.
	 *
	 * @param idMensaje the id mensaje
	 * @param estadoMensaje the estado mensaje
	 */
	public ResultadoNotificar(Long idMensaje, int estadoMensaje) {
		super();
		this.idMensaje = idMensaje;
		this.estadoMensaje = estadoMensaje;
	}
	
	/**
	 * Gets the id mensaje.
	 *
	 * @return the id mensaje
	 */
	public Long getIdMensaje() {
		return idMensaje;
	}
	
	/**
	 * Sets the id mensaje.
	 *
	 * @param idMensaje the new id mensaje
	 */
	public void setIdMensaje(Long idMensaje) {
		this.idMensaje = idMensaje;
	}
	
	/**
	 * Gets the estado mensaje.
	 *
	 * @return the estado mensaje
	 */
	public int getEstadoMensaje() {
		return estadoMensaje;
	}
	
	/**
	 * Sets the estado mensaje.
	 *
	 * @param estadoMensaje the new estado mensaje
	 */
	public void setEstadoMensaje(int estadoMensaje) {
		this.estadoMensaje = estadoMensaje;
	}
	
	
}
