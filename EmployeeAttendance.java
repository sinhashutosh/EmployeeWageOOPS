package org.example;

import java.util.Random;

public class EmployeeAttendance {
    Random rd = new Random();
    int isPresent = 1;

    int checkAttandance() {
        isPresent = rd.nextInt(2);
        if (isPresent == 1) {
            System.out.println("Employee is Present");
            return isPresent;
        } else {
            System.out.println("Employee is Absent");
            return isPresent;
        }
    }
}
