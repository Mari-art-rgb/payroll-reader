package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private int hoursWorked;
    private double payRate;



    // This is a constructor
    public Employee (String employeeId, String name, int hoursWorked, double payRate){
    this.employeeId = employeeId;
    this.name = name;
    this.hoursWorked = hoursWorked;
    this.payRate = payRate;

 }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getGrossPay(){
        return this.payRate * this.hoursWorked;
    }

}
