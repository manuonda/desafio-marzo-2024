package com.programandoenjava.desafiomarzo2024.repository;


import com.programandoenjava.desafiomarzo2024.entity.domain.TipoHabitacion;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


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

}
