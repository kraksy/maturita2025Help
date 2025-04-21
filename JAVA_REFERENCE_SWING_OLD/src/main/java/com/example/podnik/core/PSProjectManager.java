package com.example.podnik.core;

import java.util.List;

public class PSProjectManager {

    List<PSProjects> projects;

    public PSProjectManager() {
    }

    public PSProjects getProjectById(int id)
    {
        return projects.get(id);
    }

    // classics

    public void addProject(PSProjects project) {
        project.setId(project.getCurrentId() + 1);
        PSProjects.currentId++;
        projects.add(project);
    }

    public void removeProject(PSProjects project) {
        projects.remove(project);
    }

    public void removeProjectById(int id) {
        projects.remove(getProjectById(id));
    }

    public void addProject(String name)
    {
        PSProjects project = new PSProjects(PSProjects.currentId+1, null ,  name);
        PSProjects.currentId++;
    }

    // important

    public void addEmployee(PSProjects project , PSEmployee employee)
    {
        project.getEmployees().add(employee);
    }

    public void  removeEmployee(PSProjects project, PSEmployee employee)
    {
        project.getEmployees().remove(employee);
    }

    public void addEmployeeById(PSProjects project, int id)
    {
        project.getEmployees().add(PSEmployeeManager.employeeList.get(id));
    }

    public void removeEmployeeById(PSProjects project, int id)
    {
        project.getEmployees().remove(id);
    }

}
