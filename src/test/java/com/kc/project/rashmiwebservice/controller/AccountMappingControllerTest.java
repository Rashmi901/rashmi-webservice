package com.kc.project.rashmiwebservice.controller;

import com.kc.project.rashmiwebservice.controller.AccountMapingController;
import com.kc.project.rashmiwebservice.model.AccountDetails;
import com.kc.project.rashmiwebservice.service.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class AccountMappingControllerTest {
    /*
      public List<AccountDetails> getUsersList(){
        return accountServicec.findAccountDetails();
    }
    * */
    private AccountMapingController accountMapingController;

    @BeforeEach
    void setUp() {
        AccountService accountService = mock(AccountService.class);
        accountMapingController = new AccountMapingController(accountService);
    }

    @Test
    void getUsersList() {
        List<AccountDetails> list = new ArrayList<>();
        assertEquals(list,accountMapingController.getUsersList());
    }
}
