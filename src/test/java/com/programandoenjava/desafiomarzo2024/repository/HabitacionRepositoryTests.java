package com.programandoenjava.desafiomarzo2024.repository;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class HabitacionRepositoryTests {

    @Autowired
    private HabitacionRepository habitacionRepository;

    @Autowired
    private TipoHabitacionRepository tipoHabitacionRepository;


    //Test for
    @Test
    @DisplayName("Junit method Test cuando guarda una habitacion")
    public void given_when_then() {
        //given - preparo nuestros datos

        //when - acciones a realizar para testing

        //then - verificamos la salida
    }

}
