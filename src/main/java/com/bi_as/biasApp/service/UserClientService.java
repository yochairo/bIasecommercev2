package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.UserClientRepository;
import com.bi_as.biasApp.domain.Persona;
import com.bi_as.biasApp.domain.UserClient;
import com.bi_as.biasApp.dto.PersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserClientService {
    UserClientRepository userClientRepository;

    @Autowired
    public UserClientService(UserClientRepository userClientRepository) {
        this.userClientRepository = userClientRepository;
    }
    public List<PersonaDto> getlistclient(){
        List<UserClient> userClientList =userClientRepository.findclientlist();
        List<PersonaDto> personaDtoList=new ArrayList<>();
            for(UserClient userClient:userClientList){
                personaDtoList.add(new PersonaDto(userClient.getPersonaIdUser()));
            }
        return  personaDtoList;
    }
}
