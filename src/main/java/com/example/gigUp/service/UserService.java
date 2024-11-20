package com.example.gigUp.service;

import java.util.List;
import java.util.Optional;

import com.example.gigUp.model.User;

public interface UserService {
    List<User> getAllUsers();
    Optional<User>getUserById(Long id);
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(User user);
}
