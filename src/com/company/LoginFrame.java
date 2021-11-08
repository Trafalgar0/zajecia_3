package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Hasło");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("Confirm");
    JButton cancelButton = new JButton("Cancel");

    LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(80, 100, 100, 30);
        passwordLabel.setBounds(80, 200, 100, 30);
        userTextField.setBounds(180, 100, 150, 30);
        passwordField.setBounds(180, 200, 150, 30);
        loginButton.setBounds(80, 300, 100, 30);
        cancelButton.setBounds(230, 300, 100, 30);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(loginButton);
        container.add(cancelButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            HashMap<String, String> danePoprawne = new HashMap<String, String>();
            danePoprawne.put("Login", "Hasło");
            HashMap<String, String> daneLogowania = new HashMap<String, String>();
            daneLogowania.put(userTextField.getText(), passwordField.getText());

            if(danePoprawne.equals(daneLogowania))
            {
                getContentPane().setBackground(Color.green);
            }
            else
            {
                getContentPane().setBackground(Color.red);
            }

        }

        if (e.getSource() == cancelButton)
        {
            userTextField.setText("");
            passwordField.setText("");
        }
        }
    }


