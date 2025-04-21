/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.java_reference;

import com.mycompany.java_reference.core.employee;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class JAVA_REFERENCE {
    
    static employeeManager manager = new employeeManager();
    static JFrame frame = new JFrame("Employee List");
    static JPanel panel = new JPanel();
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300 , 300);
        
        
        JTextField name = new JTextField();
        JTextField surname = new JTextField();
        JTextField position = new JTextField();
        JTextField email = new JTextField();
                
        JButton button = new JButton(" create employee ");
        
        panel.add(name);
        panel.add(surname);
        panel.add(position);
        panel.add(email);
        panel.add(button);
        
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                employee mf = new employee(manager.id, 
                        name.getText(), 
                        surname.getText(), 
                        position.getText(),
                        email.getText());
                manager.addEmployee(mf);
                manager.id++;
                add();
                panel.updateUI();
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
    
    public static void add()
    {
        for(employee emp : manager.employeeList) {
            JLabel empLabel = new JLabel(emp.getName());
            panel.add(empLabel);
        }
    }
}
