package com.example.podnik.core;

import java.util.List;

public class PSEmployeeManager {

    static public List<PSEmployee> employeeList;
    static public List<PSPosition> positionList;

    public PSEmployeeManager() {}

    public PSEmployee getEmployeeById(int id){
        return employeeList.get(id);
    }

    public PSPosition getPositionById(int id){
        return positionList.get(id);
    }

    // classics

    public void addEmployee(PSEmployee employee)
    {
        employee.setId(PSEmployee.currentID + 1);
        PSEmployee.currentID++;
        employeeList.add(employee);
    }

    public void addEmployee(String  firstName, String lastName, String email, String phoneNumber, String address)
    {
        PSEmployee employee = new PSEmployee((PSEmployee.currentID+1) , firstName, lastName, null,
                email, phoneNumber, false);
        employeeList.add(employee);
    }

    public void removeEmployee(int id)
    {
        employeeList.remove(id);
    }

    public void addPosition(PSPosition position)
    {
        positionList.add(position);
    }

    public void addPosition(String name)
    {
        PSPosition position = new PSPosition(PSEmployee.currentID+1, name);
        positionList.add(position);
    }

    public void removePosition(int id)
    {
        positionList.remove(id);
    }


    public void changeEmployeePosition(int id, int position)
    {
        getEmployeeById(id).setPosition(getPositionById(position));
    }

    // kontrola dochazky //

    public PSEmployee[] getActivity(PSEmployee[] employees)
    {
        PSEmployee[] activity = new PSEmployee[3];
        for (int i=0;i<employees.length;i++)
        {
            if (employees[i].isPresent())
            {
                activity[i] = employees[i];
            }
        }
        return activity;
    }

    public PSEmployee[] getAbsence(PSEmployee[] employees)
    {
        PSEmployee[] activity = new PSEmployee[3];
        for (int i=0;i<employees.length;i++)
        {
            if (!employees[i].isPresent())
            {
                activity[i] = employees[i];
            }
        }
        return activity;
    }

    // tasks

    public void addTask(PSEmployee employee, PSTask task)
    {
        employee.getTaskList().add(task);
    }

    public void removeTask(PSEmployee employee, PSTask task)
    {
        employee.getTaskList().remove(task);
    }

    public void removeTask(PSEmployee employee, int id)
    {
        employee.getTaskList().remove(id);
    }

}