package com.tinsa.poc.impl;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.tinsa.poc.proxy.Mensaje;

@RunWith(SpringRunner.class)
public class NotificarSMSImplTest {
	
	private static final String DESTINO = "666251478";
	private static final String TIPO_ENVIO = "SMS";
    private static final String MENSAJE = "Mensaje";
    
	private Mensaje mensajeOK;
	private Mensaje mensajeKO;
	
	@Before
	public void SetUp(){
		
		mensajeOK = new Mensaje(1L, DESTINO, TIPO_ENVIO, MENSAJE);
		mensajeKO = new Mensaje(1L, DESTINO, TIPO_ENVIO, MENSAJE);
		
	}
	
	@Test
	public void GivenValidMessageWhenIsTreatedThenReturn200Code(){

		//GIVEN
		NotificarSMSImpl notificarSMS = new NotificarSMSImpl(mensajeOK);
		
		//WHEN
		notificarSMS.tratarMensaje();
		
		//THEN
		assertThat(notificarSMS.getResult() == 200);
		
 	}
	
	@Test
	public void GivenInvalidMessageWhenIsTreatedThenReturnCodeDistinct200(){

		//GIVEN
		NotificarSMSImpl notificarSMS = new NotificarSMSImpl(mensajeKO);
		
		//WHEN
		notificarSMS.tratarMensaje();
		
		//THEN
		assertThat(notificarSMS.getResult() != 200);
		
 	}
	
}
