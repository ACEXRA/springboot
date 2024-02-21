package com.example.demo.user.controller;

import com.example.demo.user.entity.UserModel;

import java.util.List;

public interface UserController {
    public List<UserModel> getAllUser();
    public UserModel registerUser(UserModel user);
}
