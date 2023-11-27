package com.web.microchat.mapper;

public interface UserMapper<User> {

    int insertUser(User user);

    int login(String username, String password);

    int updateUser(User user);
}
