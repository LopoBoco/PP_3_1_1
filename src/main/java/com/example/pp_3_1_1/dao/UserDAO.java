package com.example.pp_3_1_1.dao;


import com.example.pp_3_1_1.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    User getUserById(long id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

}
