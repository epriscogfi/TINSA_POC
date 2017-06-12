package com.tinsa.poc.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tinsa.poc.entity.Notificacion;
import com.tinsa.poc.impl.NotificarFAXImpl;
import com.tinsa.poc.impl.NotificarMailImpl;
import com.tinsa.poc.impl.NotificarSMSImpl;
import com.tinsa.poc.impl.NotificarWatchaImpl;
import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.repository.NotificacionRepository;
import com.tinsa.poc.utils.Constantes;

@Service("notificarProxy")
public class NotificarProxy implements NotificarMensaje{
	
	private NotificarMensaje notificar;
	private Mensaje msg;
	
	
	@Autowired
	@Qualifier("notificacionRepository")
	private NotificacionRepository notificacionRepo;
	
	
	public NotificarProxy() {
		super();
	}
	
	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public NotificarProxy inferImpl(Mensaje msg) {
		
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
		
		return this;
	}


	@Override
	public void tratarMensaje() {
		// TODO Auto-generated method stub
		
		notificar.tratarMensaje();
		
		int estado = notificar.getResult() == Constantes.RESULT_OK ? Constantes.ESTADO_ENVIADO : Constantes.ESTADO_NO_ENVIADO; 
		
		Notificacion notificacion = new Notificacion(msg.getDestino(), msg.getTipoEnvio(), msg.getMensaje(), estado);
		notificacionRepo.save( notificacion);
		
		Iterable<Notificacion> notificaciones = notificacionRepo.findAll();
		System.out.println(notificaciones.toString());
	}

	}
