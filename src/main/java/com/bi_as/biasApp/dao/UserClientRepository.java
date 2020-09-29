package com.bi_as.biasApp.dao;

import com.bi_as.biasApp.domain.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserClientRepository extends JpaRepository<UserClient, Integer> {

}
