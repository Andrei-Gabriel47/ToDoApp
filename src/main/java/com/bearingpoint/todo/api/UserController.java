package com.bearingpoint.todo.api;

import com.bearingpoint.todo.entity.User;
import com.bearingpoint.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/user")
@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping(path="{id}")
    public User getUserById(@PathVariable("id") int id){
        return userService.getUserById(id).orElse(null);
    }

    @DeleteMapping(path="{id}")
    public void deleteUserById(@PathVariable("id") int id){
        userService.deleteUser(id);
    }

    @PutMapping(path="{id}")
    public void updateUser(@PathVariable("id") int id, @RequestBody User userToUpdate){
        userService.updateUser(id, userToUpdate);
    }
}
