package com.pgo13;

import java.util.UUID;

public class Admin extends Employee {
    String uniqueID;

    public Administrator(String name, String surname) {
        super(name, surname);
        this.uniqueID = UUID.randomUUID().toString();
    }




}