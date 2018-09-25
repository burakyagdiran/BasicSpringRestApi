package com.restapiproject.RestApp.controller;

import com.restapiproject.RestApp.entity.User;
import com.restapiproject.RestApp.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserDAO userDAO;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return  userDAO.getAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userDAO.create(user);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable("id") Long id,@RequestBody User user){
        return userDAO.update(id,user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userDAO.delete(id);
    }
}
