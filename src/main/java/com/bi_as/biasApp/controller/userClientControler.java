package com.bi_as.biasApp.controller;


import com.bi_as.biasApp.Persona;
import com.bi_as.biasApp.dto.PersonaDto;
import com.bi_as.biasApp.service.UserClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping("/k1/cliente")
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
}
