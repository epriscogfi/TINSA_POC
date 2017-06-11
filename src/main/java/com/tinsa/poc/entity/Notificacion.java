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
	private Integer estado;
	
	
	protected Notificacion() {}

	public Notificacion(String sendTo, String tipoEnvio, String mensaje, Integer estado) {
		this.destino = sendTo;
		this.tipoEnvio = tipoEnvio;
		this.mensaje = mensaje;
		this.estado = estado;
	}
	
	@Override
	public String toString(){
		return String.format("Notificación [id=%d, destino=%s, tipoEnvio=%s, mensaje=%s, estado=%d]", id, destino, tipoEnvio, mensaje);
	}
}
