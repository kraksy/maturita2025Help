package com.example.podnik.core;

public class PSItem {

    int id;
    String name;
    int quantity;
    String placement;

    public PSItem(int id, String name, int quantity, String placement) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.placement = placement;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }


}
