package com.pluralsight.bankApplication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String accountNumber;
        String ownerName;

        // prompt the user to enter their account number and account name
        System.out.print("Enter account number: ");
        accountNumber = myScanner.nextLine();

        System.out.print("Enter account name: ");
        ownerName = myScanner.nextLine();

        // create an object of the BankAccount class
        BankAccount myBankAccount = new BankAccount(accountNumber, ownerName);

        // display initial account balance
        System.out.printf("Dear %s, your account balance is $%.2f. \n", myBankAccount.getOwnerName(), myBankAccount.getBalance());

        // let the user make a $776.53 deposit
        System.out.print("Enter your deposit: ");
        double depositAmount = myScanner.nextDouble();

        // display new improved account balance
        myBankAccount.deposit(depositAmount);
        System.out.printf("Your new account balance is $%.2f \n", myBankAccount.getBalance());

        // let the user make a $30.66 withdraw
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = myScanner.nextDouble();

        // display new reduced account balance
        myBankAccount.withdraw(withdrawAmount);
        System.out.printf("Your new account balance is $%.2f \n", myBankAccount.getBalance());


        // let the user try to make a $3000.66 withdraw
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount2 = myScanner.nextDouble();

        // display new reduced account balance
        myBankAccount.withdraw(withdrawAmount2);
        System.out.printf("Your new account balance is $%.2f \n", myBankAccount.getBalance());

    }
}
