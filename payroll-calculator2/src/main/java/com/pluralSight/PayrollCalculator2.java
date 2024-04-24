package com.pluralSight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class PayrollCalculator2 {

    public static void main(String[] args) {

        String fileName = "employees2.csv";

        // create a File Reader Object to read the file
        // we will prompt the user later*
        try {

            // create the FileReader to read the file entered
            FileReader potatoReader = new FileReader(fileName);

            // create a BufferedReader object to read the file
            BufferedReader bufferedReader = new BufferedReader(potatoReader);

            // create a FileWriter object to create another file, where our output is going to be displayed
            FileWriter potatoWriter = new FileWriter("payroll.txt");

            String line;

            // read until there's no more data to read
            // the readLine() method allows us to read to the next line
            while ((line = bufferedReader.readLine()) != null){

                // Split the line into individual fields using the "|" character as the delimiter
                String[] tokens = line.split("\\|");

                // Extract values from tokens array
                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double grossPay = Double.parseDouble(tokens[2]);

                // Create a new Employee object
                Employee2 employee = new Employee2(employeeId, name, grossPay);

                // Display employee information
//                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
//                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());

                // add the extracted content to the file
                potatoWriter.write("Employee ID: " + employee.getEmployeeId() + ", ");
                potatoWriter.write("Name: " + employee.getName() + ", ");
                potatoWriter.write("Gross Pay: $" + employee.getGrossPay() + "\n");


            }

            bufferedReader.close(); // Close the BufferedReader
            potatoWriter.close();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}
