package com.vsm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vsm.entity.Cidades;

@Repository
public interface CidadesRepository extends JpaRepository<Cidades, Integer> {

}
