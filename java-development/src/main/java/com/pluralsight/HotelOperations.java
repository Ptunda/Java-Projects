package com.pluralsight;

public class HotelOperations {

    public static void main(String[] args) {

        // create instances of the Room class
        Room room1 = new Room("King", 2, 139.00);
        Room room2 = new Room("Double", 2, 124.00);

        Reservation reservation1 = new Reservation("King", 3, true);

        System.out.printf("Your reservation total is $%.2f\n", reservation1.getReservationTotal());

    }
}
