package com.pluralsight;

import java.time.LocalDateTime;

public class Event {

    private String name;
    private LocalDateTime dateTime;
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm";
    public static final java.time.format.DateTimeFormatter dateTimeFormatter = java.time.format.DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);

    public Event(String name, LocalDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Event: " + name + ", Date and Time: " + dateTime.format(dateTimeFormatter);
    }
}
