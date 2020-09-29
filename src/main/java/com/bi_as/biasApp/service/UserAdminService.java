package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.UserAdminRepository;
import com.bi_as.biasApp.domain.UserAdmin;
import com.bi_as.biasApp.domain.UserSeller;
import org.springframework.stereotype.Service;

@Service
public class UserAdminService  {
    UserAdminRepository userAdminRepository;

    public UserAdminService(UserAdminRepository userAdminRepository) {

        this.userAdminRepository = userAdminRepository;
    }
    public UserAdmin finduseradminbyId(int id){
        return userAdminRepository.finduseradmin(id);
    }
}
