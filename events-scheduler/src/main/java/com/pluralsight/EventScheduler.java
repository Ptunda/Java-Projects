
// Create an application that allows users to schedule events with specific dates and times.
// This project will involve creating classes to represent events, implementing date and
// time functionalities for scheduling, and possibly integrating with a user interface for interaction


package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class EventScheduler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Event> events = new ArrayList<>();

        while (true) {
            System.out.println("1. Schedule an event");
            System.out.println("2. View scheduled events");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    scheduleEvent(scanner, events);
                    break;
                case 2:
                    viewEvents(events);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            scanner.close();
            
        }

    }

    private static void scheduleEvent(Scanner scanner, List<Event> events) {
        System.out.print("Enter event name: ");
        String name = scanner.nextLine();

        System.out.print("Enter event date and time (YYYY-MM-DD HH:MM): ");
        String dateTimeStr = scanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, Event.dateTimeFormatter);

        events.add(new Event(name, dateTime));
        System.out.println("Event scheduled successfully!");
    }

    private static void viewEvents(ArrayList<Event> events) {
        if (events.isEmpty()) {
            System.out.println("No events scheduled.");
        } else {
            System.out.println("Scheduled events:");
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }

}
