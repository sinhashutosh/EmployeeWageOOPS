package org.example;

import java.util.Random;

public class EmployeeWageCal {
    void company(String name, int wage_per_hour, int wage_per_day, int max_days, int max_hour) {

        Random rd = new Random();
       /* int wage_per_hour = 20;
        int wage_per_day = 160;*/


        int total_wage = 0;
        int month_days = 0;
        int hour = 0;
        while (month_days < 20 && hour < 100) {
            int attendance = rd.nextInt(2);
            if (attendance == 1) {
                int time = rd.nextInt(2);
                if (time == 1) {
                    //System.out.println(" Employee is Present Full Day...");
                    month_days++;
                } else if (time == 0) {
                    //System.out.println(" Employee worked Part Time...");
                    hour += rd.nextInt(8);
                }
            }
        }
        System.out.print("===========================");
        System.out.println("Total Days = " + month_days);
        System.out.println("Total Hour = " + hour);
        System.out.print("===========================");

        if (month_days == max_days) {
            total_wage = month_days * wage_per_day;
        } else if (hour <= max_hour) {
            total_wage = hour * wage_per_hour;
        }
        System.out.println(name+" Total Wage = " + total_wage + "₹");
    }
}
