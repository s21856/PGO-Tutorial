package com.pgo13;

public interface AccountOperations {

    void checkBalance();
    void transfer(BankAccount accountSending, double amount, BankAccount accoundRecieving) throws AccountOperationException;
    void pay();


}