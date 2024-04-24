package com.pluralSight;

public class Employee2 {

    // private attributes of every employee
    private int employeeId;
    private String name;
    private double grossPay;

    // parameterized constructor
    public Employee2(int employeeId, String name, double grossPay) {
        this.employeeId = employeeId;
        this.name = name;
        this.grossPay = grossPay;
    }

    // Getter methods that get the employee ID and employee name
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getGrossPay() {
        return grossPay;
    }

    // method to calculate gross pay
//    public double getGrossPay() {
//        return hoursWorked * payRate;
//
//    }

}
