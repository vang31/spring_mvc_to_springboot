package com.viet.springboot.springboot_crud.dao;

import com.viet.springboot.springboot_crud.model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        Session session = entityManager.unwrap(Session.class);
//        List<User> allUsers = session.createQuery("from User", User.class)
//                .getResultList();
        Query<User> query = session.createQuery("from User", User.class);
        List<User> allUsers = query.getResultList();
        return allUsers;
    }

    @Override
    public void saveUser (User user) {

        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(user);
    }

    @Override
    public User findById(int id) {
        Session session = entityManager.unwrap(Session.class);

        User user = session.get(User.class, id);
        return user;
    }


    @Override
    public void deleteById(int id) {
        Session session = entityManager.unwrap(Session.class);
        User delUse = session.byId(User.class).load(id);
        session.delete(delUse);
    }
}
