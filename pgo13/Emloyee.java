package com.pgo13;

import java.util.UUID;

public class Employee extends User {
    String uniqueID;

    public Employee(String name, String surname) {
        super(name, surname);
        this.uniqueID = UUID.randomUUID().toString();
    }

}