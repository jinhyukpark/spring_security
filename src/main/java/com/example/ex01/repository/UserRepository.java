package com.example.ex01.repository;

import com.example.ex01.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    public User findByUserName(String username);
}
