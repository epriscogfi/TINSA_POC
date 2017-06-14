package com.tinsa.poc.proxy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.tinsa.poc.utils.Constantes;

public class MensajeTest {
	
	Mensaje mensaje;
	
	@Before
	public void SetUp(){
			    
	    mensaje = new Mensaje(Constantes.DESTINO, Constantes.TIPO_ENVIO, Constantes.MENSAJE);
	}

	@Test
	public void givenNotificacionObjectWhenCallGettersThenReturnItsProperties(){
		
		//GIVEN
		Mensaje mensajeTest = mensaje;
		
		//WHEN
		String destino = mensajeTest.getDestino();
		String tipoEnvio = mensajeTest.getTipoEnvio();
		String mensaje = mensajeTest.getMensaje();
				
		//THEN
		assertThat(destino.equals(Constantes.DESTINO));
		assertThat(tipoEnvio.equals(Constantes.TIPO_ENVIO));
		assertThat(mensaje.equals(Constantes.MENSAJE));
	}
	
	@Test
	public void givenNotificacionObjectWhenSetValuesToItsPropertiesThenGettersReturnSameValues(){
		
		//GIVEN
		Mensaje mensajeTest = mensaje;
		
		//WHEN
		mensajeTest.setDestino(Constantes.OTRO_DESTINO);
		mensajeTest.setMensaje(Constantes.OTRO_MENSAJE);
		mensajeTest.setTipoEnvio(Constantes.TIPO_ENVIO);
		
		//THEN
		assertThat(mensajeTest.getDestino().equals(Constantes.OTRO_DESTINO));
		assertThat(mensajeTest.getMensaje().equals(Constantes.OTRO_MENSAJE));
		assertThat(mensajeTest.getTipoEnvio().equals(Constantes.OTRO_TIPO_ENVIO));
	}
}
