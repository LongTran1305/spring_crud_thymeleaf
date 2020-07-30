package com.example.spring_crud_thymeleaf.repository;

import com.example.spring_crud_thymeleaf.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,Integer> {
}
