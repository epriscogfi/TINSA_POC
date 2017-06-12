package com.tinsa.poc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tinsa.poc.entity.Notificacion;

@Repository("notificacionRepository")
public interface NotificacionRepository extends CrudRepository<Notificacion, Integer> {

}
