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

/**
 * Clase NotificarProxy, que implementa el interfaz NotificarMensaje y es la parte Proxy, propiamente dicha, dentro del patrón Proxy implementado.
 */
@Service("notificarProxy")
public class NotificarProxy implements NotificarMensaje{
	
	/** Notificar, representará la implementación elegica para el envío de la notificación. */
	private NotificarMensaje notificar;
	
	/** Objeto Mensaje, que representa la información necesaria para llevar a cabo la notificación. */
	private Mensaje msg;
	
	/** Estado de la notificación. */
	private int estado;
	
	/** Id de la notificación. */
	private Long id;
	
	
	/** Repositorio. Provee las operaciones CRUD para la entidad Notificación. */
	@Autowired
	@Qualifier("notificacionRepository")
	private NotificacionRepository notificacionRepo;
	
	
	/**
	 * Constructor por defecto. Instancia la clase NotificarProxy.
	 */
	public NotificarProxy() {
		super();
	}
	
	/**
	 * Infiere la implementación que realizará la notificación en función del tipo de mensaje a enviar.
	 *
	 * @param msg Mensaje
	 * @return devuelve a sí mismo.
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
		
		// Envía la notificación por el canal inferido (SMS, mail, FAX...)
		notificar.tratarMensaje();
		
		//En función del resultado de la notificación definiremos el estado de la misma, y que almacenaremos en BDD
		this.estado = notificar.getResult() == Constantes.RESULT_OK ? Constantes.ESTADO_ENVIADO : Constantes.ESTADO_NO_ENVIADO; 
		
		//Construimos la entidad Notifación que será repositada
		Notificacion notificacion = new Notificacion(msg.getDestino(), msg.getTipoEnvio(), msg.getMensaje(), estado);
		notificacionRepo.save( notificacion);
		
		//Informamos la propiedad id
		this.id = notificacion.getId();
		
		//Comprobación. Imprimimos por consola el conjunto de todas las notificaciones enviadas.
		System.out.println(notificacionRepo.findAll().toString());
	}
	
	/** 
	 * @see com.tinsa.poc.interfaces.NotificarMensaje#getResult()
	 * Facility: devolvemos como resultado el estado de la notificación.
	 * 
	 */
	@Override
	public int getResult() {
		return estado;
	}
	
	/**
	 * Devuelve el id de la notificación.
	 *
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	
}
