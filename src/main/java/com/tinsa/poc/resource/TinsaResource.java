package com.tinsa.poc.resource;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tinsa.poc.proxy.Mensaje;
import com.tinsa.poc.proxy.NotificarProxy;

@RestController
public class TinsaResource {

	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	@Qualifier("notificarProxy")
	private NotificarProxy notificarProxy;
	
	@RequestMapping(value="/notificar", method=RequestMethod.POST)
	public void notificar(
			@RequestParam(value="destino") String destino, 
			@RequestParam(value="tipoMensaje") String tipoMensaje, 
			@RequestParam(value="mensaje") String mensaje){
		
		
		Mensaje msg = new Mensaje(counter.incrementAndGet(), destino, tipoMensaje, mensaje);
		
		notificarProxy.inferImpl(msg).tratarMensaje();
			
	}
	
	@RequestMapping(value="/prueba", method=RequestMethod.GET)
	public  @ResponseBody Mensaje prueba(){
		
		Mensaje msg = new Mensaje(counter.incrementAndGet(), "asdf", "asdfasd", "asdfasdf");
		
		return msg;
		
	}
}
