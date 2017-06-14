package com.tinsa.poc.entity;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.tinsa.poc.utils.Constantes;

@RunWith(SpringRunner.class)
public class NotificacionTest {
	
	private Notificacion notificacion;
    
	@Before
	public void SetUp(){
			    
	    notificacion = new Notificacion(Constantes.DESTINO, Constantes.TIPO_ENVIO, Constantes.MENSAJE, Constantes.ESTADO);
	}

	@Test
	public void givenNotificacionObjectWhenCallGettersThenReturnItsProperties(){
		
		//GIVEN
		Notificacion notificacionTest = notificacion;
		
		//WHEN
		String destino = notificacionTest.getDestino();
		String tipoEnvio = notificacionTest.getTipoEnvio();
		String mensaje = notificacionTest.getMensaje();
		Integer estado = notificacionTest.getEstado();
				
		//THEN
		assertThat(destino.equals(Constantes.DESTINO));
		assertThat(tipoEnvio.equals(Constantes.TIPO_ENVIO));
		assertThat(mensaje.equals(Constantes.MENSAJE));
		assertThat(estado.equals(Constantes.ESTADO));
	}
	
	@Test
	public void givenNotificacionObjectWhenSetValuesToItsPropertiesThenGettersReturnSameValues(){
		
		//GIVEN
		Notificacion notificacionTest = notificacion;
		
		//WHEN
		notificacionTest.setDestino(Constantes.OTRO_DESTINO);
		notificacionTest.setEstado(Constantes.OTRO_ESTADO);
		notificacionTest.setMensaje(Constantes.OTRO_MENSAJE);
		notificacionTest.setTipoEnvio(Constantes.TIPO_ENVIO);
		
		//THEN
		assertThat(notificacionTest.getDestino().equals(Constantes.OTRO_DESTINO));
		assertThat(notificacionTest.getEstado() == Constantes.OTRO_ESTADO);
		assertThat(notificacionTest.getMensaje().equals(Constantes.OTRO_MENSAJE));
		assertThat(notificacionTest.getTipoEnvio().equals(Constantes.OTRO_TIPO_ENVIO));
	}
	
}