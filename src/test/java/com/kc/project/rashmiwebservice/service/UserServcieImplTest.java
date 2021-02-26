package com.kc.project.rashmiwebservice.service;

import com.kc.project.rashmiwebservice.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServcieImplTest {

    private UserServcieImpl userServcie;

    @BeforeEach
    void setUp() {
        userServcie = new UserServcieImpl();
    }

    @Test
    void findAll() {
        List<User> userList = mock(List.class);
        //List<User> spyList = spy(userList);
        userList.add(new User(1,"Rashmi","female"));
        userList.add(new User(2,"bhuvik","male"));
        userList.add(new User(3,"srini","male"));
        assertNotNull(userServcie.findAll());
        assertEquals(3,userServcie.findAll().size());
        assertEquals("Rashmi",userServcie.findAll().get(0).getName());
    }

    @Test
    void save() {
        User user = mock(User.class);
        assertEquals(user,userServcie.save(user));
    }

    @Test
    void fineOne() {
       assertNotNull(userServcie.fineOne(1));
        assertEquals("bhuvik",userServcie.fineOne(2).getName());
    }

    @Test
    void fineOneNegative() {
        assertNull(userServcie.fineOne(4));
    }

    @Test
    void updateUser() {
        User mockUser = mock(User.class);
        assertNotNull(userServcie.updateUser(mockUser));
        assertEquals(mockUser,userServcie.updateUser(mockUser));
    }

    @Test
    void deleteById() {
        UserServcieImpl spyUserService = spy(userServcie);
        spyUserService.deleteById(1);
        assertTrue(userServcie.deleteById(2));
        verify(spyUserService, times(1)).deleteById(Mockito.anyInt());
    }
    @Test
    void deleteByIdNonExistId() {
        UserServcieImpl userServcie = new UserServcieImpl();
        assertFalse(userServcie.deleteById(15));
    }
}