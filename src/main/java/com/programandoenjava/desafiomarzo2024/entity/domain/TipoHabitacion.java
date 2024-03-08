package com.programandoenjava.desafiomarzo2024.entity.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


/**
 * Clase correspondiente a que tipo de habitacion
 * se puede definir
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name="tbl_tipo_habitacion")
public class TipoHabitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}
