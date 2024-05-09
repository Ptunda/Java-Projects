package com.pluralsight;

public class HotelOperations {

    public static void main(String[] args) {


        // Test Employee class
        Employee employee1 = new Employee(1, "John Doe", "IT", 20.0);
        employee1.punchIn(8.5);
        employee1.punchOut(17.25);
        System.out.println(employee1.getName() + " worked " + employee1.getHoursWorked() + " hours.");
        System.out.println("Total pay for " + employee1.getName() + " is $" + employee1.getTotalPay());

        // Test Hotel class
        Hotel hotel1 = new Hotel("Holiday Inn", 10, 20);
        System.out.println(hotel1.getName() + " has " + hotel1.getNumberOfSuites() + " suites and " + hotel1.getNumberOfRooms() + " rooms.");
        System.out.println(hotel1.getAvailableSuites() + " suites and " + hotel1.getAvailableRooms() + " rooms are available.");

        boolean booked = hotel1.bookRoom(2, true);
        if (booked) {
            System.out.println("Booked 2 suites.");
        } else {
            System.out.println("Could not book 2 suites.");
        }
        System.out.println(hotel1.getAvailableSuites() + " suites and " + hotel1.getAvailableRooms() + " rooms are available.");


        System.out.println("\n==========================================================================================\n");

        // Test Reservation class
        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Price per Night: " + reservation.getPrice());
        System.out.println("Number of Nights: " + reservation.getNumberOfNights());
        System.out.println("Is Weekend: " + reservation.isWeekend());
        System.out.println("Reservation Total: " + reservation.getReservationTotal());


        System.out.println("\n==========================================================================================\n");

        // Test Room class
        Room room = new Room(2, 99.99);
        System.out.println("Number of Beds: " + room.getNumberOfBeds());
        System.out.println("Price: " + room.getPrice());
        System.out.println("Is Occupied: " + room.isOccupied());
        System.out.println("Is Dirty: " + room.isDirty());
        System.out.println("Is Available: " + room.isAvailable());

        System.out.println("\n==========================================================================================\n");

    }
}
