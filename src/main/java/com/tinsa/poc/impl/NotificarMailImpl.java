package com.tinsa.poc.impl;

import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.proxy.Mensaje;

public class NotificarMailImpl implements NotificarMensaje {

	private Mensaje notificacion;
	
	public NotificarMailImpl(Mensaje msg) {
		super();
		this.notificacion = msg;
	}

	@Override
	public void tratarMensaje() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		return 0;
	}

}
