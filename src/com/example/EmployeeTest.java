package com.example;

import com.example.domain.*;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee engineer = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Employee manager = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Employee admin = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Employee director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

//        printEmployee(engineer);
//        printEmployee(director);

//        printEmployee(manager);
//        manager.raiseSalary(10_000);
//        printEmployee(manager);

        printEmployee(admin);
        admin.setEmployeeName("William Monroe");
//        admin.setEmployeeName(null);
        admin.setEmployeeName("");
        printEmployee(admin);
    }

    public static void printEmployee(Employee employee)
    {
        System.out.println(employee);
    }
}
