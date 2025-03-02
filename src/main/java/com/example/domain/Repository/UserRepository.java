package com.example.domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    boolean existsByAccountNumber(String accountNumber);
}