package com.company;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String information;

    //registered account
    public User(String name, String lastName, String email, String password){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        information = "This is user account.";
    }

    //guest account
    public User(String email){
        this.email = email;
        information = "This is guest account.";
    }

    public void createUserFromGuest(String name, String lastName, String password){
        if(information == "This is guest account"){
            this.name = name;
            this.lastName = lastName;
            this.password = password;
            information = "This is user account.";
        } else {
            System.out.println("This account is already user account.");
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
