package com.restapiproject.RestApp.dao;

import com.restapiproject.RestApp.repository.UserRepository;
import com.restapiproject.RestApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class UserDAO {

    @Autowired
    UserRepository userRepository;

    // Search all users
    public List<User> getAll() {
        return userRepository.findAll();
    }

    /*Search one user
    public Optional<User> find(Long id){
        return userRepository.findById(id);
    }*/

    // Create new user
    public User create( User user){
        return userRepository.save(user);
    }

    // Update user
    public User update(@PathVariable("id") Long id,@RequestBody User user){
        user.setId(id);
        return  userRepository.save(user);
    }

    // delete user
    public void delete(@PathVariable("id") Long id) {
        userRepository.deleteById(id);
    }
}
