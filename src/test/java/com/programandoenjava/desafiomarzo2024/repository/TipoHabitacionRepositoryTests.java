package com.programandoenjava.desafiomarzo2024.repository;


import com.programandoenjava.desafiomarzo2024.entity.domain.TipoHabitacion;
import com.programandoenjava.desafiomarzo2024.entity.dto.TipoHabitacionDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;


/**
 * Class Test correspondiente al domain TipoHabitacion
 */
@DataJpaTest
public class TipoHabitacionRepositoryTests {

    @Autowired
    private TipoHabitacionRepository tipoHabitacionRepository;

    private TipoHabitacion tipoHabitacion;

    @BeforeEach
    public void setUp(){
        this.tipoHabitacion = TipoHabitacion.builder()
                .nombre("Individual")
                .build();

    }


    //Test Junit cuando se guarda Tipo Habitacion
    @Test
    @DisplayName("Junit method Test guardar Tipo Habitacion")
    public void givenObjetoTipoHabitacion_whenSaveTipoHabitacion_thenReturnObjectTipoHabitacion() {
        //given - preparo nuestros datos

        //when - acciones a realizar para testing
        TipoHabitacion tipoHabitacionSaved = this.tipoHabitacionRepository.save(tipoHabitacion);

        //then - verificamos la salida
        Assertions.assertThat(tipoHabitacionSaved).isNotNull();
        Assertions.assertThat(tipoHabitacionSaved.getId()).isGreaterThan(0);
    }

    //Test Junit get Tipo Habitacion by Id
    @Test
    @DisplayName("Test Junit method get by Id")
    public void  givenObjectTipoHabitacion_whenGetByIdTipoHabitacion_thenReturnObjectTipoHabitacion(){
        //given
        TipoHabitacion tipoHabitacionSaved = this.tipoHabitacionRepository.save(this.tipoHabitacion);

        //when
        TipoHabitacion tipoHabitacionFind = this.tipoHabitacionRepository.findById(this.tipoHabitacion.getId()).get();

        //then
        Assertions.assertThat(tipoHabitacionFind.getId()).isGreaterThan(0);
        Assertions.assertThat(tipoHabitacionFind).isNotNull();
    }

    //Test Junit Method get List All
    @Test
    @DisplayName("Test Junit Method Get List All")
    public void givenObjectsTipoHabitacion_whenFindAllTipoHabitacion_thenReturnListObjectTipHabitacion(){

        //given
        TipoHabitacion tipoHabitacion2 = TipoHabitacion.builder()
                .nombre("TIPO HABITACION 2")
                .build();
        this.tipoHabitacionRepository.save(tipoHabitacion);
        this.tipoHabitacionRepository.save(tipoHabitacion2);

        //when
        List<TipoHabitacion> listado = this.tipoHabitacionRepository.findAll();

        //then
        Assertions.assertThat(listado.size()).isGreaterThan(0);
        Assertions.assertThat(listado.get(0).getId()).isNotNull();
    }





}
