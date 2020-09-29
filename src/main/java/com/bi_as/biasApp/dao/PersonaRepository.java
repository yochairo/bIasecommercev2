package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Integer> {

}
