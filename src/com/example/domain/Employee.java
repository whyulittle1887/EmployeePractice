package com.example.domain;

import java.text.NumberFormat;

public class Employee
{
    private int employeeID;
    private String employeeName;
    private String employeeSSN;
    private double employeeSalary;

    public Employee(int employeeID, String employeeName, String employeeSSN, double employeeSalary)
    {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSSN = employeeSSN;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeID()
    {
        return employeeID;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        if(employeeName != null && !employeeName.equals(""))
        {
            this.employeeName = employeeName;
        }
    }

    public String getEmployeeSSN()
    {
        return employeeSSN;
    }

    public double getEmployeeSalary()
    {
        return employeeSalary;
    }

    public void raiseSalary(double increase)
    {
        if(increase >= 0)
        {
            employeeSalary += increase;
        }
    }

    @Override
    public String toString()
    {
        return("Employee ID: " + getEmployeeID() + "\nEmployee Name: " + getEmployeeName() + "\nEmployee SSN: "
                + getEmployeeSSN() + "\nEmployee Salary: " + NumberFormat.getCurrencyInstance().format(getEmployeeSalary()));
    }
}
