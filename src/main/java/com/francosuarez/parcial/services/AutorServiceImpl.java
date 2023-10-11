package com.francosuarez.parcial.services;

import com.francosuarez.parcial.entities.Autor;
import com.francosuarez.parcial.repositories.AutorRepository;
import com.francosuarez.parcial.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
        this.autorRepository=autorRepository;
    }
}
