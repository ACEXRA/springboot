package com.example.demo.auth.service;

import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{
    public String signIn(){
        return "User Signed In";
    }
    public String signOut(){
        return "User signed Out";
    }
}
