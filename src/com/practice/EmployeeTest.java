package com.demo;

import java.io.*;
public class EmployeeTest {

    public static void main(String args[]) {
        /* Create two objects using constructor */
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        /*empOne.Salary();*/
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        /*empTwo.empSalary();*/
        empTwo.printEmployee();

        empthree.empAge(20);
        empthree.empDesignation("Engineer");
        /*empOne.Salary();*/
        empthree.printEmployee();
    }
}