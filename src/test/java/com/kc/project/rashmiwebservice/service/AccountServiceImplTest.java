package com.kc.project.rashmiwebservice.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceImplTest {

    private AccountServiceImpl accountserviceimpl;
    @BeforeEach
    void setup() {
        accountserviceimpl = new AccountServiceImpl();
    }

    @Test
    void testFindAccountDetails() {
        assertEquals(3,accountserviceimpl.findAccountDetails().size());
        assertNotNull(accountserviceimpl.findAccountDetails());
    }
}
