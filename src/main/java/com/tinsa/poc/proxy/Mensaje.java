package com.tinsa.poc.proxy;

/**
 * Clase Mensaje. Representa el mensaje de entrada al proceso de notificación.
 */
public class Mensaje {
	
	/** Destinatario. */
	private String destino;
	
	/** Tipo de notificación a enviar (SMS, Mail, FAX...). */
	private String tipoEnvio;
	
	/** Contenido del mensaje a notificar. */
	private String mensaje;
	
	/**
	 * Constructor de la clase Mensaje.
	 *
	 * @param destino
	 * @param tipoEnvio
	 * @param mensaje
	 */
	public Mensaje(String destino, String tipoEnvio, String mensaje) {
		super();
		this.destino = destino;
		this.tipoEnvio = tipoEnvio;
		this.mensaje = mensaje;
	}
	
	/**
	 * Devuelve la propiedad destino.
	 *
	 * @return destino
	 */
	public String getDestino() {
		return destino;
	}
	
	/**
	 * Informa la propiedad destino.
	 *
	 * @param destino
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	/**
	 * Devuelve la propiedad tipoEnvio.
	 *
	 * @return tipoEnvio
	 */
	public String getTipoEnvio() {
		return tipoEnvio;
	}
	
	/**
	 * Informa la propiedad tipoEnvio.
	 *
	 * @param tipoEnvio
	 */
	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	
	/**
	 * Devuelve la propiedad mensaje.
	 *
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}
	
	/**
	 * Informa la propiedad mensaje.
	 *
	 * @param mensaje
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

}
