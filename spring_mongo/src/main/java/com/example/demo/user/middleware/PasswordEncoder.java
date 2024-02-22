package com.example.demo.user.middleware;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class PasswordEncoder {
    public String passwordHash(String password){
        BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder(10,new SecureRandom());
        return passwordEncoder.encode(password);
    }
}
