package com.programandoenjava.desafiomarzo2024.service.impl;


import com.programandoenjava.desafiomarzo2024.entity.dto.TipoHabitacionDTO;
import com.programandoenjava.desafiomarzo2024.repository.TipoHabitacionRepository;
import com.programandoenjava.desafiomarzo2024.service.TipoHabitacionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoHabitacionServiceImpl implements TipoHabitacionService {


    private final TipoHabitacionRepository repository;


    public TipoHabitacionServiceImpl(TipoHabitacionRepository repository) {
        this.repository = repository;
    }


    @Override
    public TipoHabitacionDTO save(TipoHabitacionDTO dto) {
        return null;
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
