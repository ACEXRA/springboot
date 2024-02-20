package com.example.demo.user.controller;

import com.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllerImpl implements UserController{
    @Autowired
    private UserService userService
    @GetMapping()
    public String getAllUser(){
        return userService.getAllUser();
    }
}
