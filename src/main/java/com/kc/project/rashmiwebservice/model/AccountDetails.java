package com.kc.project.rashmiwebservice.model;

import lombok.Data;

import java.util.Date;
@Data
public class AccountDetails {

    //creat a private instance variable

    private int id;
    private String name;
    private String accountNumber;
    private Date DOD;

    public AccountDetails(int id, String name, String accountNumber, Date DOD) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.DOD = DOD;
    }
    @Override
    public String toString() {
        return "AccountDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", DOD=" + DOD +
                '}';
    }

}

