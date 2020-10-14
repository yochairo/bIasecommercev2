package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona,Integer> {

//    Persona findByIdUser(Integer idUser);


    @Query(value = "select * from  persona where id_user=?1",nativeQuery = true)
    Persona findPersonabyidUser(int var1);

    @Query(value = "select * from  persona where nickname_user=?1 and password=?2",nativeQuery = true)
    Persona findPersonabyNicknamePassword(String nickname,String password);

    @Query(value = "select * from  persona where nickname_user=?1 ",nativeQuery = true)
    Persona findPersonabyNickname(String nickname);

    @Query(value = "select * from  persona",nativeQuery = true)
    List<Persona> findPersonalist();


}
