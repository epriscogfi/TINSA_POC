package com.tinsa.poc.impl;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tinsa.poc.interfaces.NotificarMensaje;
import com.tinsa.poc.proxy.Notificacion;
import com.tinsa.poc.utils.Constantes;

public class NotificarSMSImpl implements NotificarMensaje {

	
	private Notificacion notificacion;

	public NotificarSMSImpl(Notificacion notificacion) {
		super();
		this.notificacion = notificacion;
	}

	
	@Override
	public void tratarMensaje() {
		// TODO Auto-generated method stub
		System.out.println("Enviando " + this.notificacion.getTipoEnvio() + " notificacion... to " + this.notificacion.getDestino() + " with this message " + this.notificacion.getMensaje());
		try {
			
			HttpClient httpClient = HttpClients.createDefault();
			
			String url  = Constantes.SERVICE_SMS_URL + "?" + Constantes.PARAM_PHONE + "=" + this.notificacion.getDestino() + "&" + Constantes.PARAM_MESSAGE + "=" + this.notificacion.getMensaje();
			System.out.println(url);
			
			HttpGet request = new HttpGet(url);
			request.setHeader("Accept", "application/json");
		
			HttpResponse response = httpClient.execute(request);
		
			System.out.println(response.getEntity());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
