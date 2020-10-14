package com.bi_as.biasApp.controller;

import com.bi_as.biasApp.domain.User;
import com.bi_as.biasApp.dto.PersonaDto;
import com.bi_as.biasApp.service.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/k1/persona")
@CrossOrigin(origins = "*", allowedHeaders = "*")
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


    @PostMapping("/login")
    public PersonaDto loginPersona(@RequestBody PersonaDto personaDto){
//        UserDto userDto=new UserDto(userService.verifyUser(user));
        LOGGER.info("Obteniendo id "+personaDto.getNicknameUser()+"    "+ personaDto.getPassword());
        return personaService.getLoginUserAdmin(personaDto);

    }


    @PostMapping("/addUserSeller")
    public PersonaDto addUserSeller(@RequestBody PersonaDto personaDto){
//        UserDto userDto=new UserDto(userService.verifyUser(user));
//        LOGGER.info("Obteniendo id "+personaDto.getNicknameUser()+"    "+ personaDto.getPassword());
        return personaService.saveUserSeller(personaDto);

    }


    @PutMapping("/editUserSeller")
    public PersonaDto editPublication(@RequestBody PersonaDto personaDto){
//        LOGGER.info("Realizando modificacion de editar user  esss "+productoDto.getIdProduct());
        return personaService.editUserSeller(personaDto);

    }







}
