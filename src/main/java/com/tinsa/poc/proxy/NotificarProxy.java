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

// TODO: Auto-generated Javadoc
/**
 * The Class NotificarProxy.
 */
@Service("notificarProxy")
public class NotificarProxy implements NotificarMensaje{
	
	/** The notificar. */
	private NotificarMensaje notificar;
	
	/** The msg. */
	private Mensaje msg;
	
	/** The estado. */
	private int estado;
	
	/** The id. */
	private Long id;
	
	
	/** The notificacion repo. */
	@Autowired
	@Qualifier("notificacionRepository")
	private NotificacionRepository notificacionRepo;
	
	
	/**
	 * Instantiates a new notificar proxy.
	 */
	public NotificarProxy() {
		super();
	}
	
	/**
	 * Infer impl.
	 *
	 * @param msg the msg
	 * @return the notificar proxy
	 */
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


	/* (non-Javadoc)
	 * @see com.tinsa.poc.interfaces.NotificarMensaje#tratarMensaje()
	 */
	@Override
	public void tratarMensaje() {
		
		notificar.tratarMensaje();
		
		this.estado = notificar.getResult() == Constantes.RESULT_OK ? Constantes.ESTADO_ENVIADO : Constantes.ESTADO_NO_ENVIADO; 
		
		Notificacion notificacion = new Notificacion(msg.getDestino(), msg.getTipoEnvio(), msg.getMensaje(), estado);
		notificacionRepo.save( notificacion);
		
		this.id = notificacion.getId();
		
		System.out.println(notificacionRepo.findAll().toString());
	}
	
	/* (non-Javadoc)
	 * @see com.tinsa.poc.interfaces.NotificarMensaje#getResult()
	 */
	@Override
	public int getResult() {
		return estado;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	
}
