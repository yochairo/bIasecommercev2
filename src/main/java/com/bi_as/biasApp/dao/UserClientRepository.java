package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.Persona;
import com.bi_as.biasApp.domain.Product;
import com.bi_as.biasApp.domain.UserAdmin;
import com.bi_as.biasApp.domain.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserClientRepository extends JpaRepository<UserClient, Integer> {

    @Query(value = "select * from  user_client where persona_id_user=?1",nativeQuery = true)
    UserClient finduserclient(Persona persona);

    @Query(value = "select * from  user_client where id_userclient=?1",nativeQuery = true)
    UserClient finduserbyidclient(int id);

    @Query(value = "select * from user_client where active=1",nativeQuery = true)
    List<UserClient> findclientlist();
}
