package com.xeoman.account.service;

import com.xeoman.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
