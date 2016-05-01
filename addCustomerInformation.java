/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerTracking;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author user
 */


import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author user
 */
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class addCustomerInformation extends JFrame {
    
    private static JButton patientsAddPrescriptionDetailsButton;
    private static JPanel patientsTopAddUserPanel;
    private static JPanel patientsEditProfilePanel;
    private static JButton patientsUpdateInfoButton;
    private static JButton patientsAdminButton;
    private static JLabel patientsCustomerInformationLabel;
    private static JLabel patientsFirstNameLabel;
    private static JTextField patientsFirstNameField;
    private static JLabel patientsLastNameLabel;
    private static JTextField patientsLastNameField;
    private static JLabel patientsPhoneLabel;
    private static JTextField patientsPhoneField;
    private static JLabel patientsEmailLabel;
    private static JTextField patientsEmailField;
    private static JLabel patientsPrescriptionDetails;
    private static JTextField patientsPrescriptionDetailsField;
    private static JLabel patientsLastVisitLabel;
    private static JPasswordField patientsLastVisitField;
    private static JLabel patientsNextVistLabel;
    private static JPasswordField patientsNextVistField;
    private static JLabel patientsDiagnosisDetailsLlabel;
    private static JTextArea patientsPatientsDiagnosisField;
    private static JButton patientsUpdateUserDetailsButton;
    
    public addCustomerInformation(){
        super("Customer Information");
        setSize(getMaximumSize().width,getMaximumSize().height);
        setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        patientsTopAddUserPanel = new JPanel(null);
        patientsEditProfilePanel = new JPanel(null);
        patientsAddPrescriptionDetailsButton = new JButton("Add Drugs/Prescription");
        patientsUpdateInfoButton = new JButton("Update Info");
        patientsUpdateUserDetailsButton = new JButton("Update");
        patientsAdminButton = new JButton("Admin");
        patientsCustomerInformationLabel = new JLabel("Customer Information");
        patientsFirstNameLabel = new JLabel("First Name");
        patientsFirstNameField = new JTextField();
        patientsLastNameLabel = new JLabel("Last Name");
        patientsLastNameField = new JTextField();
        patientsPhoneLabel = new JLabel("Phone");
        patientsPhoneField = new JTextField();
        patientsEmailLabel = new JLabel("Email");
        patientsEmailField = new JTextField();
        patientsPrescriptionDetails = new JLabel("Prescription Details Overview");
        patientsPrescriptionDetailsField = new JTextField();
        patientsLastVisitLabel = new JLabel("Last Visit");
        patientsLastVisitField = new JPasswordField();
        patientsNextVistLabel = new JLabel("Next  Appointment");
        patientsNextVistField = new JPasswordField();
        patientsDiagnosisDetailsLlabel = new JLabel("Patients Diagnosis Details");
        patientsPatientsDiagnosisField = new JTextArea();
        patientsTopAddUserPanel.setBorder( new LineBorder(Color.decode("#1E90FF")));
        patientsEditProfilePanel.setBorder( new LineBorder(Color.decode("#1E90FF")));
        patientsCustomerInformationLabel.setFont( new Font("New Times Roman",Font.BOLD,22));
        patientsPatientsDiagnosisField.setBorder( new LineBorder(Color.decode("#1E90FF")));
        patientsEditProfilePanel.setBackground(Color.WHITE);
        patientsUpdateInfoButton.setBackground(Color.red);
        patientsAdminButton.setBackground(Color.red);
        patientsUpdateInfoButton.setForeground(Color.WHITE);
        patientsAdminButton.setForeground(Color.WHITE);
        patientsUpdateUserDetailsButton.setBackground(Color.decode("#1E90FF"));
        patientsUpdateUserDetailsButton.setForeground(Color.WHITE);
        patientsCustomerInformationLabel.setForeground(Color.WHITE);
        patientsAddPrescriptionDetailsButton.setForeground(Color.WHITE);
        patientsAddPrescriptionDetailsButton.setBackground(Color.decode("#1E90FF"));
        patientsAddPrescriptionDetailsButton.setBounds(610,410,190,40);
        patientsTopAddUserPanel.setBounds(100,0,1000,100);
        patientsEditProfilePanel.setBounds(100,150,1000,550);
        patientsCustomerInformationLabel.setBounds(400,20,1000,40);
        patientsUpdateInfoButton.setBounds(130,15,100,30);
        patientsAdminButton.setBounds(240,15,70,30);
        patientsFirstNameLabel.setBounds(130,60,200,30);
        patientsFirstNameField.setBounds(130,100,300,40);
        patientsLastNameLabel.setBounds(130,150,300,30);
        patientsLastNameField.setBounds(130,180,300,40);
        patientsPhoneLabel.setBounds(130,220,300,30);
        patientsPhoneField.setBounds(130,260,300,40);
        patientsEmailLabel.setBounds(130,300,300,30);
        patientsEmailField.setBounds(130,330,300,40);
        patientsPrescriptionDetails.setBounds(130,385,300,30);
        patientsPrescriptionDetailsField.setBounds(130,410,300,40);
        patientsLastVisitLabel.setBounds(500,60,300,30);
        patientsLastVisitField.setBounds(500,100,300,40);
        patientsNextVistLabel.setBounds(500,140,300,30);
        patientsNextVistField.setBounds(500,170,300,30);
        patientsNextVistField.setBounds(500,180,300,40);
        patientsDiagnosisDetailsLlabel.setBounds(500,220,300,30);
        patientsPatientsDiagnosisField.setBounds(500,260,300,140);
        patientsUpdateUserDetailsButton.setBounds(500,410,100,40);
        patientsTopAddUserPanel.add(patientsCustomerInformationLabel);
        patientsEditProfilePanel.add(patientsUpdateInfoButton);
        patientsEditProfilePanel.add(patientsAdminButton);
        patientsEditProfilePanel.add(patientsFirstNameLabel);
        patientsEditProfilePanel.add(patientsFirstNameField);
        patientsEditProfilePanel.add(patientsLastNameLabel);
        patientsEditProfilePanel.add(patientsLastNameField);
        patientsEditProfilePanel.add(patientsPhoneLabel);
        patientsEditProfilePanel.add(patientsPhoneField);
        patientsEditProfilePanel.add(patientsEmailLabel);
        patientsEditProfilePanel.add(patientsEmailField);
        patientsEditProfilePanel.add(patientsPrescriptionDetails);
        patientsEditProfilePanel.add(patientsPrescriptionDetailsField);
        patientsEditProfilePanel.add(patientsLastVisitLabel);
        patientsEditProfilePanel.add(patientsLastVisitField);
        patientsEditProfilePanel.add(patientsNextVistLabel);
        patientsEditProfilePanel.add(patientsNextVistField);
        patientsEditProfilePanel.add(patientsDiagnosisDetailsLlabel);
        patientsEditProfilePanel.add(patientsPatientsDiagnosisField);
        patientsEditProfilePanel.add(patientsUpdateUserDetailsButton);
        patientsEditProfilePanel.add(patientsAddPrescriptionDetailsButton);
        patientsTopAddUserPanel.setBackground(Color.decode("#1E90FF"));
        add(patientsTopAddUserPanel);
        add(patientsEditProfilePanel);
        repaint();
        //setVisible(true);
        addFieldsFocusListener(patientsFirstNameField);
        addFieldsFocusListener(patientsLastNameField);
        addFieldsFocusListener(patientsPhoneField);
        addFieldsFocusListener(patientsEmailField);
        addFieldsFocusListener(patientsPrescriptionDetailsField);
        addFieldsFocusListener(patientsLastVisitField);
        addFieldsFocusListener(patientsNextVistField);
        addFieldsFocusListener(patientsPatientsDiagnosisField);
        
        patientsAddPrescriptionDetailsButton.addActionListener(
                 new ActionListener(){
                     @Override
                     public void actionPerformed(ActionEvent event){
                        new   systemsandmanagementrinterface.patientsDiagnosedDrugsDetails().setVisible(true);
                     }
                 }
        );
    }
    //add Fileds Focus Listeners
    public void addFieldsFocusListener(final JComponent componentObject) {
        componentObject.addFocusListener(
                new FocusAdapter() {
                    @Override
                    public void focusGained(FocusEvent event) {
                        componentObject.setBorder(new LineBorder(Color.decode("#1E90FF"), 2));
                    }

                    @Override
                    public void focusLost(FocusEvent event) {
                        componentObject.setBorder(new LineBorder(Color.black, 1));
                    }
                }
        );
    }
   
}


