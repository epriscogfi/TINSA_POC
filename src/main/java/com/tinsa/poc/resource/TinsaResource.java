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

// TODO: Auto-generated Javadoc
/**
 * The Class TinsaResource.
 */
@RestController
public class TinsaResource {

	
	/** The notificar proxy. */
	@Autowired
	@Qualifier("notificarProxy")
	private NotificarProxy notificarProxy;
	
	/**
	 * Notificar.
	 *
	 * @param destino the destino
	 * @param tipoMensaje the tipo mensaje
	 * @param mensaje the mensaje
	 * @return the resultado notificar
	 */
	@RequestMapping(value="/notificar", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody ResultadoNotificar notificar(
			@RequestParam(value="destino") String destino, 
			@RequestParam(value="tipoMensaje") String tipoMensaje, 
			@RequestParam(value="mensaje") String mensaje){
		
		
		Mensaje msg = new Mensaje(destino, tipoMensaje, mensaje);
		
		notificarProxy.inferImpl(msg).tratarMensaje();
		
		return new ResultadoNotificar(notificarProxy.getId(), notificarProxy.getResult());
		
	}

}
