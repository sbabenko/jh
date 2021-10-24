package com.babenko.auth.service;

import com.babenko.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
