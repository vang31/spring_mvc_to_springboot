package com.viet.springboot.springboot_crud.service;



import com.viet.springboot.springboot_crud.dao.UserDao;
import com.viet.springboot.springboot_crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public User findById(int id) {
        return userDao.findById(id);
    }

//
    @Override
    @Transactional
    public void deleteById(int id) {
        userDao.deleteById(id);

    }
}
