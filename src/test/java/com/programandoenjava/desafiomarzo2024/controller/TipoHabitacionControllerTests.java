package com.programandoenjava.desafiomarzo2024.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.programandoenjava.desafiomarzo2024.entity.domain.TipoHabitacion;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(TipoHabitacionController.class)
public class TipoHabitacionControllerTests {


    @Autowired
    private Mock mock;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private


}
