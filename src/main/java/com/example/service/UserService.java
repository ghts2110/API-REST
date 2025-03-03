package com.example.service;

import com.example.domain.model.User;

public interface UserService
{
    public User findUserById(Long id);
    public User createUser(User user);
    public User updateUser(Long id, User user);
}
