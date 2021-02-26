package com.kc.project.rashmiwebservice.controller;

import com.kc.project.rashmiwebservice.model.AccountDetails;
import com.kc.project.rashmiwebservice.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountMapingController {

    private final AccountService accountService;

    public AccountMapingController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping (path = "/all-user-account-details")
    public List<AccountDetails> getUsersList(){
        return accountService.findAccountDetails();
    }
}
