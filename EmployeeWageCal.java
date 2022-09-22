package org.example;

public class EmployeeWageCal {
    int wage_per_hour = 20;
    int full_day_hour = 8;
    int part_time_hour = 3;
    int wage = 0;
    int total_wage=0;

    void wageCalculator(int isPresent) {
        switch (isPresent) {
            case 0:
                wage = wage_per_hour * isPresent;
                break;
            case 1:
                wage = wage_per_hour * part_time_hour;
                break;
            case 2:
                wage = wage_per_hour * full_day_hour;
                break;
        }
        total_wage = total_wage + wage;
        System.out.println("Employee Wage = " + total_wage);
    }
}
