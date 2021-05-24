package com.vsm.service;

import com.vsm.entity.Cidades;
import com.vsm.repository.CidadesRepository;
import com.vsm.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadesService {

    @Autowired
    private CidadesRepository cidadeRepository;

    //listar todas cidades
    public List<Cidades> retornaCidades() {
        return cidadeRepository.findAll();
    }

    public Cidades inserir(Cidades c) {
        return cidadeRepository.save(c);
    }
}
