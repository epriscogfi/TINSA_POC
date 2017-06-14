package com.tinsa.poc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase Notificacion, es una entidad que se corresponde con la tabla NOTIFICACION
 */
@Entity
public class Notificacion {
	

	/** Propiedad id,  corresponde al campo id de la tabla. Autogenerado.*/
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	/** Propiedad destino,  corresponde al campo destino de la tabla. */
	private String destino;
    
	/** Propiedad tipoEnvio,  corresponde al campo tipoEnvio de la tabla.  */
	private String tipoEnvio;
    
	/** Propiedad mensaje,  corresponde al campo mensaje de la tabla. */
	private String mensaje;
    
	/** Propiedad estado,  corresponde al campo estado de la tabla. */
	private Integer estado;
	
	
	/**
	 * Constructor por defecto. Instancia Notificacion.
	 */
	protected Notificacion() {}

	/**
	 * Constructor. Instancia la clase notificación informando sus parámetros.
	 *
	 * @param destino destinatario de la notificacion
	 * @param tipoEnvio tipo de envio de la notificacion (SMS, mail, FAX...)
	 * @param mensaje mensaje que se quiere notificar
	 * @param estado estado de la notificacion
	 */
	public Notificacion(String destino, String tipoEnvio, String mensaje, Integer estado) {
		this.destino = destino;
		this.tipoEnvio = tipoEnvio;
		this.mensaje = mensaje;
		this.estado = estado;
	}
	
	/**
	 * Recupera la propiedad id.
	 *
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Informa la propiedad id.
	 *
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Recupera la propiedad destino.
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
	 * Recupera la propiedad tipoEnvio.
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
	 * Recupera la propiedad mensaje.
	 *
	 * @return mensaje
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

	/**
	 * Recupera la propiedad estado.
	 *
	 * @return estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Informa la propiedad estado.
	 *
	 * @param estado
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
