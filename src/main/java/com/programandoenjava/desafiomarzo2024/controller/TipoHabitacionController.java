package com.programandoenjava.desafiomarzo2024.controller;


import com.programandoenjava.desafiomarzo2024.entity.domain.TipoHabitacion;
import com.programandoenjava.desafiomarzo2024.entity.dto.TipoHabitacionDTO;
import com.programandoenjava.desafiomarzo2024.service.TipoHabitacionService;
import jakarta.validation.Valid;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tipoHabitacion")
public class TipoHabitacionController {

    private final TipoHabitacionService tipoHabitacionService;


    public TipoHabitacionController(TipoHabitacionService tipoHabitacionService) {
        this.tipoHabitacionService = tipoHabitacionService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<TipoHabitacionDTO>> getList(@RequestBody TipoHabitacionDTO tipoHabitacionDTO){
        List<TipoHabitacionDTO> list = this.tipoHabitacionService.findAll(tipoHabitacionDTO);
        return ResponseEntity.status(HttpStatus.OK).body(list);

    }


    @GetMapping("/{id}")
    public ResponseEntity<TipoHabitacionDTO> findById(@PathVariable("id") Long id){
        TipoHabitacionDTO tipoHabitacionDTO = this.tipoHabitacionService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(tipoHabitacionDTO);
    }


    @PostMapping("/save")
    public ResponseEntity<TipoHabitacionDTO> save(@Valid @RequestBody TipoHabitacionDTO dto){
        TipoHabitacionDTO tipoHabitacionDTO = this.tipoHabitacionService.save(dto);
        return ResponseEntity.status(HttpStatus.OK).body(tipoHabitacionDTO);
    }

}
