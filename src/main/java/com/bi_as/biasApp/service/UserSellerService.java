package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.UserSellerRepository;
import com.bi_as.biasApp.domain.Persona;
import com.bi_as.biasApp.domain.UserClient;
import com.bi_as.biasApp.domain.UserSeller;
import com.bi_as.biasApp.dto.PersonaDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserSellerService {
    UserSellerRepository  userSellerRepository;
    private static final Logger LOGGER= LoggerFactory.getLogger(UserSellerService.class);

    @Autowired
    public UserSellerService(UserSellerRepository userSellerRepository) {
        this.userSellerRepository = userSellerRepository;
    }

    public UserSeller findUserselerId(int id){
        return userSellerRepository.findUserselerbyid(id);
    }

    public List<PersonaDto> getlistclient(){
        List<UserSeller> userSellerList =userSellerRepository.findselerlist();
        List<PersonaDto> personaDtoList=new ArrayList<>();
        for(UserSeller userSeller:userSellerList){
            personaDtoList.add(new PersonaDto(userSeller.getPersonaIdUser()));
        }
        return  personaDtoList;
    }

}
