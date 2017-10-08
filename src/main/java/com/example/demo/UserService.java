package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private List<User> users  = new ArrayList<>();

    public List<User> getAllUsers() {
        users  = new ArrayList<>();
        userRepository.findAll().forEach(users::add); //use this as a return
        return users;
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public void removeUsers (){
        userRepository.deleteAll();
    }
}
