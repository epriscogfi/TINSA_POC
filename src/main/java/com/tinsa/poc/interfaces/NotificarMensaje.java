package com.tinsa.poc.interfaces;

// 
/**
 * Interfaz NotificarMensaje del patrón Proxy, implementado para el tratamiento de los mensajes, cuyas acciones serán:
 * 
 *  - Enviar la notificación. Cada clase que implemente este interfaz deberá implementar su propia manera de enviar una notificación.
 *  - Repositar en BDD. Se hará como añadido al envío de la notificación.
 */
public interface NotificarMensaje {

	/**
	 * Tratar mensaje.
	 */
	public void tratarMensaje();
	
	/**
	 * Devuelve el resultado de la notificación en el caso de las implementaciones de este interfaz. En la clase proxy, devolverá el estado de la notificación.
	 *
	 * @return result
	 */
	public int getResult();
	
}
