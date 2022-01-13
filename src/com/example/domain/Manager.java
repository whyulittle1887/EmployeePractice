package com.example.domain;

public class Manager extends Employee
{
    private String department;

    public Manager(int employeeID, String employeeName, String employeeSSN, double employeeSalary, String department)
    {
        super(employeeID, employeeName, employeeSSN, employeeSalary);
        this.department = department;
    }

    public String getDepartment()
    {
        return department;
    }

    @Override
    public String toString()
    {
        return(super.toString() + "\nDepartment: " + getDepartment());
    }
}
