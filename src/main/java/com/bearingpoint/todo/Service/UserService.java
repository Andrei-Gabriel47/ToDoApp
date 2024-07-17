package com.bearingpoint.todo.Service;

import com.bearingpoint.todo.Model.User;
import com.bearingpoint.todo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService
{
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers()
    {
        return  (List<User>) userRepository.findAll();
    }
    public Optional<User> findUserById(int Id)
    {
        return userRepository.findById(Id);
    }
    public void addUser(User user)
    {
        System.out.println("Received User object: " + user.getUsername()+ user.getEmail());
        userRepository.save(user);
    }
    public void updateUser(int Id, User user)
    {
        Optional<User> userToUpdate= userRepository.findById(Id);
        if(userToUpdate.isPresent())
        {
            User updatedUser = userToUpdate.get();
            updatedUser.setUsername(user.getUsername());
            updatedUser.setEmail(user.getEmail());
            updatedUser.setPassword(user.getPassword());
            userRepository.save(updatedUser);
        }
    }
    public void deleteUser(int Id)
    {
        userRepository.deleteById(Id);
    }
}
