package com.tinsa.poc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tinsa.poc.proxy.Mensaje;
import com.tinsa.poc.proxy.NotificarProxy;

/**
 * Clase TinsaResource. Representa la capa de exposición REST.
 */
@RestController
public class TinsaResource {

	
	/** NotificarProxy, injectado para su uso */
	@Autowired
	@Qualifier("notificarProxy")
	private NotificarProxy notificarProxy;
	
	/**
	 * Notificar. Representa el endpoint de notificar un mensaje dado.
	 *
	 * @param destino destinatario de la notificación
	 * @param tipoMensaje tipo de notificación
	 * @param mensaje contenido de la notificación a enviar
	 * @return resultado de la notificar
	 */
	@RequestMapping(value="/notificar", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody ResultadoNotificar notificar(
			@RequestParam(value="destino") String destino, 
			@RequestParam(value="tipoMensaje") String tipoMensaje, 
			@RequestParam(value="mensaje") String mensaje){
		
		// A partir de los datos de entrada, se construye el objeto Mensaje y que se corresponderá con la notificación a enviar 
		Mensaje msg = new Mensaje(destino, tipoMensaje, mensaje);

		// Generación de la notificación
		notificarProxy.inferImpl(msg).tratarMensaje();
		
		// Resultado a devolver
		return new ResultadoNotificar(notificarProxy.getId(), notificarProxy.getResult());
		
	}

}
