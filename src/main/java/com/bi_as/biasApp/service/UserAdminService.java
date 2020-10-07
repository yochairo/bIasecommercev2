package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.PersonaRepository;
import com.bi_as.biasApp.dao.StroreRepository;
import com.bi_as.biasApp.dao.UserAdminRepository;
import com.bi_as.biasApp.domain.Persona;
import com.bi_as.biasApp.domain.Store;
import com.bi_as.biasApp.domain.UserAdmin;
import org.springframework.stereotype.Service;

@Service
public class UserAdminService  {
    UserAdminRepository userAdminRepository;
    PersonaRepository personaRepository;
    StroreRepository stroreRepository;

    public UserAdminService(UserAdminRepository userAdminRepository,PersonaRepository personaRepository, StroreRepository stroreRepository) {
        this.userAdminRepository = userAdminRepository;
        this.personaRepository=personaRepository;
        this.stroreRepository=stroreRepository;
    }
    public UserAdmin finduseradminbyId(int id){
        return userAdminRepository.finduseradmin(id);
    }


    //--------------------------------------------------------------------------
    public UserAdmin saveUserAdmin(int idPersona){
        Persona persona=//personaRepository.findByIdUser(idPersona);
                new Persona();
        UserAdmin userAdmin=new UserAdmin();
        userAdmin.setPersonaIdUser(persona);
        Store strore=new Store();
        strore.setUserAdminIdUseradmin(userAdmin);
        return userAdmin;
    }
}
