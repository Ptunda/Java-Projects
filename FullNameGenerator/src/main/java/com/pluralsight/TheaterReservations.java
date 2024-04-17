package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // Prompt user for full name
        System.out.println("Please enter your name:");
        String fullName = scanner.nextLine().trim();

        // Prompt user for date of the act
        System.out.println("What date will you be coming (MM/dd/yyyy):");
        String actDate = scanner.nextLine().trim();


        LocalDate date = LocalDate.parse(actDate, formatter);

        // Prompt user for number of tickets
        System.out.println("How many tickets would you like?");
        int numOfTickets = scanner.nextInt();


        // extract the index of the space
        int indexOfSpace = fullName.indexOf(' ');

        // extract the first name and last name
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1);

        // check if the ticket reservation confirmation should have plural "s"
        String ticketsInPlural;
        if (numOfTickets > 1) {
            ticketsInPlural = "s";
        } else {
            ticketsInPlural = "";
        }

        // Display confirmation message
        System.out.printf("%d ticket%s reserved for %s under %s, %s\n", numOfTickets, ticketsInPlural, date, lastName, firstName);
    }
}
