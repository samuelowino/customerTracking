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
import java.util.*;
import java.util.List;
import java.sql.*;
import javax.swing.*;

public class CRMDAO implements AutoCloseable {
    
    private static List<String> customersBasicInformation;
    
    public CRMDAO() {
        customersBasicInformation = new ArrayList<>();
    }
    
    public final static List<String> getCustomersBasicInfo() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "")) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Customers;");
            ResultSet resultSet = preparedStatement.executeQuery();
            int i = 1;
            while (resultSet.next()) {
                customersBasicInformation.add(resultSet.getString(i));
                i++;
            }
            return customersBasicInformation;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database ERROR" + e.getMessage(), "Alpha Pharmacy POS", JOptionPane.ERROR_MESSAGE);
            return new ArrayList<>();
        }
    }
    
    public static final void addCustomerCRMInfo() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "")) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO CustomerCRM VALUES(?,?,?,?,?,?,?)");
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Succeful!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database ERROR" + e.getMessage());
        }
    }
    
    public void updateCustomerLoyaltyPoints(String customerID) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "")) {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE CustomerCRM SET loyaltyPoints = ? WHERE customerID IN (?)");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Database ERROR"+e.getMessage());
        }
    }

    @Override
    public void close() {
        JOptionPane.showMessageDialog(null, "Closing Database Objects...");
    }
}
