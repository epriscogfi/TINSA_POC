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
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString(){
		return String.format("Notificación [id=%d, destino=%s, tipoEnvio=%s, mensaje=%s, estado=%d]", id, destino, tipoEnvio, mensaje, estado);
	}
}
