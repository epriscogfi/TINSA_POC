package com.tinsa.poc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tinsa.poc.entity.Notificacion;

/**
 * The Interface NotificacionRepository.
 */
@Repository("notificacionRepository")
public interface NotificacionRepository extends CrudRepository<Notificacion, Integer> {

}
