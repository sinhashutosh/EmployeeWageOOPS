package org.example;

public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        System.out.println("Checking Employee is absent or present");
        EmployeeAttendance attendance = new EmployeeAttendance();
        attendance.checkAttandance();
    }
}
