package com.tinsa.poc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tinsa.poc.entity.Notificacion;

/**
 * Interfaz NotificacionRepository, que extiende de CrudRepository y provee las operaciones CRUD básicas de la entidad Notificación
 */
@Repository("notificacionRepository")
public interface NotificacionRepository extends CrudRepository<Notificacion, Integer> {

}
