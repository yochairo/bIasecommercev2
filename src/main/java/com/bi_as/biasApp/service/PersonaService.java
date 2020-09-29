package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.PersonaRepository;
import com.bi_as.biasApp.domain.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    PersonaRepository personaRepository;
    private static final Logger LOGGER= LoggerFactory.getLogger(PersonaService.class);

    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }


    public Persona  findPersonaId(int id){
        return personaRepository.findPersonabyidUser(id);
    }

}
