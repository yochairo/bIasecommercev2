package com.bi_as.biasApp.service;

import com.bi_as.biasApp.domain.User;

import java.util.List;

public interface UserServiceX {
    List<User> listar();
    User listarId(int id);
    User add(User p);
    User edit(User p);
    User delete(int id);
}
