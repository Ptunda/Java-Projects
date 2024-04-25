
// Develop a simple calculator program that performs arithmetic operations
// Implement input validation using try-catch blocks to handle arithmetic exceptions such as division by zero or invalid input

// 1. import the Scanner class and create a Scanner object in the main method
// 2. prompt the user to enter first number, choose operator, and enter second number
// 3. surround this block of code with a try-catch block, bar step 1. Declare an ArithmeticException in the catch block
// 4. check if user choose the / operator and enters 0 as the second number, throw a custom ArithmeticException and display message
// 5. otherwise, check if the user has a different condition from the one in step 4, compute the result and display answer


package com.pluralSight;

import java.util.Scanner;

public class CalculatorInputValidator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {


            System.out.print("Enter first number: ");
            double firstNumber = in.nextDouble();
            in.nextLine();

            System.out.print("Choose operator (+, -, *, /): ");
            String response = in.nextLine();

            System.out.print("Enter second number: ");
            double secondNumber = in.nextDouble();


            if ((response.equals("/")) && (secondNumber == 0)) {

                throw new ArithmeticException("Division by zero is not allowed");

            }

            double result = (response.equals("+")) ? firstNumber + secondNumber : (response.equals("-")) ? firstNumber - secondNumber : (response.equals("*")) ? firstNumber * secondNumber : firstNumber / secondNumber;


            System.out.printf("%.3f", result);

            in.close();

        } catch (ArithmeticException e) {

            System.out.println("An ArithmeticException occurred! " + e.getMessage());

        }

    }
}
