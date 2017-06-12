package com.tinsa.poc.impl;

import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.proxy.Mensaje;

public class NotificarFAXImpl implements NotificarMensaje {

	
	@SuppressWarnings("unused")
	private Mensaje msg;
	
	public NotificarFAXImpl(Mensaje msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void tratarMensaje() {
		
	}

	@Override
	public int getResult() {
		return 0;
	}

}
