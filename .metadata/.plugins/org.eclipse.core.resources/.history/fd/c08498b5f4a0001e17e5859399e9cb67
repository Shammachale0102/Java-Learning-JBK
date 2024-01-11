package com.shubham;

public class CalculateGrossSalary {
	public static void main(String[] args) {
      
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

       
        double hra, da;
        if (basicSalary <= 10000) {
            hra = 0.2 * basicSalary;
            da = 0.8 * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da = 0.9 * basicSalary;
        } else {
            hra = 0.3 * basicSalary;
            da = 0.95 * basicSalary;
        }

      
        double grossSalary = basicSalary + hra + da;

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);

        scanner.close();
    }
}

