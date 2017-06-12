package com.tinsa.poc.impl;

import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.proxy.Mensaje;

public class NotificarWatchaImpl implements NotificarMensaje {

	@SuppressWarnings("unused")
	private Mensaje msg;
	
	public NotificarWatchaImpl(Mensaje msg) {
		super();
		this.msg = msg;
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
