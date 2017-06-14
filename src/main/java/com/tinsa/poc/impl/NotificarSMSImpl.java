package com.tinsa.poc.impl;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.proxy.Mensaje;
import com.tinsa.poc.utils.Constantes;

/**
 * Clase NotificarSMSImpl, que implementa el interfaz NotificarMensaje. 
 * Es el RealSubject del patrón proxy
 */
public class NotificarSMSImpl implements NotificarMensaje {

	
	/** Mensaje a notificar. */
	private Mensaje msg;
	
	/** Resultado de la notificación. */
	private int result;

	/**
	 * Constructor de la clase NotificiarSMSImpl.
	 *
	 * @param msg 
	 */
	public NotificarSMSImpl(Mensaje msg) {
		super();
		this.msg = msg;
	}

	/* (non-Javadoc)
	 * @see com.tinsa.poc.interfaces.NotificarMensaje#getResult()
	 */
	@Override
	public int getResult() {
		return result;
	}


	/**
	 * Informa el resultad de la notificación.
	 *
	 * @param result
	 */
	public void setResult(int result) {
		this.result = result;
	}


	/**
	 * Realiza el tratamiento de una notificación tipo SMS e informa el resultado de la misma en la propiedad result
	 * 
	 * @see com.tinsa.poc.interfaces.NotificarMensaje#tratarMensaje()
	 * 
	 */
	@Override
	public void tratarMensaje() {
		
		System.out.println("Enviando " + this.msg.getTipoEnvio() + " notificacion... to " + this.msg.getDestino() + " with this message " + this.msg.getMensaje());
		try { 
			
			HttpClient httpClient = HttpClients.createDefault();
			
			String url  = Constantes.SERVICE_SMS_URL + "?" + Constantes.PARAM_PHONE + "=" + this.msg.getDestino() + "&" + Constantes.PARAM_MESSAGE + "=" + this.msg.getMensaje();
			
			HttpGet request = new HttpGet(url);
			request.setHeader("Accept", "application/json");
		
			HttpResponse response = httpClient.execute(request);
			
			this.result = response.getStatusLine().getStatusCode();
			
			
		} catch (IOException e) {
			e.printStackTrace();
			this.result = 0;
		}
	}
	
}
