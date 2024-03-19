package com.programandoenjava.desafiomarzo2024.service.mapper;


import com.programandoenjava.desafiomarzo2024.entity.domain.TipoHabitacion;
import com.programandoenjava.desafiomarzo2024.entity.dto.TipoHabitacionDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoHabitacionMapper {

    TipoHabitacionDTO toDTO(TipoHabitacion entity);

    TipoHabitacion toEntity(TipoHabitacionDTO dto);

    List<TipoHabitacionDTO> toListadoDTO(List<TipoHabitacion> entitys);
}
