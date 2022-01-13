package com.example;

import com.example.domain.Employee;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee employee = new Employee();

        employee.setEmployeeID(101);
        employee.setEmployeeName("Jane Smith");
        employee.setEmployeeSSN("012-34-4567");
        employee.setEmployeeSalary(120_345.27);

        System.out.println("Employee ID:" + employee.getEmployeeID());
        System.out.println("Employee Name:" + employee.getEmployeeName());
        System.out.println("Employee SSN: " + employee.getEmployeeSSN());
        System.out.println("Employee Salary: " + employee.getEmployeeSalary());
    }
}
