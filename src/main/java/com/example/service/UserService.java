package com.example.service;

import com.example.Repository.UserRepository;
import com.example.demo.User;

public interface UserService
{
    public User findUserById(Long id);
    public User createUser(User user);
}
