package com.f1.racing.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String userName, String password){
        boolean isUserNameValid = userName.equalsIgnoreCase("Adrien");
        boolean isPasswordValid = password.equalsIgnoreCase("redbull");
        return isPasswordValid && isUserNameValid;
    }
}
