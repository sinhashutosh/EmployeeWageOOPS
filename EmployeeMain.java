package org.example;

public class EmployeeMain {
    public static void main(String[] args) {
        int isPresent;
        System.out.println("Welcome to Employee Wage Computation");
        System.out.println("Checking Employee is absent or present");
        EmployeeAttendance attendance = new EmployeeAttendance();
        isPresent = attendance.checkAttandance();
        EmployeeWageCal calculator = new EmployeeWageCal();
        calculator.wageCalculator(isPresent);
    }
}
