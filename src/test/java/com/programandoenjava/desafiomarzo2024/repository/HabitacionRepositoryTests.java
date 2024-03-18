package com.programandoenjava.desafiomarzo2024.repository;


import com.programandoenjava.desafiomarzo2024.entity.domain.Habitacion;
import com.programandoenjava.desafiomarzo2024.entity.domain.TipoHabitacion;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@DataJpaTest
public class HabitacionRepositoryTests {

    @Autowired
    private HabitacionRepository habitacionRepository;

    @Autowired
    private TipoHabitacionRepository tipoHabitacionRepository;


    //Test for Guardar Habitacion
    @Test
    @DisplayName("Junit method Test cuando guarda una habitacion")
    public void givenObjectHabitacion_whenSaveHabitacion_thenReturnObjectHabitacion() {
        //given - preparo nuestros datos
        TipoHabitacion tipoHabitacion = TipoHabitacion.builder()
                .nombre("HABITACION SIMPLE")
                .build();
        this.tipoHabitacionRepository.save(tipoHabitacion);
        Habitacion habitacion  = Habitacion.builder()
                .tipoHabitacion(tipoHabitacion)
                .identificador("AABBCD123")
                .fecha(LocalDateTime.now())
                .precio(400.00)
                .cantidad(2)
                .isDisponible(Boolean.TRUE)
                .build();

        //when - acciones a realizar para testing
        this.habitacionRepository.save(habitacion);
        
        //then - verificamos la salida
        Assertions.assertThat(habitacion).isNotNull();
    }


    //Test for Junit Method get all habitaciones
    @Test
    @DisplayName("Test Junit Method - Get All Habitaciones")
    public void givenListObjectHabitacion_whenFindAllHabitaciones_thenReturnListObjectHabitacion() {
        //given - preparo nuestros datos
        TipoHabitacion tipoHabitacionSimple = TipoHabitacion.builder().nombre("HABITACION SIMPLE").build();
        TipoHabitacion tipoHabitacionDoble = TipoHabitacion.builder().nombre("HABITACION DOBLE").build();
        this.tipoHabitacionRepository.save(tipoHabitacionSimple);
        this.tipoHabitacionRepository.save(tipoHabitacionDoble);
        Habitacion habitacion = Habitacion.builder()
                .cantidad(2)
                .tipoHabitacion(tipoHabitacionSimple)
                .identificador("HABSIMPLE-AA")
                .fecha(LocalDateTime.now())
                .build();

        Habitacion habitacionDoble = Habitacion.builder()
                .cantidad(2)
                .tipoHabitacion(tipoHabitacionDoble)
                .identificador("HABSIMPLE-AA")
                .fecha(LocalDateTime.now())
                .build();

        this.habitacionRepository.save(habitacion);
        this.habitacionRepository.save(habitacionDoble);

        //when - acciones a realizar para testing
        List<Habitacion> habitaciones = this.habitacionRepository.findAll();

        //then
        Assertions.assertThat(habitaciones.size()).isEqualTo(2);
    }


    @Test
    @DisplayName("")
}
