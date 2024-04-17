package com.pluralsight;

public class Person {

    // provide attributes for the Person object	
    private String name;
    private int age;
    private int energy;

    // create a constructor to initialize the attribute. set the energy to 100 by default
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100;
    }

    // create getter for the instance attributes
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getEnergy() {
        return this.energy;
    }


    // create the work(), sleep(), and eat() methods that will alter the value of the object's energy when invoked in the main method
    public void work(int hours) {
        this.energy -= (hours * 10);
    }

    public void sleep(int hours) {
        this.energy += (hours * 10);
    }

    public void eat() {
        this.energy += 20;
    }

}
