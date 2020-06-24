package com.pgo13;

public class Main {

    public static void main(String[] args) throws AccountOperationException {

        Administrator a1 = new Administrator("John", "Administrative");

        Employee e1 = new Employee("Mike", "Hardworking");
        Employee e2 = new Employee("Anette", "Polite");

        Client c1 = new Client("Elyana", "Johnson");
        Client c2 = new Client("Adnan", "Scotto");
        Client c3 = new Client("George", "Watson");
        Client c4 = new Client("Sally", "Smith");

        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount();
        BankAccount ba3 = new BankAccount();
        BankAccount ba4 = new BankAccount();

        c1.addAccount(ba1);
        c2.addAccount(ba2);
        c3.addAccount(ba3);
        c4.addAccount(ba4);

        ba1.setAccountBalance(5000);
        ba2.setAccountBalance(5000);
        ba3.setAccountBalance(5000);
        ba4.setAccountBalance(5000);
        ba4.setAccountBalance(5000);

        ba1.transfer(ba1,2000,ba2);
        ba1.transfer(ba2,2000,ba1);
        ba1.transfer(ba3,3000,ba4);
        ba1.transfer(ba1,1000,ba4);
        ba1.transfer(ba4,500,ba3);
        ba1.transfer(ba2,2000,ba1);




    }
}