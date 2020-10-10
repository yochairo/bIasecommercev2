package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.UserAdmin;
import com.bi_as.biasApp.domain.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserClientRepository extends JpaRepository<UserClient, Integer> {

    @Query(value = "select * from user_client where id_store=?1",nativeQuery = true)
    UserAdmin findcliente(int idstore);
    @Query(value = "select * from user_client ",nativeQuery = true)
    List<UserClient> findclientlist();
}
