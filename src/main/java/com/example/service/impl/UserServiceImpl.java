package com.example.service.impl;

import com.example.domain.Repository.UserRepository;
import com.example.domain.model.User;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User createUser(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number already exists");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public User updateUser(Long id, User userToUpdate) {
        if (!userRepository.existsById(id)) {
            throw new NoSuchElementException("User with id " + id + " not found");
        }
        userToUpdate.setID(id); // Garantir que o ID do usuário será mantido durante a atualização
        return userRepository.save(userToUpdate);
    }

    @Override
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new NoSuchElementException("User with id " + id + " not found");
        }
        userRepository.deleteById(id);
    }
}
