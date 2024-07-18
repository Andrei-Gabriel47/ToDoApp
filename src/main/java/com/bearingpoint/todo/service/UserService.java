package com.bearingpoint.todo.service;


import com.bearingpoint.todo.repository.UserRepository;
import com.bearingpoint.todo.entity.Users;
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

    public void addUser(Users user){

        userRepository.save(user);
    }

    public List<Users> getAllUser(){
        return  (List<Users>) userRepository.findAll();
    }

    public Optional<Users> getUserById(int id){
        return userRepository.findById(id);
    }

    public void deleteUser(int id){
        userRepository.deleteById(id);
    }

    public void updateUser(int id, Users newUser){
        Optional<Users> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            Users existingUser = optionalUser.get();
            existingUser.setUsername(newUser.getUsername());
            existingUser.setEmail(newUser.getEmail());
            existingUser.setPassword(newUser.getPassword());
            userRepository.save(existingUser);
        }
    }
}
