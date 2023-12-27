package com.rohit.atal.Library.controller;

import com.rohit.atal.Library.Model.User;
import com.rohit.atal.Library.service.NotAvailableException;
import com.rohit.atal.Library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
        return userService.getUserById(Integer.parseInt(id));
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping(path = "/{id}", consumes = "application/json")
    public void updateUser(@PathVariable String id, @RequestBody User updatedUser){
        try {
            userService.updateUser(Integer.parseInt(id),updatedUser);
        } catch (Exception e) {
            System.out.println("Book not found. " + e);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(Long.valueOf(id));
    }
}
