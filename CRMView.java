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
import java.awt.*;
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
    
    public CRMView(){
        
        setSize(getMaximumSize().width,getMaximumSize().height);
        setLocation(0,0);
        setLayout(null);
        setBackground(Color.WHITE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        topCRMPanel = new JPanel();
        topLeftCRMPanel = new JPanel();
        topRightCRMPanel = new JPanel();
        customerPictureAndNameLeftPanel = new JPanel();
        cutomerMIddleInfoLeftPanel = new JPanel();
        customerInfoLowerLeftPanel = new JPanel();
        customerInfoBottomPanel = new JPanel();
        searchFieldPanel = new JPanel();
        customerScrollableListPanel = new JPanel();
        topRightCRMPanel.setBackground(Color.red);
        cutomerMIddleInfoLeftPanel.setBackground(Color.yellow);
        customerPictureAndNameLeftPanel.setBackground(Color.blue);
        customerInfoLowerLeftPanel.setBackground(Color.green);
        customerInfoBottomPanel.setBackground(Color.BLACK);
        searchFieldPanel.setBackground(Color.PINK);
        customerScrollableListPanel.setBackground(Color.CYAN);
        topCRMPanel.setBackground(Color.decode("#1E90FF"));
        topLeftCRMPanel.setBackground(Color.decode("#DC143C"));
        topRightCRMPanel.setBounds(975,100,325,100);
        topLeftCRMPanel.setBounds(0,65,950,100);
        topCRMPanel.setBounds(0,0,1300,65);
        customerPictureAndNameLeftPanel.setBounds(0,165,950,200);
        cutomerMIddleInfoLeftPanel.setBounds(0,365,950,250);
        customerInfoLowerLeftPanel.setBounds(0,600,950,200);
        customerInfoBottomPanel.setBounds(0,800,950,100);
        add(cutomerMIddleInfoLeftPanel);
        add(customerInfoBottomPanel);
        add(customerInfoLowerLeftPanel);
        add(customerPictureAndNameLeftPanel);
        add(topLeftCRMPanel);
        add(topCRMPanel);
        repaint();
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities
                .invokeLater(() -> {
            CRMView crmView = new CRMView();
        });
    }
}
