package com.example.demo.services;

import com.example.demo.domain.UserDomain;

import java.util.List;
import java.util.Optional;

public interface UserServices {
    List<UserDomain> findAllUsers();

    String saveUser(UserDomain userData);


    String updateUser(UserDomain newUserData);

    Optional<UserDomain> findbyId(Integer id);

    String deleteUser(UserDomain delUserData);
}
