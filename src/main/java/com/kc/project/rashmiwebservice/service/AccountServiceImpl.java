package com.kc.project.rashmiwebservice.service;

import com.kc.project.rashmiwebservice.model.AccountDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    //creating array list which accepts user objects
    static final List<AccountDetails> account = new ArrayList<>();


    static {
        account.add(new AccountDetails(1,"Rashmi","0111",new Date()));
        account.add(new AccountDetails(2,"bhuvik","0122",new Date()));
        account.add(new AccountDetails(3,"srini","2223",new Date()));
    }

    @Override
    public List<AccountDetails> findAccountDetails() {
        return account;
    }
}
