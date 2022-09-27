package org.example;

public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageCal calculator = new EmployeeWageCal();
        int emp_wage_builder1 = calculator.company("Google", 20, 160, 20, 100);
        int emp_wage_builder2 = calculator.company("Microsoft", 40, 300, 26, 100);
        System.out.println("=============================================");
        System.out.print("total wage of comapies = ");
        System.out.println(emp_wage_builder1 + emp_wage_builder2);
    }
}

