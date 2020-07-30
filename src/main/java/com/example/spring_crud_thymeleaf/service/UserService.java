package com.example.spring_crud_thymeleaf.service;

import com.example.spring_crud_thymeleaf.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUser();

    void saveUser(User user);

    void deleteUser(int id);

    Optional<User> findUserById(int id);


}
