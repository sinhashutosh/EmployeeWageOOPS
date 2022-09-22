package org.example;

import java.util.Random;

public class EmployeeAttendance {
    Random rd = new Random();
    int isPresent = 1;

    void checkAttandance() {
        isPresent = rd.nextInt(2);
        if (isPresent == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
