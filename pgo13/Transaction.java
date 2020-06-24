package com.pgo13;

public class Transaction {

    private double amountOfTransaction;
    private BankAccount accountSending;
    private BankAccount accountReceiving;

    public Transaction(double amountOfTransaction, BankAccount accountSending, BankAccount accountReceiving) {
        this.amountOfTransaction = amountOfTransaction;
        this.accountSending = accountSending;
        this.accountReceiving = accountReceiving;
    }

    public void getTransactionData() {
        System.out.println("amount: "+amountOfTransaction+ "sent from: "+accountSending+" sent to: "+accountReceiving);
    }
}
