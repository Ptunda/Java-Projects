package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {

    static  Scanner myScanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        financialQuotes(); // call the financial quotes method

        seeMore(); //

    }

    public static void financialQuotes() {

        try{

            // Array of 10 financial quotes
            String[] famousQuotes = new String[10];

            famousQuotes[0] = "The only true wisdom is in knowing you know nothing.";
            famousQuotes[1] = "The way to make money is to buy when blood is running in the streets.";
            famousQuotes[2] = "The best investment you can make is in yourself.";
            famousQuotes[3] = "An investment in knowledge pays the best interest.";
            famousQuotes[4] = "The more you learn, the more you earn.";
            famousQuotes[5] = "By failing to prepare, you are preparing to fail.";
            famousQuotes[6] = "I believe marriage is between a man and a woman. I am not in favor of gay marriage.";
            famousQuotes[7] = "A budget is telling your money where to go instead of wondering where it went.";
            famousQuotes[8] = "The goal of retirement is to live off your assets, not on them.";
            famousQuotes[9] = "Do not save what is left after spending, but spend what is left after saving.";

            // a range of choices
            int high = 10, low = 1;


            // prompt the user to choose a financial quote they want to read
            System.out.print("Choose a financial quote you want to display. \n (select #1 - #10 or R for random quote) ");
            int choice = myScanner.nextInt();
            myScanner.nextLine();

            --choice; // reduce user-input value by 1, to fit the array length

            System.out.printf("Quote %d: %s\n", choice + 1, famousQuotes[choice]); // display chosen quote

            myScanner.close();


        } catch(Exception e) {

            // if the user entered a very large number out of range, they should get an exception message
            System.out.println("Your number was out of range! " + e.getMessage());

        }

    }


}
