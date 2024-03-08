package com.programandoenjava.desafiomarzo2024.repository;

import com.programandoenjava.desafiomarzo2024.entity.domain.TipoHabitacion;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Class HabitacionRepository
 */
public interface TipoHabitacionRepository extends JpaRepository<TipoHabitacion, Long> {
}
