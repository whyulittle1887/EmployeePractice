package com.example.domain;

import java.util.Arrays;

public class Manager extends Employee
{
    private String department;
    private Employee[] staff;
    private int employeeCount = 0;

    public Manager(int employeeID, String employeeName, String employeeSSN, double employeeSalary, String department)
    {
        super(employeeID, employeeName, employeeSSN, employeeSalary);
        this.department = department;
        staff = new Employee[20];
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

    public int findEmployee(Employee employee)
    {
        for(Employee emp: staff)
        {
            if(employee == emp)
            {
                return Arrays.asList(staff).indexOf(emp);
            }
        }

        return -1;
    }

    public boolean addEmployee(Employee employee)
    {
        int notFound = findEmployee(employee);

        if(notFound == -1)
        {
            staff[employeeCount] = employee;
            employeeCount += 1;

            return true;
        }

        return false;
    }

    public void removeEmployee(Employee employee)
    {
        // Create a temp array
        Employee[] tempArray = new Employee[staff.length];

        // Create a boolean flag to indicate if we find a match for the employee we want to remove
        boolean match = false;

        // Create an count to act as an index for the tempArray
        int count = 0;

        // Loop through the main staff array
        for(Employee emp: staff)
        {
            // Ignore the empty/null objects in it
            if(emp != null)
            {
                // Compare the ID of the employee sent in, with the ID of each employee in the staff array
                if(emp.getEmployeeID() != employee.getEmployeeID())
                {
                    // If the IDs don't match, add the current employee to the tempArray
                    tempArray[count] = emp;

                    // Increment the count to add to the next index in the array
                    count++;

                    // Set the main employeeCount to the temp count
                    employeeCount = count;
                }
                else
                {
                    // If the ID DOES match, simply do nothing with it
                    // We don't want to copy this across to the temp array
                    // Set a flag to show we found the match
                    match = true;
                }
            }

            // At the end, check did we have a match for the employee we want to remove
            if(match)
            {
                // If we did, overwrite the main staff array with the tempArray
                staff = tempArray;
            }
        }
    }

    public int getEmployeeCount()
    {
        return employeeCount;
    }

    public void printStaff()
    {
        System.out.println("Manager:\n\t" + getEmployeeName());

        System.out.println("Staff:");

        for(Employee employee: staff)
        {
            if(employee != null)
            {
                System.out.println("\t" + employee.getEmployeeName());
            }
        }
    }
}
