package com.programandoenjava.desafiomarzo2024.repository;

import com.programandoenjava.desafiomarzo2024.entity.domain.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HabitacionRepository  extends JpaRepository<Habitacion, Long> {

    @Query("")
    public List<Habitacion>
}
