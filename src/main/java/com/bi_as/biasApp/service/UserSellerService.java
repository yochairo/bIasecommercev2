package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.PersonaRepository;
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
    PersonaRepository personaRepository;
    private static final Logger LOGGER= LoggerFactory.getLogger(UserSellerService.class);

    @Autowired
    public UserSellerService(UserSellerRepository userSellerRepository,PersonaRepository personaRepository) {
        this.userSellerRepository = userSellerRepository;
        this.personaRepository=personaRepository;
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


    public PersonaDto getLoginUserSeller(PersonaDto personaDto) {
        Persona persona=personaRepository.findPersonabyNicknamePassword(personaDto.getNicknameUser(),personaDto.getPassword());
        int number=0;
        PersonaDto personaDto1=new PersonaDto();
        if(persona==null){
            LOGGER.info("No existe el usuario");
        }
        else {
            personaDto1=new PersonaDto(persona);
            number=1;
            LOGGER.info("Si existe el usuario");
        }
        return personaDto1;
    }


    public String deleteUserSeller(PersonaDto personaDto) {

        String statua=" ";

        try {
            Persona persona=personaRepository.findPersonabyidUser(personaDto.getIdUser());

            UserSeller userSeller=new UserSeller();
            userSeller=userSellerRepository.findusersellerbyidpersona(persona);
            Persona persona1=userSeller.getPersonaIdUser();

            if(persona1.getIdUser() == persona.getIdUser()){
                persona.setActive(0);
                personaRepository.save(persona);
                userSeller.setActive(0);
                userSellerRepository.save(userSeller);
                statua="se elimino al verdedor";
            }

        }catch (Exception e){
            statua="no es un vendedor";
        }

        return statua;

    }



}
