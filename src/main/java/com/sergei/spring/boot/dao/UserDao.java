package com.sergei.spring.boot.dao;



import com.sergei.spring.boot.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUserByName(String name);
}
