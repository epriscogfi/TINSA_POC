package com.tinsa.poc.impl;

import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.proxy.Mensaje;

// TODO: Auto-generated Javadoc
/**
 * The Class NotificarMailImpl.
 */
public class NotificarMailImpl implements NotificarMensaje {

	/** The msg. */
	@SuppressWarnings("unused")
	private Mensaje msg;
	
	/**
	 * Instantiates a new notificar mail impl.
	 *
	 * @param msg the msg
	 */
	public NotificarMailImpl(Mensaje msg) {
		super();
		this.msg = msg;
	}

	/* (non-Javadoc)
	 * @see com.tinsa.poc.interfaces.NotificarMensaje#tratarMensaje()
	 */
	@Override
	public void tratarMensaje() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.tinsa.poc.interfaces.NotificarMensaje#getResult()
	 */
	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		return 0;
	}

}
