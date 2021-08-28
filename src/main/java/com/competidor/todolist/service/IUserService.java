package com.competidor.todolist.service;

import com.competidor.todolist.entity.User;

import java.util.List;
import java.util.Optional;


public interface IUserService {

    public User save(User user);
    public List<User> getUsers();
    public Optional<User> getUserById(String userId);
    public Boolean deleteUserById(String userId);
    public Boolean update(User user,String userId);

}