package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.dto.ProfileEditRequest;
import com.example.backend.entity.User;
import com.example.backend.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;


    public List<User> getUser(){
        return repo.findAll();
    }

    public boolean editUser(ProfileEditRequest request , String email) {
       
        User user = repo.findByEmail(email).get();

        if(user != null){

            if(request.getUsername() != null){
                user.setName(request.getUsername());
            }
            if(request.getMobileNumber() != null){
                user.setPhoneNumber(request.getMobileNumber());
            }

            repo.saveAndFlush(user);  
            return true;         
        }

        return false;
    }

    public User getUserByEmail(String email) {
       return repo.findByEmail(email).get();
    }
}
