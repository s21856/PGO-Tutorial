package com.pgo13;

import java.util.ArrayList;

public class BankAccount implements AccountOperations {

    double accountBalance;
    ArrayList<Transaction> listOfTransactions = new ArrayList<>();

    public BankAccount() {
        this.listOfTransactions = listOfTransactions;
        double accountBalance = 0;
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance: "+accountBalance);
    }


    public void transfer(BankAccount accountSending, double amount, BankAccount accountRecieving) throws AccountOperationException {
        if (amount <= 0) {
            throw new AccountOperationException("Amount cannot be lower than 0");
        } else {
            accountBalance += amount;
            Transaction transaction = new Transaction(amount, accountSending, accountRecieving);
            listOfTransactions.add(transaction);
            transaction.getTransactionData();


        }

    }

    @Override
    public void pay() {

    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}