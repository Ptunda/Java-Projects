package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        // instantiate the Scanner class
        Scanner scanner = new Scanner(System.in);

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

        // add last name, and possibly middle name to first name
        fullName += " " + lastName;

        // check if user has a suffix and add it to the full name
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("Full name: " + fullName);

    }
}
