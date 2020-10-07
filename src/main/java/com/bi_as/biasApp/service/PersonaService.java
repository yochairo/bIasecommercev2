package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.PersonaRepository;
import com.bi_as.biasApp.dao.StroreRepository;
import com.bi_as.biasApp.dao.UserAdminRepository;
import com.bi_as.biasApp.dao.UserSellerRepository;
import com.bi_as.biasApp.domain.Persona;
import com.bi_as.biasApp.domain.Store;
import com.bi_as.biasApp.domain.UserAdmin;
import com.bi_as.biasApp.domain.UserSeller;
import com.bi_as.biasApp.dto.PersonaDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    PersonaRepository personaRepository;
    UserAdminRepository userAdminRepository;
    StroreRepository stroreRepository;
    UserSellerRepository userSellerRepository;
    private static final Logger LOGGER= LoggerFactory.getLogger(PersonaService.class);

    @Autowired
    public PersonaService(PersonaRepository personaRepository,UserAdminRepository userAdminRepository,StroreRepository stroreRepository,UserSellerRepository userSellerRepository) {
        this.personaRepository = personaRepository;
        this.userAdminRepository=userAdminRepository;
        this.stroreRepository=stroreRepository;
        this.userSellerRepository=userSellerRepository;
    }


    public Persona  findPersonaId(int id){
        return personaRepository.findPersonabyidUser(id);
    }


    //---------------------------------------------------------------------------


    public Persona updatePersonalDataByIdPersona(PersonaDto personaDto){
//        Persona persona=personaRepository.findPersonabyidUser(personaDto.getIdUser());
        Persona persona=new Persona();
        persona.setName(personaDto.getName());
        persona.setSecondName(persona.getSecondName());
        persona.setLastName(persona.getLastName());
        persona.setSecondLastName(persona.getSecondLastName());
        personaRepository.save(persona);
        return persona;
    }

    public UserAdmin saveUserAdmin(PersonaDto personaDto){
        Persona persona=new Persona();
        persona.setName(personaDto.getName());
        persona.setSecondName(personaDto.getSecondName());
        persona.setLastName(personaDto.getLastName());
        persona.setMail(personaDto.getMail());
        persona.setPassword(personaDto.getPassword());
        persona.setNicknameUser(personaDto.getNicknameUser());
        personaRepository.save(persona);
        Persona persona1=personaRepository.findPersonabyNicknamePassword(personaDto.getNicknameUser(),personaDto.getPassword());
        UserAdmin userAdmin=new UserAdmin();
        userAdmin.setPersonaIdUser(persona1);
        userAdminRepository.save(userAdmin);
        UserAdmin userAdmin1=userAdminRepository.findLastUserAdminRegister();
        Store strore=new Store();
        strore.setUserAdminIdUseradmin(userAdmin1);
        stroreRepository.save(strore);
        return userAdmin;
    }

    public UserSeller saveUserSeller(PersonaDto personaDto){
        Persona persona=new Persona();
        persona.setName(personaDto.getName());
        persona.setSecondName(personaDto.getSecondName());
        persona.setLastName(personaDto.getLastName());
        persona.setMail(personaDto.getMail());
        persona.setPassword(personaDto.getPassword());
        persona.setNicknameUser(personaDto.getNicknameUser());
        personaRepository.save(persona);
        Persona persona1=personaRepository.findPersonabyNicknamePassword(personaDto.getNicknameUser(),personaDto.getPassword());
        UserSeller userSeller=new UserSeller();
        userSeller.setPersonaIdUser(persona1);
        userSellerRepository.save(userSeller);
        Store strore=stroreRepository.findLastStroreRegister();
        userSeller.setStroreIdStore(strore);
        userSellerRepository.save(userSeller);
        return userSeller;
    }

    //-------------------------------------------------------------------------------------------

}
