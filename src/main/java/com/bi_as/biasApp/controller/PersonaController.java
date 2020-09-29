package com.bi_as.biasApp.controller;

import com.bi_as.biasApp.dto.PersonaDto;
import com.bi_as.biasApp.service.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/k1/persona")
public class PersonaController {

    private PersonaService personaService;
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }


    @RequestMapping("/idUser/{id}")
    public PersonaDto getUserNicknameAndPassword(@PathVariable("id")String id){
        LOGGER.info("Obteniendo id graphic");
        int idNumber=Integer.parseInt(id);
        PersonaDto personaDto=new PersonaDto(personaService.findPersonaId(idNumber));
        return  personaDto;
    }

}
