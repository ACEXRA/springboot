package com.example.demo.user.service;

import com.example.demo.user.entity.UserModel;

import java.util.List;

public interface UserService {
    public List<UserModel> getAllUser();
    public UserModel registerUser(UserModel a);
}
