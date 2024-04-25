
// 1. created a Product class
// 2. provided instance attributes
// 3. created a parameterized constructor initialize the instance attributes
// 4. created getters to allow us to have access to the instance attributes
// 5. created inventory.csv file, using git bash, to help me extra details about products in the store

package com.pluralSight;

public class Product {

    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {

        this.id = id;
        this.name = name;
        this.price = price;

    }

    public int getId() {

        return this.id;

    }

    public String getName() {

        return this.name;

    }

    public double getPrice() {

        return this.price;

    }
}
