package com.tinsa.poc.proxy;

// TODO: Auto-generated Javadoc
/**
 * The Class Mensaje.
 */
public class Mensaje {
	
	/** The destino. */
	private String destino;
	
	/** The tipo envio. */
	private String tipoEnvio;
	
	/** The mensaje. */
	private String mensaje;
	
	/**
	 * Instantiates a new mensaje.
	 *
	 * @param sendTo the send to
	 * @param tipoEnvio the tipo envio
	 * @param mensaje the mensaje
	 */
	public Mensaje(String sendTo, String tipoEnvio, String mensaje) {
		super();
		this.destino = sendTo;
		this.tipoEnvio = tipoEnvio;
		this.mensaje = mensaje;
	}
	
	/**
	 * Gets the destino.
	 *
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}
	
	/**
	 * Sets the destino.
	 *
	 * @param destino the new destino
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	/**
	 * Gets the tipo envio.
	 *
	 * @return the tipo envio
	 */
	public String getTipoEnvio() {
		return tipoEnvio;
	}
	
	/**
	 * Sets the tipo envio.
	 *
	 * @param tipoEnvio the new tipo envio
	 */
	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	
	/**
	 * Gets the mensaje.
	 *
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}
	
	/**
	 * Sets the mensaje.
	 *
	 * @param mensaje the new mensaje
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

}
