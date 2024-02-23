package com.example.demo.user.controller;

import com.example.demo.user.entity.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface UserController {
    public List<UserModel> getAllUser();
    public UserModel registerUser(UserModel user);
    public Optional<UserModel> getById(String id);
    public String deleteUser(String id);
}
