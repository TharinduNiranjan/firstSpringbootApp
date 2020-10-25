package com.example.demo.repositeries;

import com.example.demo.domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositeries  extends JpaRepository<UserDomain,Integer> {
    void deleteById(UserDomain delUserData);
}
