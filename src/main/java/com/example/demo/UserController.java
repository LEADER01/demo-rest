package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    //why not go for constructor based instead?

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/get-all-users", method = RequestMethod.GET)
    public List<Userr> response() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/delete-all-users", method = RequestMethod.GET)
    public String deleteAllUsers() {
        userService.removeUsers();
        return "All entities has been deleted";
    }

    @RequestMapping(value = "/add-user", method = RequestMethod.GET)
    public String addUser(@RequestParam(value="name", defaultValue="Anonymous") String name) {
        userService.addUser(new Userr((int) counter.incrementAndGet(), name));
        return "user " +name+" added";
    }

}
