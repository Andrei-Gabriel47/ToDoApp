package com.bearingpoint.todo.service;

import com.bearingpoint.todo.entity.User;
import com.bearingpoint.todo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public List<User> getAllUser(){
        return  (List<User>) userRepository.findAll();
    }

    public Optional<User> getUserById(int id){
        return userRepository.findById(id);
    }

    public void deleteUser(int id){
        userRepository.deleteById(id);
    }

    public void updateUser(int id, User newUser){
        if (userRepository.existsById(id)) {
            userRepository.save(newUser);
        }
    }
}
