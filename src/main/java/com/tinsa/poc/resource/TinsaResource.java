package com.tinsa.poc.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tinsa.poc.proxy.Notificacion;
import com.tinsa.poc.proxy.NotificarProxy;

@RestController
public class TinsaResource {

	@RequestMapping(value="/notificar", method=RequestMethod.POST)
	public void notificar(
			@RequestParam(value="destino") String destino, 
			@RequestParam(value="tipoMensaje") String tipoMensaje, 
			@RequestParam(value="mensaje") String mensaje){
		
		Notificacion notificacion = new Notificacion(destino, tipoMensaje, mensaje);
		
		NotificarProxy notificarProxy = new NotificarProxy(notificacion);
		notificarProxy.tratarMensaje();
		
		//return notificacion;
		
	}
	
	@RequestMapping(value="/prueba", method=RequestMethod.GET)
	public  @ResponseBody Notificacion prueba(){
		
		Notificacion notificacion = new Notificacion("asdf", "asdfasd", "asdfasdf");
		
		return notificacion;
		
	}
}
