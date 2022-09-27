package org.example;

import java.util.Random;

public class EmployeeWageCal {

    Random rd = new Random();
    int wage_per_hour = 20;
    int wage_per_day = 160;
    int part_time_hour = 4;
    int month_days = 0;
    int hour = 0;
    int total_wage = 0;

    void wageCalculator() {
        while (month_days < 20 && hour < 100) {
            int attendance = rd.nextInt(2);
            if (hour == 96) {
                System.out.println("===========================");
                System.out.println("Now You can do only Part time work");
                hour += part_time_hour;
                total_wage = hour * wage_per_hour;
                System.out.println("Total Hour = " + hour);
                System.out.println("Total Wage = " + total_wage + "₹");
                System.exit(0);
            }
            if (attendance == 1) {
                int time = rd.nextInt(2);
                if (time == 1) {
                    //System.out.println(" Employee is Present Full Day...");
                    month_days++;
                } else if (time == 0) {
                    //System.out.println(" Employee worked Part Time...");
                    hour += part_time_hour;
                }
            }
        }
        System.out.print("===========================");
        System.out.println("Total Days = " + month_days);
        System.out.println("Total Hour = " + hour);
        System.out.print("===========================");
        if (month_days == 20) {
            total_wage = month_days * wage_per_day;
        } else if (hour <= 100) {
            total_wage = hour * wage_per_hour;
        }
        System.out.println("Total Wage = " + total_wage + "₹");
    }
}