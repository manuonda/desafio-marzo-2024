package com.programandoenjava.desafiomarzo2024.repository;

import com.programandoenjava.desafiomarzo2024.entity.domain.TipoHabitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


/**
 * Class Tipo Habitacion Repository
 */
public interface TipoHabitacionRepository extends JpaRepository<TipoHabitacion, Long> {

    @Query("SELECT th FROM TipoHabitacion th where th.nombre =  ?1% ")
    Optional<TipoHabitacion> findByNombre(String nombre);


    @Query("SELECT th FROM TipoHabitacion th WHERE th.nombre LIKE CONCAT('%', :nombre, '%')")
    List<TipoHabitacion> findListByParam(@Param("nombre") String nombre);


    @Query(value = "SELECT * FROM tbl_tipo_habitacion th where th.nombre  LIKE %?1% ", nativeQuery = true)
    List<TipoHabitacion> findByNativeQuery(String nombre);


}
