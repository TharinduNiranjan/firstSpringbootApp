package com.example.demo.services.impl;

import com.example.demo.domain.UserDomain;
import com.example.demo.repositeries.UserRepositeries;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServices {
    @Autowired
    private UserRepositeries userRepositeries;
    @Override
    public List<UserDomain> findAllUsers() {
        return userRepositeries.findAll();
    }

    @Override
    public String saveUser(UserDomain userData) {
         userRepositeries.save(userData);
         return "Data saved";
    }

    @Override
    public String updateUser(UserDomain newUserData) {
        if(newUserData.getId()!=null){
            userRepositeries.save(newUserData);
            return "Data Updated";
        }else{
            return "Error";
        }

    }

    @Override
    public Optional<UserDomain> findbyId(Integer id) {
        return userRepositeries.findById(id);

    }

    @Override
    public String deleteUser(UserDomain delUserData) {
        if(delUserData.getId()!=null){
            userRepositeries.delete(delUserData);
            return "User Deleted";
        }else {
            return "Error";
        }
    }
}
