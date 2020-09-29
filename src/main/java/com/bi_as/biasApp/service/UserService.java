package com.bi_as.biasApp.service;


import com.bi_as.biasApp.dao.UserRepository;
import com.bi_as.biasApp.domain.User;
import com.bi_as.biasApp.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;

    private static final Logger LOGGER= LoggerFactory.getLogger(UserService.class);

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> findAllUser(){
        List<UserDto> UserDtoList = new ArrayList<>();
        for (User user:userRepository.findAll()) {
            UserDtoList.add(new UserDto(user));
        }
        return UserDtoList;
    }

    public User add(User user){
        userRepository.save(user);
        return user;
    }
    public User findIOneUSer(int id){
        return userRepository.findOne(id);
    }

    public User verifyUser(User user){
        User user2=userRepository.findByNameAndPassword(user.getNicknameUser(),user.getPassword());
       // User user2=userRepository.findByNameAndPassword(user.getNicknameUser(),user.getPassword());
        LOGGER.info("ENTRA");

        if (user2 == null) {
            LOGGER.info("no se encontro");
        }else {
            LOGGER.info("SSSSSSIIIIIIII se EEEEEENNNNCCCCOOOONNNNTTTRRRROOO");
        }

        return user2;
    }


    public User getUserByid(int idUser){
        User user=userRepository.findByIdUser(idUser);
        if(user==null){
            LOGGER.info("User vacio");
        }
        return user;
    }

    public User getUserByNickname(String nickname){
        return userRepository.findByNicknameUser(nickname);

    }



}
