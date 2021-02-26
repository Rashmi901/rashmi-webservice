package com.kc.project.rashmiwebservice.controller;

import com.kc.project.rashmiwebservice.model.HelloWorldPath;
import com.kc.project.rashmiwebservice.model.User;
import com.kc.project.rashmiwebservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserDetailsController {


    private final UserService userService ;

    public UserDetailsController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldPath helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldPath(String.format("Hello World,%s",name));
    }
    @PostMapping(path="/add-user")
    public User addUserDetails(@RequestBody User user){
        return  userService.save(user);
   }

    @GetMapping(path="/user/{id}") // using pathVariable here 'id' is a pathVariable
    public User getUserDetails(@PathVariable int id){
        return  userService.fineOne(id);
    }

    @GetMapping(path="/user")
    public User getUsers(@RequestParam int id){
        return  userService.fineOne(id);
    }

    @GetMapping (path = "/all-user-details")
    public List<User> getUsersList(){
        return userService.findAll();
    }

    @PostMapping(path = "/update-user")
    public User updateUser(@RequestBody User user)
    {
        return userService.updateUser(user);
    }

    @DeleteMapping(path = "user/{id}")
    public void deleteUser(@PathVariable int id)
     {
         userService.deleteById(id);
     }
}
