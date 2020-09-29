package com.bi_as.biasApp.service;

import com.bi_as.biasApp.dao.UserRepository;
import com.bi_as.biasApp.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceXImp implements UserServiceX {
    @Autowired
    private UserRepository repositorio;

    @Override
    public List<User> listar() {
        return repositorio.findAll();
    }

    @Override
    public User listarId(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public User add(User p) {
        return repositorio.save(p);
    }

    @Override
    public User edit(User p) {
        return repositorio.save(p);
    }

    @Override
    public User delete(int id) {
        User p=repositorio.findOne(id);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}