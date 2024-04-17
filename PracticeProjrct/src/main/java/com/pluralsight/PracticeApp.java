package com.pluralsight;

import java.util.Scanner;

public class PracticeApp {

    public static void main(String[] args) {

//        int high = 6;
//        int low = 1;
//
//        double randomNumber = Math.random() * (high - low);
//
//        System.out.println((int) randomNumber + 1);

//        String name = "Raymond";
//        String nam = name.substring(0, 3);
//
//        System.out.println(nam);

//        double  num1 = 7;
//        double num2 = 2;
//
//        double result = num1 / num2;
//
//        System.out.println(result);

        // create a scanner object
        Scanner scanner = new Scanner(System.in);


//        System.out.println("Please enter your name");
//        System.out.print("First name: ");
//        String firstName = scanner.nextLine().trim();
//
//        System.out.print("Middle name: ");
//        String middleName = scanner.nextLine().trim();
//
//        System.out.print("Last name: ");
//        String lastName = scanner.nextLine().trim();
//
//        System.out.print("Suffix: ");
//        String suffix = scanner.nextLine().trim();
//
//        // Construct full name based on user input
//        StringBuilder fullNameBuilder = new StringBuilder(firstName);
//        if (!middleName.isEmpty()) {
//            fullNameBuilder.append(" ").append(middleName);
//        }
//        fullNameBuilder.append(" ").append(lastName);
//        if (!suffix.isEmpty()) {
//            fullNameBuilder.append(", ").append(suffix);
//        }
//
//        String fullName = fullNameBuilder.toString();
//        System.out.println("Full name: " + fullName);


        // prompt the user to enter their first name and trim any trailing space
        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();

        // prompt the user to enter their middle name and trim any trailing space
        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();

        // prompt the user to enter their last name and trim any trailing space
        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        // prompt the user to enter their suffix and trim any trailing space
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        // Construct full name based on user input
        String fullName = firstName;
        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }

        // add first name, and possibly middle name to first name
        fullName += " " + lastName;
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("Full name: " + fullName);


    }

}
