package com.bi_as.biasApp.controller;


import com.bi_as.biasApp.Persona;
import com.bi_as.biasApp.dto.PersonaDto;
import com.bi_as.biasApp.service.UserClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping("/k1/cliente")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class userClientControler {

    UserClientService userClientService;

    private static final Logger LOGGER = LoggerFactory.getLogger(userClientControler.class);

    @Autowired
    public userClientControler(UserClientService userClientService) {
        this.userClientService = userClientService;
    }

    @RequestMapping("/userclientlist")
    public List<PersonaDto> getUserNicknameAndPassword(){
        LOGGER.info("Obteniendo id graphic");
        return userClientService.getlistclient();
    }

    @PostMapping("/addUserClient")
    public PersonaDto addUserSeller(@RequestBody PersonaDto personaDto){
//        UserDto userDto=new UserDto(userService.verifyUser(user));
//        LOGGER.info("Obteniendo id "+personaDto.getNicknameUser()+"    "+ personaDto.getPassword());
        return userClientService.addUserClient(personaDto);

    }

    @PostMapping("/loginuserClient")
    public PersonaDto loginUserClient(@RequestBody PersonaDto personaDto){
//        UserDto userDto=new UserDto(userService.verifyUser(user));
        LOGGER.info("Obteniendo id "+personaDto.getNicknameUser()+"    "+ personaDto.getPassword());
        return userClientService.getLoginUserClient(personaDto);

    }

    @PutMapping("/editUserClient")
    public PersonaDto editPublication(@RequestBody PersonaDto personaDto){
        return userClientService.editUserClient(personaDto);

    }
    @PutMapping("/deleteUserClient")
    public String delitpersonacliente(@RequestBody PersonaDto personaDto){

        return userClientService.deleteUserClient(personaDto);

    }



}
