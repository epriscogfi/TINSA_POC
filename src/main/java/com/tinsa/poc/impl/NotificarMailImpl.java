package com.tinsa.poc.impl;

import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.proxy.Notificacion;

public class NotificarMailImpl implements NotificarMensaje {

	private Notificacion notificacion;
	
	public NotificarMailImpl(Notificacion notificacion) {
		super();
		this.notificacion = notificacion;
	}

	@Override
	public void tratarMensaje() {
		// TODO Auto-generated method stub
		
	}

}
