package com.pluralsight;

public class Reservation {

    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        if (roomType.equals("king")) {
            this.price = 139.00;
        } else if (roomType.equals("double")) {
            this.price = 124.00;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() {
        double totalPrice = price * numberOfNights;
        if (isWeekend) {
            totalPrice *= 1.1;
            // totalPrice = totalPrice + totalPrice * (10/100);
        }
        return totalPrice;
    }
}



























//    private String roomType;
//    private double price;
//    private int numberOfNights;
//    private boolean isWeekend;
//
//    public Reservation(String roomType, double price, int numberOfNights) {
//        this.roomType = roomType;
//        this.price = price;
//        this.numberOfNights = numberOfNights;
//        this.isWeekend = false;
//    }
//
//    public String getRoomType() {
//
//        return roomType;
//    }
//
//    public void setRoomType(String roomType) {
//        this.roomType = roomType;
//    }
//
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getNumberOfNights() {
//        return numberOfNights;
//    }
//
//
//    public void setNumberOfNights(int numberOfNights) {
//        this.numberOfNights = numberOfNights;
//    }
//
//
//    public boolean isWeekend() {
//        return isWeekend;
//    }
//
//
//    // derived getter and setter
//    public boolean setIsWeekend(boolean isWeekend) {
//
//
//        return false;
//    }
//
//    public double getReservationTotal(){
//
//        if (roomType.equalsIgnoreCase("King")){
//            price = 139.00 * numberOfNights;
//        } else if (roomType.equalsIgnoreCase("Double")) {
//            price = 124.00 * numberOfNights;
//        }
//
//        if (!isWeekend){
//
//            price = (price + (price * 0.1)) * numberOfNights;
//
//        }
//
//        return price;
//    }



