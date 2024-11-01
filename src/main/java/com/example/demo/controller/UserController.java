package com.example.demo.controller;

import ch.qos.logback.core.model.Model;
import com.example.demo.model.UserDemo;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public void saveUser(@ModelAttribute("user") UserDemo user) {
        System.out.println("firstName: " + user.getFirstName());
        System.out.println("lastName: " + user.getLastName());

        userService.saveOrUpdate(user);
    }
}