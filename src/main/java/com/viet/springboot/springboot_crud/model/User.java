package com.viet.springboot.springboot_crud.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

//    public User() {
//    }
//
//    public User(int id, String name, String lastName, int age) {
//        this.id = id;
//        this.name = name;
//        this.lastName = lastName;
//        this.age = age;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
