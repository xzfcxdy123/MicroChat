package com.web.microchat.service;

import com.web.microchat.entity.User;
import com.web.microchat.mapper.UserMapper;

public class UserService implements UserMapper<User> {
    @Override
    public int insertUser(User user) {
        return 0;
    }

    @Override
    public int login(String username, String password) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }
}
