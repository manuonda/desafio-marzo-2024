package com.programandoenjava.desafiomarzo2024.service;

import com.programandoenjava.desafiomarzo2024.entity.dto.TipoHabitacionDTO;
import java.util.List;

public interface TipoHabitacionService {


   /**
    * Funcion que permite guardar un Tipo de Habitacion
    * @param dto
    * @return
    */
   TipoHabitacionDTO save(TipoHabitacionDTO dto);

   /**
    * Funcion que permite obtener un tipo
    * de habitacion por id
    * @param id
    * @return
    */
   TipoHabitacionDTO findById(Long id);


   /**
    * Funcion que permite actualizar un tipo
    * de habitacion
    * @param dto
    * @param id
    * @return
    */
   TipoHabitacionDTO update(TipoHabitacionDTO dto , Long id);


   /**
    * Funcion que permite buscar los tipo de habitaciones
    * segun un tipo de Habitacion
    * @return
    */
   List<TipoHabitacionDTO> findAll(TipoHabitacionDTO dto);
}

