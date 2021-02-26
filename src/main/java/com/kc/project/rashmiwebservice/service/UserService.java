package com.kc.project.rashmiwebservice.service;

import com.kc.project.rashmiwebservice.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User save(User user);
    User fineOne(int id);

   User updateUser(User user);
   boolean deleteById(int id);


}
