package com.example.domain;

public class Employee
{
    public int employeeID;
    public String employeeName;
    public String employeeSSN;
    public double employeeSalary;

    public Employee()
    {

    }

    public int getEmployeeID()
    {
        return employeeID;
    }

    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public String getEmployeeSSN()
    {
        return employeeSSN;
    }

    public void setEmployeeSSN(String employeeSSN)
    {
        this.employeeSSN = employeeSSN;
    }

    public double getEmployeeSalary()
    {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary)
    {
        this.employeeSalary = employeeSalary;
    }
}
