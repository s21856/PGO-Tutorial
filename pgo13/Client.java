package com.pgo13;

import java.util.UUID;

public class Client extends User {
    BankAccount clientAccount;
    String uniqueID;

    public Client(String name, String surname) {
        super(name, surname);
        this.uniqueID = UUID.randomUUID().toString();
    }

    public void addAccount (BankAccount account){
        this.clientAccount=account;
    }

}