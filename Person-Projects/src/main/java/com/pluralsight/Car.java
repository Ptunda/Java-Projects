package com.pluralsight;

public class Car {

    // provide the instance attributes of the car object
    private String color;
    private String makeModel;
    private int speed;
    private int year;

    // create a constructor that sets inital speed to 0 by default
    public Car(String color, String makeModel, int year) {
        this.color = color;
        this.makeModel = makeModel;
        this.speed = 0;
        this.year = year;
    }

    // create getter for the instance attributes
    public String getColor() {

        return color;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }


    // create the setters for the instance attributes
    public void setColor(String color) {
        this.color = color;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // create the accelerate and decelerate methods that will alter the level of speed for the car object when invoked in the main() method
    public void accelerate(int increment){
        this.speed += increment;
    }

    public void decelerate(int decrement){
        this.speed -= decrement;
    }

}
