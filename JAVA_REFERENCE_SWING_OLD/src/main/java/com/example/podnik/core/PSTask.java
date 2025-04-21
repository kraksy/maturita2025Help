package com.example.podnik.core;

public class PSTask {

    private int id;
    private String name;
    private String description;
    private PSProjects projectAssigned;

    public static int currentId = 0;

    public PSTask(int id, String name, String description, PSProjects projectAssigned) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.projectAssigned = projectAssigned;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PSProjects getProjectAssigned() {
        return projectAssigned;
    }

    public void setProjectAssigned(PSProjects projectAssigned) {
        this.projectAssigned = projectAssigned;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {
        PSTask.currentId = currentId;
    }
}
