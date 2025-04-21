/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_reference;

import com.mycompany.java_reference.core.employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kraks
 */
public class employeeManager {
    public List<employee> employeeList = new ArrayList<>();
    
    public employeeManager() {}
    
    public void addEmployee(employee emp)
    {
        employeeList.add(emp);
    }
    
    public List<employee> getEmployeeList()
    {
        return this.employeeList;
    }
    
    public employee getEmployeeById(int id)
    {
        for (int i = 0; i < employeeList.size(); i++)
        {
            employee emp = employeeList.get(i);
            if (emp.getId() == id){
                return emp;
            }
        }
        return null;
    }
    
    public List<employee> getAllEmployees()
    {
        List<employee> list = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++)
        {
            employee emp = employeeList.get(i);
            list.add(emp);
        }
        return null;
    }
        
}
