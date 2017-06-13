package com.tinsa.poc.impl;

import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.proxy.Mensaje;

// TODO: Auto-generated Javadoc
/**
 * The Class NotificarFAXImpl.
 */
public class NotificarFAXImpl implements NotificarMensaje {

	
	/** The msg. */
	@SuppressWarnings("unused")
	private Mensaje msg;
	
	/**
	 * Instantiates a new notificar FAX impl.
	 *
	 * @param msg the msg
	 */
	public NotificarFAXImpl(Mensaje msg) {
		super();
		this.msg = msg;
	}

	/* (non-Javadoc)
	 * @see com.tinsa.poc.interfaces.NotificarMensaje#tratarMensaje()
	 */
	@Override
	public void tratarMensaje() {
		
	}

	/* (non-Javadoc)
	 * @see com.tinsa.poc.interfaces.NotificarMensaje#getResult()
	 */
	@Override
	public int getResult() {
		return 0;
	}

}
