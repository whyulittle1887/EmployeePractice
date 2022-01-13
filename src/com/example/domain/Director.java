package com.example.domain;

public class Director extends Manager
{
    private double budget;

    public Director(int employeeID, String employeeName, String employeeSSN, double employeeSalary, String department, double budget)
    {
        super(employeeID, employeeName, employeeSSN, employeeSalary, department);
        this.budget = budget;
    }

    public double getBudget()
    {
        return budget;
    }

    public String toString()
    {
        return(super.toString() + "\nBudget: " + getBudget());
    }
}
