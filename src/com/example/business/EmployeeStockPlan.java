package com.example.business;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;

public class EmployeeStockPlan
{
    private int directorShares = 1000;
    private int managerShares = 100;
    private int generalShares = 10;

    public int grantStock(Employee employee)
    {
        if (employee instanceof Director)
        {
            return directorShares;
        }
        else if (employee instanceof Manager)
        {
            return managerShares;
        }
        else
        {
            return generalShares;
        }
    }
}
