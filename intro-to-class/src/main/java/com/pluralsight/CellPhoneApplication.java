package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        // create the first instance of the CellPhone class
        CellPhone cellPhone1 = new CellPhone();

        // create the instance of the Scanner class
        Scanner scanner = new Scanner(System.in);

        // prompt the first user to provide information
        System.out.print("What is the serial number? ");
        long serialNumber = scanner.nextLong();

        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();

        System.out.print("What is the carrier number? ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();


        // add the values entered by the user
        cellPhone1.setSerialNumber(serialNumber);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);


        // print the information provided by the first user
        System.out.println("\nSerial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner() + "\n \n");


        // create a second instance of the CellPhone class
        CellPhone cellPhone2 = new CellPhone();

        // prompt the second user to provide information
        System.out.print("What is the serial number? ");
        long serialNumber2 = scanner.nextLong();

        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model2 = scanner.nextLine();

        System.out.print("What is the carrier number? ");
        String carrier2 = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber2 = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner2 = scanner.nextLine();


        // add the values entered by the second user
        cellPhone2.setSerialNumber(serialNumber2);
        cellPhone2.setModel(model2);
        cellPhone2.setCarrier(carrier2);
        cellPhone2.setPhoneNumber(phoneNumber2);
        cellPhone2.setOwner(owner2);

        // print the information provided by the second user
        System.out.println("\nSerial Number: " + cellPhone2.getSerialNumber());
        System.out.println("Model: " + cellPhone2.getModel());
        System.out.println("Carrier: " + cellPhone2.getCarrier());
        System.out.println("Phone Number: " + cellPhone2.getPhoneNumber());
        System.out.println("Owner: " + cellPhone2.getOwner() + "\n \n");

        // invoke the dial() method for first user to call second user's number
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        // invoke the dial() method for second user to call first user's number
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        System.out.println();

        display(cellPhone1);
        display(cellPhone2);

    }

    public static void display(CellPhone phone) {

        System.out.printf("%s's phone is a %s, serial number %d subscribed to %s; and the phone number is %s \n", phone.getOwner(), phone.getModel(), phone.getSerialNumber(), phone.getCarrier(), phone.getPhoneNumber());

    }

}
