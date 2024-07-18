package com.bearingpoint.todo.controller;

import com.bearingpoint.todo.entity.Users;
import com.bearingpoint.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public void addUser(@RequestBody Users user){
        userService.addUser(user);
    }

    @GetMapping
    public List<Users> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping(path="{id}")
    public Users getUserById(@PathVariable("id") int id){
        return userService.getUserById(id).orElse(null);
    }

    @DeleteMapping(path="{id}")
    public void deleteUserById(@PathVariable("id") int id){
        userService.deleteUser(id);
    }

    @PutMapping(path="{id}")
    public ResponseEntity<Void> updateUser(@PathVariable("id") int id, @RequestBody Users userToUpdate){
        if (userService.getUserById(id).isPresent()) {
            userService.updateUser(id, userToUpdate);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
