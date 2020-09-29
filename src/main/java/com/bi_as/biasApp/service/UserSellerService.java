package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.UserSellerRepository;
import com.bi_as.biasApp.domain.Persona;
import com.bi_as.biasApp.domain.UserSeller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
