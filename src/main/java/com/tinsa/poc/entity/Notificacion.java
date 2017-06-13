package com.tinsa.poc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Notificacion.
 */
@Entity
public class Notificacion {
	

	/** The id. */
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	/** The destino. */
	private String destino;
    
	/** The tipo envio. */
	private String tipoEnvio;
    
	/** The mensaje. */
	private String mensaje;
    
	/** The estado. */
	private Integer estado;
	
	
	/**
	 * Instantiates a new notificacion.
	 */
	protected Notificacion() {}

	/**
	 * Instantiates a new notificacion.
	 *
	 * @param sendTo the send to
	 * @param tipoEnvio the tipo envio
	 * @param mensaje the mensaje
	 * @param estado the estado
	 */
	public Notificacion(String sendTo, String tipoEnvio, String mensaje, Integer estado) {
		this.destino = sendTo;
		this.tipoEnvio = tipoEnvio;
		this.mensaje = mensaje;
		this.estado = estado;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
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

	/**
	 * Gets the estado.
	 *
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Sets the estado.
	 *
	 * @param estado the new estado
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return String.format("Notificación [id=%d, destino=%s, tipoEnvio=%s, mensaje=%s, estado=%d]", id, destino, tipoEnvio, mensaje, estado);
	}
}
