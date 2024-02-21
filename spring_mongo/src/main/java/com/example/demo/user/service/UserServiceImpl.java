package com.example.demo.user.service;

import com.example.demo.user.entity.UserModel;
import com.example.demo.user.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getAllUser(){
        return userRepository.findAll();
    }
    public UserModel registerUser(UserModel user){
        return userRepository.save(user);
    }
}
