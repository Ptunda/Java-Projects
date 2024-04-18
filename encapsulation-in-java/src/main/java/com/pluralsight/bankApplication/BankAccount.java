package com.pluralsight.bankApplication;

// prevent the direct access to internal attributes like accountNumber, ownerName, and routingNumber

public class BankAccount {

    // provide some internal attributes
    private String accountNumber;
    private double balance;
    private String ownerName;

    // create a constructor that sets account balance to 0 by default
    public BankAccount(String accountNumber, String ownerName) {

        this.accountNumber = accountNumber;
        this.balance = 0;
        this.ownerName = ownerName;

    }

    // create deposit() and withdraw() methods that modify account balance when invoked in the main() method
    public void deposit(double amount) {

        this.balance += amount;

    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }

    }

    public double getBalance() {

        return balance;

    }

    public String getAccountNumber() {
        return accountNumber;

    }

    public String getOwnerName() {
        return ownerName;

    }


}
