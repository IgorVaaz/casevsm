package com.vsm.controller;

import com.vsm.entity.Cidades;
import com.vsm.service.CidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidades")
//@CrossOrigin
public class CidadesController {

    @Autowired
    private CidadesService cidadeservice;

    //listar todas cidades
    @GetMapping
    public ResponseEntity<List<Cidades>> getCidades(){
        List<Cidades> cidades = cidadeservice.retornaCidades();
        return ResponseEntity.ok().body(cidades);
    }

    //Inserir cidades
    @PostMapping
    public Cidades create(@RequestBody Cidades c){
        return cidadeservice.inserir(c);
    }


}
