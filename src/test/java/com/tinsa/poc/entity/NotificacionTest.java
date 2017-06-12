package com.tinsa.poc.entity;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class NotificacionTest {
	
	private static final String DESTINO = "666251478";
	private static final String TIPO_ENVIO = "SMS";
    private static final String MENSAJE = "Mensaje";
    private static final Integer ESTADO = 1;
    
    private static final String OTRO_DESTINO = "677258547";
	private static final String OTRO_TIPO_ENVIO = "MAIL";
    private static final String OTRO_MENSAJE = "Otro mensaje";
    private static final Integer OTRO_ESTADO = 0;
    
	
    private Notificacion notificacion;
    
	@Before
	public void SetUp(){
			    
	    notificacion = new Notificacion(DESTINO, TIPO_ENVIO, MENSAJE, ESTADO);
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
		assertThat(destino.equals(DESTINO));
		assertThat(tipoEnvio.equals(TIPO_ENVIO));
		assertThat(mensaje.equals(MENSAJE));
		assertThat(estado.equals(ESTADO));
	}
	
	@Test
	public void givenNotificacionObjectWhenSetValuesToItsPropertiesThenGettersReturnSameValues(){
		
		//GIVEN
		Notificacion notificacionTest = notificacion;
		
		//WHEN
		notificacionTest.setDestino(OTRO_DESTINO);
		notificacionTest.setEstado(OTRO_ESTADO);
		notificacionTest.setMensaje(OTRO_MENSAJE);
		notificacionTest.setTipoEnvio(TIPO_ENVIO);
		
		//THEN
		assertThat(notificacionTest.getDestino().equals(OTRO_DESTINO));
		assertThat(notificacionTest.getEstado() == (OTRO_ESTADO));
		assertThat(notificacionTest.getMensaje().equals(OTRO_MENSAJE));
		assertThat(notificacionTest.getTipoEnvio().equals(OTRO_TIPO_ENVIO));
	}
	
}