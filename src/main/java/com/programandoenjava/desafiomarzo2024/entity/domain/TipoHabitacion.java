package com.programandoenjava.desafiomarzo2024.entity.domain;


import jakarta.persistence.*;
import lombok.*;


/**
 * Clase correspondiente a que tipo de habitacion
 * se puede definir
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="tbl_tipo_habitacion")
public class TipoHabitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;


}
