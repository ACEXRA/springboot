package com.example.demo.user.service;

import com.example.demo.user.entity.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<UserModel> getAllUser();
    public UserModel registerUser(UserModel a);
    public Optional<UserModel> getById(String id);
    public String deleteUser(String id);
    public UserModel updateUser(UserModel user);
}
