package org.example;

import java.util.Random;

public class EmployeeAttendance {
    Random rd = new Random();
    int isPresent;

    int checkAttandance() {
        isPresent = rd.nextInt(3);
        switch (isPresent) {
            case 0:
                System.out.println("Employee is Absent");
                break;
            case 1:
                System.out.println("Employee Worked Part Time");
                break;
            case 2:
                System.out.println("Employee Worked Full Time");
                break;
        }
        return isPresent;
    }
}