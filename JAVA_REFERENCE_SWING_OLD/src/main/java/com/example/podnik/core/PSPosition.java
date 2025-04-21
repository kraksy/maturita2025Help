package com.example.podnik.core;

public class PSPosition {

    private int id;
    private String name;

    public static int currentID = 0;

    public PSPosition(int id, String name) {
        this.id = id;
        this.name = name;
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

    public int getCurrentID() {
        return currentID;
    }

    public void setCurrentID(int currentID) {
        PSPosition.currentID = currentID;
    }
}
