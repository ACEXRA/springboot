package com.example.demo.user.service;

import com.example.demo.user.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    public String getAllUser(){
        return "From Service layer";
    }
}
