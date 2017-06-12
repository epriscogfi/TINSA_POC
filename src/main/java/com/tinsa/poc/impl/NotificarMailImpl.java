package com.tinsa.poc.impl;

import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.proxy.Mensaje;

public class NotificarMailImpl implements NotificarMensaje {

	@SuppressWarnings("unused")
	private Mensaje msg;
	
	public NotificarMailImpl(Mensaje msg) {
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
