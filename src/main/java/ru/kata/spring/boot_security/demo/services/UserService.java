package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    User findUserById(Long id);

    List<User> allUsers();

    void deleteUser(Long id);

    User addUsers(User user);

    void update(User user, Long id);

    User findByName(String name);
}