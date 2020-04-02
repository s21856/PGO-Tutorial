package com.lab05;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String information;

    //normal account
    public User(String name, String lastName, String email, String password){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        information = "This is an user account.";
    }

    //guest account
    public User(String email){
        this.email = email;
        information = "This is a guest account.";
    }

    public void createUserFromGuest(String name, String lastName, String password){
        if(information == "This is a guest account"){
            this.name = name;
            this.lastName = lastName;
            this.password = password;
            information = "This is an user account.";
        } else {
            System.out.println("This account is already an user account.");
        }
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getInformation() {
        return information;
    }
}
