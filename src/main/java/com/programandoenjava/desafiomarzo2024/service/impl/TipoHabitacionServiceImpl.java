package com.programandoenjava.desafiomarzo2024.service.impl;


import com.programandoenjava.desafiomarzo2024.entity.domain.TipoHabitacion;
import com.programandoenjava.desafiomarzo2024.entity.dto.TipoHabitacionDTO;
import com.programandoenjava.desafiomarzo2024.exception.EntityNotFoundException;
import com.programandoenjava.desafiomarzo2024.repository.TipoHabitacionRepository;
import com.programandoenjava.desafiomarzo2024.service.TipoHabitacionService;
import com.programandoenjava.desafiomarzo2024.service.mapper.TipoHabitacionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoHabitacionServiceImpl implements TipoHabitacionService {


    private final TipoHabitacionRepository repository;

    @Autowired
    private TipoHabitacionMapper tipoHabitacionMapper;

    public TipoHabitacionServiceImpl(TipoHabitacionRepository repository) {
        this.repository = repository;
    }


    @Override
    public TipoHabitacionDTO save(TipoHabitacionDTO dto) {
        Optional<TipoHabitacion> findByNombre= this.repository.findByNombre(dto.getNombre());
        if ( findByNombre.isPresent()){
            throw new EntityNotFoundException("El nombre de Tipo Habitacion Existe : " + dto.getNombre());
        }
        TipoHabitacion tipoHabitacion = this.tipoHabitacionMapper.toEntity(dto);
        TipoHabitacion tipoHabitacionSaved = this.repository.save(tipoHabitacion);

        return this.tipoHabitacionMapper.toDTO(tipoHabitacionSaved);
    }

    @Override
    public TipoHabitacionDTO findById(Long id) {
        return null;
    }

    @Override
    public TipoHabitacionDTO update(TipoHabitacionDTO dto, Long id) {
        return null;
    }

    @Override
    public List<TipoHabitacionDTO> findAll(TipoHabitacionDTO dto) {
        return null;
    }
}
