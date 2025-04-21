/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_reference.core;

public class employee {
    private int id; 
    private String name;
    private String surname;
    private Position pos;
    private String email; 
    
    public boolean absence = false;
    
    public employee(int id, String name, String surname, Position pos, String email)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pos = pos;
        this.email = email;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public Position getPos()
    {
        return this.pos;
    }
    
    public void setPos(Position pos)
    {
        this.pos = pos;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getSurname()
    {
        return this.surname;
    }
    
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
}
