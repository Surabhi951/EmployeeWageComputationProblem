package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");
        EmpWageBuilder amazon = new EmpWageBuilder("Amazon", 20, 2, 10);
        EmpWageBuilder meesho = new EmpWageBuilder("Meesho", 10, 4, 20 );
        EmpWageBuilder reliance = new EmpWageBuilder("Reliance", 10, 3, 10);
        EmpWageBuilder flipkart = new EmpWageBuilder("Flipkart", 15, 5, 30);
        amazon.computeEmpWage();
        System.out.println(amazon);
        meesho.computeEmpWage();
        System.out.println(meesho);
        reliance.computeEmpWage();
        System.out.println(reliance);
        flipkart.computeEmpWage();
        System.out.println(flipkart);
    }
}