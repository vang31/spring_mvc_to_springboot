package com.viet.springboot.springboot_crud.service;//package ru.viet.springmvctospringboot.demo.service;
//



import com.viet.springboot.springboot_crud.model.User;

import java.util.List;

public interface UserService {


    //read
    List<User> getAllUsers();

    //create-update
    void saveUser(User user);

    User findById(int id);
//
//    //delete
    void deleteById(int id);

}
