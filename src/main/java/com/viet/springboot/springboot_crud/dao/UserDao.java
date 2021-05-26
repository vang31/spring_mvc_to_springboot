package com.viet.springboot.springboot_crud.dao;




import com.viet.springboot.springboot_crud.model.User;

import java.util.List;

public interface UserDao {

    //read
    List<User> getAllUsers();

    //create-update
    void saveUser(User user);

    User findById(int id);
//
//    //delete
    void deleteById(int id);

}
