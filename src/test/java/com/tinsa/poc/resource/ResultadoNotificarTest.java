package com.tinsa.poc.resource;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.tomcat.util.bcel.Const;
import org.junit.Before;
import org.junit.Test;

import com.tinsa.poc.utils.Constantes;

// TODO: Auto-generated Javadoc
/**
 * The Class ResultadoNotificarTest.
 */
public class ResultadoNotificarTest {

	/** The resultado notificar. */
	ResultadoNotificar resultadoNotificar;
	
	/**
	 * Sets the up.
	 */
	@Before
	public void SetUp(){
		resultadoNotificar = new ResultadoNotificar(1L, Constantes.ESTADO_ENVIADO);
	}
	
	/**
	 * Given resultado notificar object when call getters then returns its properties.
	 */
	@Test
	public void GivenResultadoNotificarObjectWhenCallGettersThenReturnsItsProperties(){
		
		//GIVEN
		ResultadoNotificar resultado = resultadoNotificar;
		
		//WHEN
		Long idMensaje = resultado.getIdMensaje();
		int estadoMensaje = resultado.getEstadoMensaje();
		
		//THEN
		assertThat(idMensaje == 1L);
		assertThat(estadoMensaje == Constantes.ESTADO_ENVIADO);
	}
	
	/**
	 * Given resultado notificar object when set values to its properties then getters return same values.
	 */
	@Test
	public void givenResultadoNotificarObjectWhenSetValuesToItsPropertiesThenGettersReturnSameValues(){
		
		//GIVEN
		ResultadoNotificar resultado = resultadoNotificar;
		
		//WHEN
		resultado.setEstadoMensaje(Constantes.ESTADO_NO_ENVIADO);
		resultado.setIdMensaje(2L);
		
		//THEN
		assertThat(resultado.getEstadoMensaje() == Constantes.ESTADO_NO_ENVIADO);
		assertThat(resultado.getIdMensaje() == 2L);
		
	}
		
}
