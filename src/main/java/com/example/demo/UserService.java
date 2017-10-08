package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private List<User> users;

    public List<User> getAllUsers() {
        return users;
    }
}
