package com.tinsa.poc.proxy;

import com.tinsa.poc.impl.NotificarFAXImpl;
import com.tinsa.poc.impl.NotificarMailImpl;
import com.tinsa.poc.impl.NotificarSMSImpl;
import com.tinsa.poc.impl.NotificarWatchaImpl;
import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.utils.Constantes;

public class NotificarProxy implements NotificarMensaje{
	
	private NotificarMensaje notificar;
	private Notificacion notificacion;
	
	public NotificarProxy(Notificacion notificacion) {
		super();
		
		this.notificacion = notificacion;
		
		switch (notificacion.getTipoEnvio()){
		
		case Constantes.MAIL: 
			this.notificar = new NotificarMailImpl(notificacion);
			break;
			
		case Constantes.SMS:
			this.notificar = new NotificarSMSImpl(notificacion);
			break;
		
		case Constantes.FAX:
			this.notificar = new NotificarFAXImpl(notificacion);
			break;
			
		case Constantes.WHATCHA:
			this.notificar = new NotificarWatchaImpl(notificacion);
			break;
		
		
		};
	}


	@Override
	public void tratarMensaje() {
		// TODO Auto-generated method stub
		
		this.notificar.tratarMensaje();
		
		// TODO Guardar mensaje en BBDD
		
		
	}

}
