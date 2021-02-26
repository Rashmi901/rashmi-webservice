package com.kc.project.rashmiwebservice.controller;

import com.kc.project.rashmiwebservice.model.User;
import com.kc.project.rashmiwebservice.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserDetailsControllerTest {

    private UserDetailsController userDetailsController;
    UserService userService ;

    @BeforeEach
    void setUp() {
        userService = mock(UserService.class);
        userDetailsController = new UserDetailsController(userService);
    }


 /*    @GetMapping(path="/user/{id}") // using pathVariable here 'id' is a pathVariable
    public User getUserDetails(@PathVariable int id){
        return  userService.fineOne(id);
    }
*/
    @Test
    void getUserDetails() {
        User user = mock(User.class);
     when(userService.fineOne(1)).thenReturn(user);
     assertEquals(user, userDetailsController.getUserDetails(1));
    }

    @Test
    void addUserDetails() {
        User user = new User();
        user.setGender("male");
        user.setId(10);

        when(userService.save(Mockito.argThat(argument -> {
            assertEquals("male",argument.getGender());
            assertEquals(10,argument.getId());
            return true;
        }))).thenReturn(user);
        assertEquals(user, userDetailsController.addUserDetails(user));
    }

    @Test
    void testGetUserDetails() {
        User user = new User();
        when(userService.fineOne(Mockito.anyInt())).thenReturn(user);
        assertEquals(user, userDetailsController.getUserDetails(1));
    }
    @Test
    void testGetUserDetailsNegative() {
        when(userService.fineOne(Mockito.anyInt())).thenReturn(null);
        assertEquals(null, userDetailsController.getUserDetails(1));
    }

    @Test
    void getUsersList() {
        List<User> userList = new ArrayList<>();
        List<User> spyList = spy(userList);
        spyList.add(new User(100,"rashmi","female"));
        when(userService.findAll()).thenReturn(spyList);
        when(spyList.size()).thenReturn(0);
        assertEquals(0, userDetailsController.getUsersList().size());
        assertEquals("rashmi", userDetailsController.getUsersList().get(0).getName());
    }

    @Test
    void updateUser() {
        User users = new User();
        when(userService.updateUser(Mockito.any())).thenReturn(users);
        assertNotNull(userDetailsController.updateUser(users));
    }

    @Test
    void deleteUser() {
        userDetailsController.deleteUser(1);
        verify(userService,times(1)).deleteById(1);

    }
}