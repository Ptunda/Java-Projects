package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Paul", 77);

        //by default
        System.out.println(person1.getEnergy());

        // let's say the person worked
        person1.work(5);
        System.out.println(person1.getEnergy());



        Car myCar = new Car("Mate Black", "Dolge Hellcat", 2024);
        myCar.accelerate(50);
        System.out.println(myCar.getSpeed());

        myCar.decelerate(20);
        System.out.println(myCar.getSpeed());

    }
}
