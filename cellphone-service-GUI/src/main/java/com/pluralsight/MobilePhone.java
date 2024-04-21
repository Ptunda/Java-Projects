package com.pluralsight;

import javax.swing.JOptionPane;

public class MobilePhone {

    // provide the instance attributes of the CellPhone object
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // create a constructor to initialize the instance attributes
    // a parameterless constructor allows us to have a default value for the private attributes
    public MobilePhone(){

        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }


    // create an overloaded constructor that takes all attributes as parameters
    public MobilePhone(long serialNumber, String model, String carrier, String phoneNumber, String owner){

        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;

    }


    // provide the getters
    public long getSerialNumber(){

        return this.serialNumber;
    }

    public String getModel(){

        return this.model;
    }
    public String getCarrier(){

        return this.carrier;
    }
    public String getPhoneNumber(){

        return this.phoneNumber;
    }
    public String getOwner(){

        return this.owner;
    }


    // provide the setters
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // create a method that displays that the owner of the phone is calling another number
    public void dial(String phoneNumberParameter){

        JOptionPane.showMessageDialog(null, this.owner + "'s phone is calling " + phoneNumberParameter);

    }

}
