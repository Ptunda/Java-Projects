package com.pluralsight;

// a grades calculator app that displays that score of 18 students

import java.util.Random;

public class GradesCalculator {

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();

        // Steel class
        String[] students = {"Abirami", "Aisha", "Alexis", "Anita", "Anthony", "Ben", "Brya", "Demond", "Eugene", "Ganga",
                "Haby", "Husnain", "Manvir", "Nimi", "Nolan", "Paul", "Pratik", "Shelby"};

        // range for scores
        int high = 100;
        int low = 1;

        // iterate through the whole class, computing a random sequence of result for each student
        for (String student : students) {

            int randomScore = random.nextInt(high - low + 1) + low;

            // check if the score each student gets falls in a particular range and assign them a grade
            char grade = (randomScore >= 80) ? 'A' : (randomScore >= 70) ? 'B' : (randomScore >= 60) ? 'C' : (randomScore >= 50) ? 'D' : (randomScore >= 40) ? 'E' : 'F';

            // print every student's score against their grades
            System.out.printf("Hey %s, your score is %02d/100. so your Grade is %c.\n", student, randomScore, grade);

            Thread.sleep(1000);

        }

        System.out.println("\n=============================================================================================\n");
        System.out.println("See you, Steel Potatoes!");

    }

}
