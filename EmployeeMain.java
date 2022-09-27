package org.example;

public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageCal calculator = new EmployeeWageCal();
        calculator.company("Google", 20, 160, 20, 100);
        calculator.company("Microsoft", 40, 300, 26, 100);
    }
}

