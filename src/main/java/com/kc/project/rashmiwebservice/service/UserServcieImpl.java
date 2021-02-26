package com.kc.project.rashmiwebservice.service;

import com.kc.project.rashmiwebservice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServcieImpl implements UserService {
    //creating array list which accepts user objects
    static final List<User> users = new ArrayList<>();
   //creating a int variable
    int idCounter =3;

        static {
            users.add(new User(1,"Rashmi","female"));
            users.add(new User(2,"bhuvik","male"));
            users.add(new User(3,"srini","male"));
        }


    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User save(User user) {
            if(user.getId() == null) {
                idCounter++;
                user.setId(idCounter);
            }
        users.add(user);
        return user;
    }

    @Override
    public User fineOne(int id) {

        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User updateUser(User user) {

            for (User userObj : users) {
            if(userObj.getId().equals(user.getId())){
                userObj.setName(user.getName());
                userObj.setGender(user.getGender());
                break;
            }
        }
        return user;
    }

    public boolean deleteById(int id) {
        User obj =null;
        for (User userObj : users) {
            if(userObj.getId()==id){
             obj= userObj;
             break;
            }
            return false;
        }
        users.remove(obj);
        return true;
    }
}


