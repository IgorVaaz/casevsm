package com.vsm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vsm.entity.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

    public Clientes findByClienteId(Integer clienteId);
    public Clientes findByNome(String nome);
}
