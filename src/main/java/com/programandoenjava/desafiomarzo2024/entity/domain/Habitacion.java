package com.programandoenjava.desafiomarzo2024.entity.domain;


import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name="tbl_habitacion")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    TipoHabitacion tipoHabitacion;


    private LocalDateTime fecha;

    /**
     * Identificador unico de habitacion
     */
    private String identificador;

    private LocalDateTime fechaAlta;

    @PrePersist
    public void prePersist(){
        this.fechaAlta = LocalDateTime.now();
    }

}
