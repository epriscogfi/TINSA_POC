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
	private int estado;
	private Long id;
	
	
	@Autowired
	@Qualifier("notificacionRepository")
	private NotificacionRepository notificacionRepo;
	
	
	public NotificarProxy() {
		super();
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
		
		default:
			break;
		
		};
		
		return this;
	}


	@Override
	public void tratarMensaje() {
		
		notificar.tratarMensaje();
		
		this.estado = notificar.getResult() == Constantes.RESULT_OK ? Constantes.ESTADO_ENVIADO : Constantes.ESTADO_NO_ENVIADO; 
		
		Notificacion notificacion = new Notificacion(msg.getDestino(), msg.getTipoEnvio(), msg.getMensaje(), estado);
		notificacionRepo.save( notificacion);
		
		this.id = notificacion.getId();
		
		System.out.println(notificacionRepo.findAll().toString());
	}
	
	@Override
	public int getResult() {
		return estado;
	}
	
	public Long getId() {
		return id;
	}

	
}
