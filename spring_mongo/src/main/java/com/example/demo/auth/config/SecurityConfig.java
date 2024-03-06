package com.example.demo.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

//    pubic SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        return http
////                .authorizeHttpRequests()
//                .requestMatchers("/auth/welcome")
//
//    }
}
