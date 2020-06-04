package com.lab10;

public abstract class Person {
    String firstName, lastName;
    int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public int getAge(){
        return 2020-birthdayYear;
    }
}