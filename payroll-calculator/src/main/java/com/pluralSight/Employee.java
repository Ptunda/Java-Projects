package com.pluralSight;

public class Employee {

    // private attributes of every employee
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    // parameterized constructor
    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    // Getter methods that get the employee ID and employee name
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // method to calculate gross pay
    public double getGrossPay() {
        return hoursWorked * payRate;

    }

}
