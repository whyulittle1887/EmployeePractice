package com.example;

import com.example.business.EmployeeStockPlan;
import com.example.domain.*;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee engineer = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Employee manager = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Employee admin = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Employee admin2 = new Admin(702, "Joe Bloggs", "128-35-4967", 85_000.50);
        Employee director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        EmployeeStockPlan employeeStockPlan = new EmployeeStockPlan();

        // See how much stock each employee type gets
//        printEmployee(engineer);
        printEmployee(engineer, employeeStockPlan);


//        printEmployee(director);
        printEmployee(director, employeeStockPlan);


        manager.raiseSalary(10_000);
//        printEmployee(manager);
        printEmployee(manager, employeeStockPlan);

//        printEmployee(admin);
        admin.setEmployeeName("William Monroe");
//        admin.setEmployeeName(null);
//        admin.setEmployeeName("");
//        printEmployee(admin);
        printEmployee(admin, employeeStockPlan);

        // Print the number of employees in staff
        System.out.println("Number of Staff: " + ((Manager) manager).getEmployeeCount());

        // Attempt to add an employee to staff
        System.out.println("Added admin member to staff");
        ((Manager) manager).addEmployee(admin);

        // Print the number of employees in staff
        System.out.println("Number of Staff: " + ((Manager) manager).getEmployeeCount());

        System.out.println("Tried to add same admin member to staff");
        // Attempt to add an employee to staff
        ((Manager) manager).addEmployee(admin);

        // Print the number of employees in staff
        System.out.println("Number of Staff: " + ((Manager) manager).getEmployeeCount());

        // Attempt to add an employee to staff
        System.out.println("Added engineer to staff");
        ((Manager) manager).addEmployee(engineer);

        // Print the number of employees in staff
        System.out.println("Number of Staff: " + ((Manager) manager).getEmployeeCount());

        // Remove the admin member of staff
        System.out.println("Removed the admin member from staff");
        ((Manager) manager).removeEmployee(admin);

        // Print the number of employees in staff
        System.out.println("Number of Staff: " + ((Manager) manager).getEmployeeCount());

        // Attempt to add a different admin member to staff
        System.out.println("Added other admin to staff");
        ((Manager) manager).addEmployee(admin2);

        // Print the number of employees in staff
        System.out.println("\nNumber of Staff: " + ((Manager) manager).getEmployeeCount() + "\n");

        // Print out the manager and staff
        ((Manager) manager).printStaff();
    }

    public static void printEmployee(Employee employee)
    {
        System.out.println("Employee Type: " + employee.getClass().getSimpleName());
        System.out.println(employee);
    }

    public static void printEmployee(Employee employee, EmployeeStockPlan employeeStockPlan)
    {
        printEmployee(employee);
        System.out.println("Stock Options: " + employeeStockPlan.grantStock(employee) + "\n");
    }
}
