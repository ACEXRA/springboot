package com.example.demo.auth.controller;

import com.example.demo.auth.service.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthControllerImpl implements AuthController{
    @Autowired
    private AuthServiceImpl authService;
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
    @GetMapping("/signin")
    public String signIn(){
        return authService.signIn();
    }

    @GetMapping("/signout")
    public String signOut(){
        return authService.signOut();
    }
}
