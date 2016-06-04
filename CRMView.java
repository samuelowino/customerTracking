/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerTracking;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;

public class CRMView extends JFrame{
    
    private static JPanel topCRMPanel;
    private static JPanel topLeftCRMPanel;
    private static JPanel topRightCRMPanel;
    private static JPanel customerPictureAndNameLeftPanel;
    private static JPanel cutomerMIddleInfoLeftPanel;
    private static JPanel customerInfoLowerLeftPanel;
    private static JPanel customerInfoBottomPanel;
    private static JPanel searchFieldPanel;
    private static JPanel customerScrollableListPanel;
    private static JLabel customerInfoLabel;
    private static JLabel customersLabel;
    private static JButton receiptsIconButton;
    private static JLabel receiptsLabel;
    private static JButton notesIconLabelButton;
    private static JLabel noteLabel;
    private static JLabel editIconLabel;
    private static JLabel customerListLabel;
    private static JLabel plusSignLabel;
    private static JLabel customerImageLabel;
    private static JLabel customerNameLabel;
    private static JLabel customerCodeLabel;
    private static JLabel cellPhoneLabel;
    private static JLabel workLabel;
    private static JLabel emailLabel;
    private static JLabel dateOfBirthLabel;
    private static JLabel addressLabel;
    private static JLabel contactPreferenceLabel;
    private static JLabel preferedServiceproviderLabel;
    private static JLabel genderLabel;
    private static JLabel rewarededPoitsLabel;
    private static JScrollPane customersListScrollPane;
    
    
    public CRMView(){
        
        setSize(getMaximumSize().width,getMaximumSize().height);
        setLocation(0,0);
        setLayout(null);
        setBackground(Color.WHITE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editIconLabel = new JLabel( new ImageIcon(""));
        noteLabel = new JLabel("Notes");
        notesIconLabelButton = new JButton( new ImageIcon("C:\\Users\\user\\NetBeansProjects\\PharmacyPOS\\src\\appimages\\noteIcon.PNG"));
        receiptsLabel = new JLabel("Receipts");
        receiptsIconButton = new JButton( new ImageIcon("C:\\Users\\user\\NetBeansProjects\\PharmacyPOS\\src\\appimages\\receiptsTrials.PNG"));
        customerListLabel = new JLabel("Customers ");
        customersLabel = new JLabel("Customer");
        customerInfoLabel = new JLabel("Customer Info");
        topCRMPanel = new JPanel(null);
        topLeftCRMPanel = new JPanel(null);
        topRightCRMPanel = new JPanel(null);
        customerPictureAndNameLeftPanel = new JPanel();
        cutomerMIddleInfoLeftPanel = new JPanel();
        customerInfoLowerLeftPanel = new JPanel();
        customerInfoBottomPanel = new JPanel();
        searchFieldPanel = new JPanel();
        customerScrollableListPanel = new JPanel();
        customerListLabel.setForeground(Color.decode("#1E90FF"));
        customerInfoLabel.setFont( new Font("Arial Rounded MT Bold",Font.PLAIN,20));
        customerListLabel.setFont( new Font("Arial Rounded MT Bold",Font.PLAIN,20));
        customerInfoLabel.setForeground(Color.decode("#A9A9A9"));
        topRightCRMPanel.setBackground(Color.WHITE);
        cutomerMIddleInfoLeftPanel.setBackground(Color.WHITE);
        customerPictureAndNameLeftPanel.setBackground(Color.white);
        customerInfoLowerLeftPanel.setBackground(Color.WHITE);
        customerInfoBottomPanel.setBackground(Color.WHITE);
        searchFieldPanel.setBackground(Color.WHITE);
        customerScrollableListPanel.setBackground(Color.WHITE);
        customersLabel.setFont( new Font("Arial Rounded MT Bold",Font.PLAIN,22));
        receiptsLabel.setFont( new Font("Arial Rounded MT Bold",Font.BOLD,13));
        noteLabel.setFont( new Font("Arial Rounded MT Bold",Font.PLAIN,13));
        topCRMPanel.setBackground(Color.decode("#1E90FF"));
        receiptsLabel.setForeground(Color.decode("#1E90FF"));
        noteLabel.setForeground(Color.decode("#1E90FF"));
        receiptsIconButton.setBorder( new LineBorder(Color.WHITE));
        notesIconLabelButton.setBorder( new LineBorder(Color.WHITE));
        receiptsIconButton.addActionListener( e -> JOptionPane.showMessageDialog(null,"Am Still here"));
        topLeftCRMPanel.setBackground(Color.WHITE);
        customersLabel.setForeground(Color.WHITE);
        noteLabel.setBounds(635,15,70,40);
        notesIconLabelButton.setBounds(590,10,40,40);
        receiptsLabel.setBounds(510,15,70,40);
        receiptsIconButton.setBounds(460,10,50,50);
        customerListLabel.setBounds(15,15,200,40);
        customersLabel.setBounds(600,15,250,40);
        customerInfoLabel.setBounds(15,15,200,40);
        topRightCRMPanel.setBounds(800,65,485,80);
        topLeftCRMPanel.setBounds(0,65,800,80);
        topCRMPanel.setBounds(0,0,1300,65);
        customerPictureAndNameLeftPanel.setBounds(0,145,800,220);
        cutomerMIddleInfoLeftPanel.setBounds(0,365,800,250);
        customerInfoLowerLeftPanel.setBounds(0,615,800,160);
        customerInfoBottomPanel.setBounds(0,800,800,50);
        searchFieldPanel.setBounds(800,145,485,70);
        customerScrollableListPanel.setBounds(800,215,485,559);
        List<JPanel> panels = Arrays.asList(customerScrollableListPanel,searchFieldPanel,customerInfoBottomPanel,customerInfoLowerLeftPanel,cutomerMIddleInfoLeftPanel,customerPictureAndNameLeftPanel,topCRMPanel,topLeftCRMPanel,topRightCRMPanel);
        getBlueBorder(panels);
        List<JButton> buttons = Arrays.asList(receiptsIconButton,notesIconLabelButton);
        renderClickAction(buttons);
        topRightCRMPanel.add(customerListLabel);
        topCRMPanel.add(customersLabel);
        topLeftCRMPanel.add(customerInfoLabel);
        topLeftCRMPanel.add(receiptsIconButton);
        topLeftCRMPanel.add(receiptsLabel);
        topLeftCRMPanel.add(notesIconLabelButton);
        topLeftCRMPanel.add(noteLabel);
        add(cutomerMIddleInfoLeftPanel);
        //add(customerInfoBottomPanel);
        add(customerInfoLowerLeftPanel);
        add(customerPictureAndNameLeftPanel);
        add(topLeftCRMPanel);
        add(topCRMPanel);
        add(topRightCRMPanel);
        add(searchFieldPanel);
        add(customerScrollableListPanel);
        repaint();
        setVisible(true);
        
    }
    
    //Buttons response events
    public void renderClickAction(List<JButton> buttons){
        buttons.stream()
                .forEach(e -> {
                e.addMouseListener(
                        new MouseListener(){
                    @Override
                    public void mouseClicked(MouseEvent event) {
                    
                    }

                    @Override
                    public void mousePressed(MouseEvent event) {
                        e.setBorder( new LineBorder(Color.decode("#1E90FF"),2));
                    }

                    @Override
                    public void mouseReleased(MouseEvent event) {
                        e.setBorder( new LineBorder(Color.WHITE));
                    }

                    @Override
                    public void mouseEntered(MouseEvent event) {
                        e.setBorder( new LineBorder(Color.decode("#F5F5F5")));
                    }

                    @Override
                    public void mouseExited(MouseEvent event) {
                        e.setBorder( new LineBorder(Color.WHITE));
                    }
                        
                        }
                );
                        });
    }
    //cREATE blue borders
    public void getBlueBorder(List<JPanel> panels){
        panels.stream()
                .forEach(e -> e.setBorder( new LineBorder(Color.decode("#1E90FF"),2)));
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities
                .invokeLater(() -> {
            CRMView crmView = new CRMView();
        });
    }
    
    public void setTextFields(List<JTextField> textField){
        
        textField.stream()
                 .forEach( e -> e.setText(""));
    }
}
