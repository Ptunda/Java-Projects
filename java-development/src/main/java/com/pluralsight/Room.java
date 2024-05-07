package com.pluralsight;

public class Room {

    // information about the Room
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;


    public Room(String type, int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isDirty = false;
        this.isOccupied = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDirty() {
        return isDirty;
    }

    // derived variable for checking whether the room is available
    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

}





























































//    public int getNumberOfBeds() {
//        return numberOfBeds;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public boolean isDirty() {
//        return isDirty;
//    }
//
//    public boolean isOccupied() {
//        return isOccupied;
//    }
//
//
//
//    public void checkAvailability(){
//
//        if (!isDirty && !isOccupied){
//
//            this.isAvailable = true;
//            System.out.println("This room is available for check in");
//
//        } else {
//
//            this.isAvailable = false;
//            System.out.println("This room is not available for check in");
//        }
//    }



