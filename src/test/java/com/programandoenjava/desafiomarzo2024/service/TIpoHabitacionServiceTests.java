package com.programandoenjava.desafiomarzo2024.service;


import com.programandoenjava.desafiomarzo2024.entity.domain.Habitacion;
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
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Optional;

import static org.mockito.BDDMockito.given;


/**
 * Class correspondiente a TipoHabitacion Service Test
 */
@ExtendWith(MockitoExtension.class)
public class TIpoHabitacionServiceTests {

    @Mock
    private TipoHabitacionRepository tipoHabitacionRepository;

    @Mock
    private TipoHabitacionMapperImpl tipoHabitacionMapper;

    @InjectMocks
    private TipoHabitacionServiceImpl tipoHabitacionService;

    private TipoHabitacion tipoHabitacion;



    @BeforeEach
    public void setUp(){
        TipoHabitacion tipoHabitacion = TipoHabitacion.builder()
                .nombre("HAB. SIMPLE")
                .build();

        MockitoAnnotations.initMocks(this);
    }


    @Test
    @DisplayName("Junit Method Save TipoHabitacion")
    public void givenObjectTipoHabitacion_whenSaveTipoHabitacion_thenReturnObjectTipoHabitacion(){
        //given
        TipoHabitacion tipoHabitacion = TipoHabitacion.builder()
                .nombre("HABITACION SIMPLE")
                .build();

        TipoHabitacionDTO dto = new TipoHabitacionDTO();
        dto.setNombre(tipoHabitacion.getNombre());



        given(this.tipoHabitacionRepository.findByNombre(dto.getNombre())).willReturn(Optional.empty());
        given(this.tipoHabitacionMapper.toEntity(dto)).willReturn(tipoHabitacion);
        given(this.tipoHabitacionRepository.save(tipoHabitacion)).willReturn(tipoHabitacion);

        //when
        TipoHabitacionDTO tipoHabitacionSavedDTO = this.tipoHabitacionService.save(dto);

        //then
        Assertions.assertThat(tipoHabitacionSavedDTO).isNotNull();
    }



}
