package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.ProfileEditRequest;
import com.example.backend.entity.User;
import com.example.backend.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    

    @GetMapping("/get")
    public List<User>getUser(){
        return userService.getUser();
    }

    @GetMapping("/get/{email}")
    public User getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }
    @PutMapping("/put/{email}")
    public boolean deleteFarmer(@RequestBody ProfileEditRequest request , @PathVariable String email){
        return userService.editUser(request , email);
    }
}
