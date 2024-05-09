package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {


    // perform a unit test: testing parts of the Car class i.e., methods, e.g., accelerate() or break() methods
    // give the unit test a descriptive name, e.g., accelerate_should_increaseCarSpeed()
    // annotate the test @Test
    @Test
    public void accelerate_Should_IncreaseCarSpeed(){

        // arrange
        Car raceCar = new Car("Mercedes", "Petronas");
        int changeInSpeed = 15;
        int expectedSpeed = 15;

        // Act
        raceCar.accelerate(changeInSpeed);

        // Assert
        int actualSpeed = raceCar.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);

    }

    @Test
    public void brake_Should_DecreaseSpeed(){

        // arrange



        // act



        // assert


    }

}