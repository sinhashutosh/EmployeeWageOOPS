package org.example;

public class EmployeeWageCal {
    int wage_per_hour = 20;
    int full_day_hour = 8;
    int part_time_hour = 3;
    int wage = 0;

    void wageCalculator(int isPresent) {
        if (isPresent == 0) {
            wage = wage_per_hour * isPresent;
        }
        if (isPresent == 1) {
            wage = wage_per_hour * part_time_hour;
        }
        if (isPresent == 2) {
            wage = wage_per_hour * full_day_hour;
        }
        System.out.println("Employee Wage = " + wage);
    }
}