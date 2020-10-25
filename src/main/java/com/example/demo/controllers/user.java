package com.example.demo.controllers;

import com.example.demo.domain.UserDomain;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class user {
    @Autowired

    private UserServices userServices;
    @GetMapping("/all")
    public List<UserDomain> allUsers(){
        return userServices.findAllUsers();
    }
    @PostMapping("/add")
    public String addUser(@RequestBody UserDomain userData){
       return userServices.saveUser(userData);
    }
    @PutMapping("/update")
    public String updateUser(@RequestBody UserDomain newUserData){
        return userServices.updateUser(newUserData);
    }
    @GetMapping("/find/{id}")
    public Optional<UserDomain> getUserById(@PathVariable Integer id){
        return userServices.findbyId(id);

    }
    @PutMapping("/delete")
    public  String deleteUser(@RequestBody UserDomain delUserData){
        return userServices.deleteUser(delUserData);
    }
}
