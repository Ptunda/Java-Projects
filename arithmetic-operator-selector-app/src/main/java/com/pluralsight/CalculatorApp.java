
// Create a simple command-line calculator application that performs basic arithmetic operations (addition, subtraction, multiplication, division).
// Use the conditional operator to handle user input for selecting operations.


package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);


        // array of arithmetic operations
        String[] arithmeticOperations = {"Addition", "Subtraction", "Multiplication", "Division", "Remainder"};



        // prompt the user to enter which type of arithmetic operation they want to do
        System.out.print("Enter intended operation \n" + "(Addition = 1, Subtraction = 2, Multiplication = 3, Division = 4, or Remainder = 5): ");
        int response = myScanner.nextInt();



        // check their response and propose an operator to use
        char operator = (response == 1) ? '+' : (response == 2) ? '-' : (response == 3) ? '*' : (response == 4) ? '/' : '%';



        System.out.println("\n=============================================================================================\n");



        // check for appropriate operator and display confirmation message to the user
        switch (operator){
            case '+':
                System.out.printf("Your choice of operation is %s. Please use the `%c` operator.\n", arithmeticOperations[0], operator);
                break;
            case '-':
                System.out.printf("Your choice of operation is %s. Please use the `%c` operator.\n", arithmeticOperations[1], operator);
                break;
            case '*':
                System.out.printf("Your choice of operation is %s. Please use the `%c` operator.\n", arithmeticOperations[2], operator);
                break;
            case '/':
                System.out.printf("Your choice of operation is %s. Please use the `%c` operator.\n", arithmeticOperations[3], operator);
                break;
            case '%':
                System.out.printf("Your choice of operation is %s. Please use the `%c` operator.\n", arithmeticOperations[4], operator);
                break;

        }

    }
}
