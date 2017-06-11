package com.tinsa.poc.impl;

import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.proxy.Mensaje;

public class NotificarMailImpl implements NotificarMensaje {

	private Mensaje notificacion;
	
	public NotificarMailImpl(Mensaje notificacion) {
		super();
		this.notificacion = notificacion;
	}

	@Override
	public void tratarMensaje() {
		// TODO Auto-generated method stub
		
	}

}
