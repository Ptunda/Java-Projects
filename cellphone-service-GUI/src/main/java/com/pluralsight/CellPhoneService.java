package com.pluralsight;

import javax.swing.JOptionPane;

public class CellPhoneService {

    public static void main(String[] args) {

        // create the first instance of the CellPhone class
        MobilePhone mobilePhone1 = new MobilePhone();


        // prompt the first user to provide information
        long serialNumber = Long.parseLong(JOptionPane.showInputDialog("What is the serial number? "));
        String model = JOptionPane.showInputDialog("What model is the phone? ");
        String carrier = JOptionPane.showInputDialog("What is the carrier number? ");
        String phoneNumber = JOptionPane.showInputDialog("What is the phone number? ");
        String owner = JOptionPane.showInputDialog("Who is the owner of the phone? ");


        // add the values entered by the user
        mobilePhone1.setSerialNumber(serialNumber);
        mobilePhone1.setModel(model);
        mobilePhone1.setCarrier(carrier);
        mobilePhone1.setPhoneNumber(phoneNumber);
        mobilePhone1.setOwner(owner);


        // print the information provided by the first user
        JOptionPane.showMessageDialog(null, "\nSerial Number: " + mobilePhone1.getSerialNumber());
        JOptionPane.showMessageDialog(null, "Model: " + mobilePhone1.getModel());
        JOptionPane.showMessageDialog(null, "Carrier: " + mobilePhone1.getCarrier());
        JOptionPane.showMessageDialog(null, "Phone Number: " + mobilePhone1.getPhoneNumber());
        JOptionPane.showMessageDialog(null, "Owner: " + mobilePhone1.getOwner() + "\n \n");




        // create a second instance of the CellPhone class
        MobilePhone mobilePhone2 = new MobilePhone();

        // prompt the second user to provide information
        long serialNumber2 = Long.parseLong(JOptionPane.showInputDialog("What is the serial number? "));
        String model2 = JOptionPane.showInputDialog("What model is the phone? ");
        String carrier2 = JOptionPane.showInputDialog("What is the carrier number? ");
        String phoneNumber2 = JOptionPane.showInputDialog("What is the phone number? ");
        String owner2 = JOptionPane.showInputDialog("Who is the owner of the phone? ");


        // add the values entered by the second user
        mobilePhone2.setSerialNumber(serialNumber2);
        mobilePhone2.setModel(model2);
        mobilePhone2.setCarrier(carrier2);
        mobilePhone2.setPhoneNumber(phoneNumber2);
        mobilePhone2.setOwner(owner2);

        // print the information provided by the second user
        JOptionPane.showMessageDialog(null, "\nSerial Number: " + mobilePhone2.getSerialNumber());
        JOptionPane.showMessageDialog(null, "Model: " + mobilePhone2.getModel());
        JOptionPane.showMessageDialog(null, "Carrier: " + mobilePhone2.getCarrier());
        JOptionPane.showMessageDialog(null, "Phone Number: " + mobilePhone2.getPhoneNumber());
        JOptionPane.showMessageDialog(null, "Owner: " + mobilePhone2.getOwner() + "\n \n");



        // prompt the second user to provide information. this time for the third object
        long serialNumber3 = Long.parseLong(JOptionPane.showInputDialog("What is the serial number? "));
        String model3 = JOptionPane.showInputDialog("What model is the phone? ");
        String carrier3 = JOptionPane.showInputDialog("What is the carrier number? ");
        String phoneNumber3 = JOptionPane.showInputDialog("What is the phone number? ");
        String owner3 = JOptionPane.showInputDialog("Who is the owner of the phone? ");

        // create a third instance of the CellPhone class that calls the overloaded constructor
        MobilePhone mobilePhone3 = new MobilePhone(serialNumber3, model3, carrier3, phoneNumber3, owner3);


        // we don't need the setter because the overloaded constructor allows to set the variables

        // print the information provided by the second user
        JOptionPane.showMessageDialog(null, "\nSerial Number: " + mobilePhone3.getSerialNumber());
        JOptionPane.showMessageDialog(null, "Model: " + mobilePhone3.getModel());
        JOptionPane.showMessageDialog(null, "Carrier: " + mobilePhone3.getCarrier());
        JOptionPane.showMessageDialog(null, "Phone Number: " + mobilePhone3.getPhoneNumber());
        JOptionPane.showMessageDialog(null, "Owner: " + mobilePhone3.getOwner() + "\n \n");



        // invoke the dial() method for first user to call second user's number
        mobilePhone1.dial(mobilePhone2.getPhoneNumber());
        // invoke the dial() method for second user to call first user's number
        mobilePhone2.dial(mobilePhone1.getPhoneNumber());



        // invoke the dial() method for first user to call second user's number
        mobilePhone1.dial(mobilePhone3.getPhoneNumber());
        // invoke the dial() method for second user to call first user's number
        mobilePhone2.dial(mobilePhone3.getPhoneNumber());



        // Invoke the display() method to provide a summary of each cell phone object
        display(mobilePhone1);
        display(mobilePhone2);
        display(mobilePhone3);


    }

    public static void display(MobilePhone phone) {

        JOptionPane.showMessageDialog(null, phone.getOwner() +"'s phone is a " + phone.getModel() +", serial number " + phone.getSerialNumber() + " subscribed to " + phone.getCarrier() + ", and the phone number is " + phone.getPhoneNumber() + ".\n\n");

    }
}
