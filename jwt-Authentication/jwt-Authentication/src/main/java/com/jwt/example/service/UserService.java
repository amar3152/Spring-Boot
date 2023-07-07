package com.jwt.example.service;

import com.jwt.example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new  ArrayList<>();


    public UserService(){

        store.add(new User(UUID.randomUUID().toString(),"Amar Bhoite","ab@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Aditya Nanaware","aditya@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Manu Shinde","manu@gmail.com"));

    }

    public List<User> getStore(){
        return  this.store;
    }
}
