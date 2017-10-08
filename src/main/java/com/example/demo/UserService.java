package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private List<Userr> users  = new ArrayList<>();

    public List<Userr> getAllUsers() {
        users  = new ArrayList<>();
        userRepository.findAll().forEach(users::add); //use this as a return
        return users;
    }

    public void addUser(Userr user){
        userRepository.save(user);
    }

    public void removeUsers (){
        userRepository.deleteAll();
    }
}
