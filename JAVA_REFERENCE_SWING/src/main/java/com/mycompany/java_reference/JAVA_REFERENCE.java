/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.java_reference;

import com.mycompany.java_reference.core.Position;
import com.mycompany.java_reference.core.employee;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class JAVA_REFERENCE {

    public static void main(String[] args) {
        employeeManager manager = new employeeManager();
        JFrame frame = new JFrame("Employee List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300 , 300);

        JPanel panel = new JPanel();
        
        JButton button = new JButton(" create employee ");
        panel.add(button);
        
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        Position admin = new Position(1, "admin");
        Position assistent = new Position (2, "assistent");

        employee emil = new employee(1 , "emil", "debil", admin, "mail.kokot");
        employee david = new employee(2 , "david", "pavel", assistent, "mail.kokot");
        employee martin = new employee(3 , "martin", "frame", assistent, "mail.kokot");
        
        manager.addEmployee(emil);
        manager.addEmployee(david);
        manager.addEmployee(martin);
      
        for(employee emp : manager.employeeList) {
            JLabel empLabel = new JLabel(emp.getName());
            panel.add(empLabel);
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}
