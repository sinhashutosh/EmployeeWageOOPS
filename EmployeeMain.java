package org.example;

public class EmployeeMain {
    public static void main(String[] args) {
        int isPresent;
        System.out.println("Welcome to Employee Wage Computation");
        System.out.println("Checking Employee is absent or present or part time");
        EmployeeAttendance attendance = new EmployeeAttendance();
        EmployeeWageCal calculator = new EmployeeWageCal();
        for (int i = 1; i <= 20; i++) {
            isPresent = attendance.checkAttandance();
            calculator.wageCalculator(isPresent);
        }
    }
}
