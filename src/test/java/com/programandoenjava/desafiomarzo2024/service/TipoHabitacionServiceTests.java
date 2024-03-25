package com.programandoenjava.desafiomarzo2024.service;


import com.programandoenjava.desafiomarzo2024.entity.domain.TipoHabitacion;
import com.programandoenjava.desafiomarzo2024.entity.dto.TipoHabitacionDTO;
import com.programandoenjava.desafiomarzo2024.repository.TipoHabitacionRepository;
import com.programandoenjava.desafiomarzo2024.service.impl.TipoHabitacionServiceImpl;
import com.programandoenjava.desafiomarzo2024.service.mapper.TipoHabitacionMapper;
import com.programandoenjava.desafiomarzo2024.service.mapper.TipoHabitacionMapperImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.mockito.BDDMockito.given;


/**
 * Class correspondiente a TipoHabitacion Service Test
 */
@ExtendWith(MockitoExtension.class)
public class TipoHabitacionServiceTests {

    @Mock
    private TipoHabitacionRepository repository;

    @Mock
    private TipoHabitacionMapper tipoHabitacionMapper;

    @InjectMocks
    private TipoHabitacionServiceImpl tipoHabitacionService;



    @BeforeEach
    public void setUp(){
        TipoHabitacion tipoHabitacion = TipoHabitacion.builder()
                .nombre("HAB. SIMPLE")
                .build();
    }


    @Test
    @DisplayName("Junit Method Save TipoHabitacion")
    public void givenObjectTipoHabitacion_whenSaveTipoHabitacion_thenReturnObjectTipoHabitacion(){
        // Given
        TipoHabitacionDTO dto = new TipoHabitacionDTO();
        dto.setNombre("Nuevo Tipo de Habitacion");

        TipoHabitacion tipoHabitacion = new TipoHabitacion();
        tipoHabitacion.setNombre(dto.getNombre());

        given(repository.findByNombre(dto.getNombre())).willReturn(Optional.empty());
        given(tipoHabitacionMapper.toEntity(dto)).willReturn(tipoHabitacion);
        given(repository.save(tipoHabitacion)).willReturn(tipoHabitacion);
        given(tipoHabitacionMapper.toDTO(tipoHabitacion)).willReturn(dto);

        // When
        TipoHabitacionDTO savedDTO = tipoHabitacionService.save(dto);


        // Then
        verify(repository, times(1)).findByNombre(dto.getNombre());
        verify(tipoHabitacionMapper, times(1)).toEntity(dto);
        verify(repository, times(1)).save(tipoHabitacion);
        verify(tipoHabitacionMapper, times(1)).toDTO(tipoHabitacion);

        assertThat(savedDTO).isNotNull();
        assertThat(savedDTO.getNombre()).isEqualTo(dto.getNombre());
    }

    @Test
    @DisplayName("Test Get By Id Tip Habitacion")
    public void givenObjectTipoHabitacion_whenGetByIdTipoHabitacion_thenReturnObjectTipoHabitacion(){
         //given

         //when

         //then
    }



}
