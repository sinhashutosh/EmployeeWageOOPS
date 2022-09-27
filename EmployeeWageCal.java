package org.example;

public class EmployeeWageCal {
    int wage_per_hour = 20;
    int full_day_hour = 8;

    void wageCalculator(int isPresent) {
        int wage = 0;
        if (isPresent == 1) {
            wage = wage_per_hour * full_day_hour;
            System.out.println("Employee Wage = " + wage);
        } else {
            System.out.println("Employee Wage = " + wage);
        }
    }
}
