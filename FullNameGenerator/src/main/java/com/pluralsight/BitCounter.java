package com.pluralsight;

import java.util.Scanner;

public class BitCounter {

    public static void main(String[] args) {

        // print a message
        System.out.println("Hello World");

        // initialize a String called name
        String name = "Paul";

        // create an object of the StringBuilder class that we shall use to add to the
        // name String
        StringBuilder nameBuilder = new StringBuilder();

        // add Tunda to the name
        nameBuilder.append(name + " Tunda");

        // create a combined String
        String fullName = nameBuilder.toString();

        // print the full name
        System.out.println(fullName);


    }

}
