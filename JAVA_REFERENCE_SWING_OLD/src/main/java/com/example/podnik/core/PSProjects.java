package com.example.podnik.core;

import java.util.List;

public class PSProjects {

    private int id;
    private List<PSEmployee> employees;
    private String name;

    static public int currentId = 0;

    public PSProjects(int id, List<PSEmployee> employees, String name) {
        this.id = id;
        this.employees = employees;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PSEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<PSEmployee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {
        PSProjects.currentId = currentId;
    }
}
