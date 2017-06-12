package com.tinsa.poc.impl;

import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.proxy.Mensaje;

public class NotificarFAXImpl implements NotificarMensaje {

	
	private Mensaje notificacion;
	
	public NotificarFAXImpl(Mensaje msg) {
		super();
		this.notificacion = msg;
	}

	@Override
	public void tratarMensaje() {
		
	}

	@Override
	public int getResult() {
		return 0;
	}

}
