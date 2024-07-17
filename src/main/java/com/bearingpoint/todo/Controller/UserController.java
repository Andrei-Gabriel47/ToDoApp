package com.bearingpoint.todo.Controller;

import com.bearingpoint.todo.Model.User;
import com.bearingpoint.todo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/users")
@RestController
public class UserController
{
   private final UserService userService;

   @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Iterable<User> getAllUsers()
    {
        return userService.findAllUsers();
    }
    @GetMapping(path = "{Id}")
    public Optional<User> getUserById(@PathVariable("Id") int Id)
    {
       return userService.findUserById(Id);
    }
    @PostMapping
    public void addUser(@RequestBody User user)
    {
        System.out.println("Received User object: " + user.getUsername()+ user.getEmail());
        userService.addUser(user);
    }
    @PutMapping(path = "{Id}")
    public void updateUser(@PathVariable("Id") int Id, @RequestBody User user)
    {
        userService.updateUser(Id,user);
    }
    @DeleteMapping(path = "{Id}")
    public void deleteUser(@PathVariable("Id") int Id)
    {
        userService.deleteUser(Id);
        System.out.println("User deleted!");
    }
}
