package com.tinsa.poc.proxy;

import com.tinsa.poc.impl.NotificarFAXImpl;
import com.tinsa.poc.impl.NotificarMailImpl;
import com.tinsa.poc.impl.NotificarSMSImpl;
import com.tinsa.poc.impl.NotificarWatchaImpl;
import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.utils.Constantes;

public class NotificarProxy implements NotificarMensaje{
	
	private NotificarMensaje notificar;
	private Mensaje msg;
	
	public NotificarProxy(Mensaje msg) {
		super();
		
		this.msg = msg;
		
		switch (msg.getTipoEnvio()){
		
		case Constantes.MAIL: 
			this.notificar = new NotificarMailImpl(msg);
			break;
			
		case Constantes.SMS:
			this.notificar = new NotificarSMSImpl(msg);
			break;
		
		case Constantes.FAX:
			this.notificar = new NotificarFAXImpl(msg);
			break;
			
		case Constantes.WHATCHA:
			this.notificar = new NotificarWatchaImpl(msg);
			break;
		
		
		};
	}


	@Override
	public void tratarMensaje() {
		// TODO Auto-generated method stub
		
		this.notificar.tratarMensaje();
		
		//NotificacionRespository notifRepository = new NotificacionRespository ();
	}

}
