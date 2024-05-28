package org.example.service;

import org.example.domain.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User findById(Integer id);

    void insertUser(User user);
}