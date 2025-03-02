package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}