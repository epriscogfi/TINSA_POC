package com.tinsa.poc.proxy;

import org.junit.Test;
import org.springframework.boot.test.mock.mockito.SpyBean;

// TODO: Auto-generated Javadoc
/**
 * The Class NotificarProxyTest.
 */
public class NotificarProxyTest {
	
	/** The notificacion proxy. */
	@SpyBean
	private NotificarProxy notificacionProxy;
	
	
	/**
	 * Given valid SMS when is treate then result OK.
	 */
	@Test
	public void givenValidSMSWhenIsTreateThenResultOK(){
//		Mensaje mensajeSMSOk;
//		mensajeSMSOk = new Mensaje(Constantes.DESTINO, Constantes.SMS, Constantes.MENSAJE);
//		
//		notificacionProxy.inferImpl(mensajeSMSOk).tratarMensaje();
//		assertThat(notificacionProxy.getResult() == Constantes.ESTADO_ENVIADO);
		
	}
	
	/**
	 * Given in valid SMS when is treate then result KO.
	 */
	@Test
	public void givenInValidSMSWhenIsTreateThenResultKO(){
		
//		Mensaje mensajeSMSko;
//		mensajeSMSko = new Mensaje(Constantes.DESTINO, Constantes.SMS, null);
//		notificacionProxy.inferImpl(mensajeSMSko).tratarMensaje();
//		assertThat(notificacionProxy.getResult() == Constantes.ESTADO_NO_ENVIADO);
		
	}

}
