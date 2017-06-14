package com.tinsa.poc.proxy;

import org.junit.Test;
import org.springframework.boot.test.mock.mockito.SpyBean;


public class NotificarProxyTest {
	
	@SpyBean
	private NotificarProxy notificacionProxy;
	
	
	@Test
	public void givenValidSMSWhenIsTreatedThenResultOK(){
//		Mensaje mensajeSMSOk;
//		mensajeSMSOk = new Mensaje(Constantes.DESTINO, Constantes.SMS, Constantes.MENSAJE);
//		
//		notificacionProxy.inferImpl(mensajeSMSOk).tratarMensaje();
//		assertThat(notificacionProxy.getResult() == Constantes.ESTADO_ENVIADO);
		
	}
	
	@Test
	public void givenInValidSMSWhenIsTreateThenResultKO(){
		
//		Mensaje mensajeSMSko;
//		mensajeSMSko = new Mensaje(Constantes.DESTINO, Constantes.SMS, null);
//		notificacionProxy.inferImpl(mensajeSMSko).tratarMensaje();
//		assertThat(notificacionProxy.getResult() == Constantes.ESTADO_NO_ENVIADO);
		
	}

}
