package com.francosuarez.parcial.services;

import com.francosuarez.parcial.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonaService extends  BaseService<Persona,Long> {
    List<Persona> search (String filtro) throws Exception;
    Page<Persona> search (String filtro, Pageable pageable) throws Exception;
}
