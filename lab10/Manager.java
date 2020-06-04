package com.lab10;

public class Manager extends Employee {
    double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    public double getSalary(){
        return salary+bonus;
    }

    public String toString(){
        return "Manager with lastName " + lastName + " and age " + getAge() + " has salary " + getSalary();
    }
}