package com.example.demo.user.controller;

import ch.qos.logback.core.helpers.NOPAppender;
import com.example.demo.user.entity.UserModel;
import com.example.demo.user.exception.NoUserExistException;
import com.example.demo.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserControllerImpl implements UserController{
    @Autowired
    private UserServiceImpl userService;
    @GetMapping()
    public List<UserModel> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/register")
    public UserModel registerUser(@RequestBody UserModel user){
        return userService.registerUser(user);
    }
    @GetMapping("/{id}")
    public Optional<UserModel> getById(@PathVariable(value = "id") String id){
        return userService.getById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable(value = "id")String id) {
        return userService.deleteUser(id);
    }
    @PutMapping("/update")
    public UserModel updateUser(@RequestBody UserModel user){
        return userService.updateUser(user);
    }
}
