
package com.pluralSight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {


    public static void main(String[] args) {

        String fileName = "employees.csv"; // provide the file name

        //
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into individual fields using the "|" character as the delimiter
                String[] tokens = line.split("\\|");

                // Extract values from tokens array
                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                // Create a new Employee object
                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                // Display employee information
                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }

            // Close the BufferedReader
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }


    }

    // public class PayrollCalculator {
    //    public static void main(String[] args) {
    //        String fileName = "employee_data.csv"; // Specify the name of your CSV file
    //
    //        try {
    //            FileReader fileReader = new FileReader(fileName);
    //            BufferedReader reader = new BufferedReader(fileReader);
    //
    //            String line;
    //            while ((line = reader.readLine()) != null) {
    //                // Split the line into individual fields using the "|" character as the delimiter
    //                String[] tokens = line.split("\\|");
    //
    //                // Extract values from tokens array
    //                int employeeId = Integer.parseInt(tokens[0]);
    //                String name = tokens[1];
    //                double hoursWorked = Double.parseDouble(tokens[2]);
    //                double payRate = Double.parseDouble(tokens[3]);
    //
    //                // Create a new Employee object
    //                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
    //
    //                // Display employee information
    //                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
    //                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
    //            }
    //
    //            // Close the BufferedReader
    //            reader.close();
    //        } catch (IOException e) {
    //            System.err.println("Error reading the file: " + e.getMessage());
    //        }
    //    }
    //}

}
