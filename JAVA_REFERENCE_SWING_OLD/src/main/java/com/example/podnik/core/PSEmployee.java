package com.example.podnik.core;

import java.util.List;

public class PSEmployee {

    private int id;
    private String name;
    private String surname;
    private PSPosition position;
    private String email;
    private String phone;
    private boolean present;

    private List<PSTask> taskList;

    public static int currentID = 0;

    public PSEmployee(int id, String name, String surname, PSPosition position, String email, String phone, boolean present) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.present = present;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public PSPosition getPosition() {
        return position;
    }

    public void setPosition(PSPosition position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public List<PSTask> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<PSTask> taskList) {
        this.taskList = taskList;
    }

    public int getCurrentID() {
        return currentID;
    }

    public void setCurrentID(int currentID) {
        PSEmployee.currentID = currentID;
    }
}
