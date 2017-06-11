package com.tinsa.poc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notificacion {
	

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String destino;
	private String tipoEnvio;
	private String mensaje;
	
	
	protected Notificacion() {}

	public Notificacion(String sendTo, String tipoEnvio, String mensaje) {
		this.destino = sendTo;
		this.tipoEnvio = tipoEnvio;
		this.mensaje = mensaje;
	}
	
	@Override
	public String toString(){
		return String.format("Notificación [id=%d, destino=%s, tipoEnvio=%s, mensaje=%s]", id, destino, tipoEnvio, mensaje);
	}
}
