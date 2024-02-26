package com.example.demo.user.service;

import com.example.demo.user.entity.UserModel;
import com.example.demo.user.exception.NoUserExistException;
import com.example.demo.user.exception.UserAlreadyExistException;
import com.example.demo.user.middleware.PasswordEncoder;
import com.example.demo.user.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder userHelper;

    public List<UserModel> getAllUser(){
        return userRepository.findAll();
    }
    public UserModel registerUser(UserModel user){
        UserModel existingUser=userRepository.findByEmail(user.getEmail()).orElse(null);
        if(existingUser==null){
            user.setPassword(userHelper.passwordHash(user.getPassword()));
            return userRepository.save(user);
        }else{
            throw new UserAlreadyExistException("User Already Exist");
        }
    }
    public Optional<UserModel> getById(String id){
        return userRepository.findById(id);
    }
    public String deleteUser(String id){
        if(userRepository.findById(id).isPresent()){
            userRepository.delete(userRepository.findById(id).get());
            return "User Deleted Successfully";
        }else{
            throw new NoUserExistException("No Such User Exist");
        }
    }
    public UserModel updateUser(UserModel user){
        System.out.println(user.getId());
        Optional<UserModel> check=userRepository.findById(user.getId());
        if(check!=null){
            UserModel existingUser=check.get();
            existingUser.setEmail(user.getEmail());
            existingUser.setName(user.getName());
            existingUser.setPassword(userHelper.passwordHash(user.getPassword()));
            existingUser.setRole(user.getRole());
            return userRepository.save(existingUser);

        }else{
            throw new NoUserExistException("No User present");
        }
    }
}
