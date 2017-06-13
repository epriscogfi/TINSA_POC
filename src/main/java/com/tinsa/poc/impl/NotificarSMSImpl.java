package com.tinsa.poc.impl;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.proxy.Mensaje;
import com.tinsa.poc.utils.Constantes;

// TODO: Auto-generated Javadoc
/**
 * The Class NotificarSMSImpl.
 */
public class NotificarSMSImpl implements NotificarMensaje {

	
	/** The msg. */
	private Mensaje msg;
	
	/** The result. */
	private int result;

	/**
	 * Instantiates a new notificar SMS impl.
	 *
	 * @param msg the msg
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
	 * Sets the result.
	 *
	 * @param result the new result
	 */
	public void setResult(int result) {
		this.result = result;
	}


	/* (non-Javadoc)
	 * @see com.tinsa.poc.interfaces.NotificarMensaje#tratarMensaje()
	 */
	@Override
	public void tratarMensaje() {
		
		System.out.println("Enviando " + this.msg.getTipoEnvio() + " notificacion... to " + this.msg.getDestino() + " with this message " + this.msg.getMensaje());
		try { 
			
			HttpClient httpClient = HttpClients.createDefault();
			
			String url  = Constantes.SERVICE_SMS_URL + "?" + Constantes.PARAM_PHONE + "=" + this.msg.getDestino() + "&" + Constantes.PARAM_MESSAGE + "=" + this.msg.getMensaje();
			System.out.println(url);
			
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
