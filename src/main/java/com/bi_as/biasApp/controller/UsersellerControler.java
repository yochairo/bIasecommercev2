package com.bi_as.biasApp.controller;

import com.bi_as.biasApp.dao.UserSellerRepository;
import com.bi_as.biasApp.dto.PersonaDto;
import com.bi_as.biasApp.service.UserSellerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping("/k1/seller")
public class UsersellerControler {
    UserSellerService userSellerService;
    private static final Logger LOGGER = LoggerFactory.getLogger(UsersellerControler.class);

    @Autowired
    public UsersellerControler(UserSellerService userSellerService) {
        this.userSellerService = userSellerService;
    }




    @RequestMapping("/userselerlist")
    public List<PersonaDto> getUserNicknameAndPassword(){
        LOGGER.info("Obteniendo id graphic");
        return userSellerService.getlistclient();
    }



    @PostMapping("/loginuserSeller")
    public int loginUserClient(@RequestBody PersonaDto personaDto){
//        UserDto userDto=new UserDto(userService.verifyUser(user));
        LOGGER.info("Obteniendo id "+personaDto.getNicknameUser()+"    "+ personaDto.getPassword());
        return userSellerService.getLoginUserSeller(personaDto);

    }

}
