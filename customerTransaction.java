/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerTracking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CustomerTransaction {

    public static HashMap<Object, Object> customerDetailsHashmap;
    private static String[][] customerDataValues;

    public CustomerTransaction() {
        customerDetailsHashmap = new HashMap<>();
    }

    public void insertCustomerDataToDb(String firstName, String lastName, String phone, String email, String prescription, String lastVisit, String nextAppointment, String diagnosis) {

        try (Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppos", "root", "")) {
            PreparedStatement preparedStatement = connect.prepareStatement("INSERT INTO customers VALUES(?,?,?,?,?,?,?,?);");

            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, prescription);
            preparedStatement.setString(6, lastVisit);
            preparedStatement.setString(7, nextAppointment);
            preparedStatement.setString(8, diagnosis);
            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "Customer Details Added Succefully");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DB ERROR " + e.getMessage());
        }

    }

    public HashMap<Object, Object> obtainCustomerDetailsFromDB(String customerID) {
        try (Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppos", "root", "")) {
            Statement mysqlStatement = connect.createStatement();
            String SELECT_QUERY = "SELECT * FROM customers WHERE code IN ('" + customerID + "');";
            ResultSet resultSet = mysqlStatement.executeQuery(SELECT_QUERY);
            while (resultSet.next()) {
                customerDetailsHashmap.put("firstname", resultSet.getString("firstname"));
                customerDetailsHashmap.put("lastName", resultSet.getString("lastName"));
                customerDetailsHashmap.put("phone", resultSet.getString("phone"));
                customerDetailsHashmap.put("email", resultSet.getString("email"));
                customerDetailsHashmap.put("prescription", resultSet.getString("prescription"));
                customerDetailsHashmap.put("lastVisit", resultSet.getString("lastVisit"));
                customerDetailsHashmap.put("nextAppointment", resultSet.getString("nextAppointment"));
                customerDetailsHashmap.put("diagnosis", resultSet.getString("diagnosis"));
                //JOptionPane.showMessageDialog(null, rs.getString("code") + "\n" + rs.getString("name") + rs.getString("price") + "\n" + rs.getString("quantity") + rs.getString("discount") + "\n" + rs.getString("category"));
            }

            JOptionPane.showMessageDialog(null, "Item details Obtained succefully!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        }
        return customerDetailsHashmap;

    }

    public String[][] obtainAllFromDB() {

        try (Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppos", "root", "")) {
            Statement mysqlStatement = connect.createStatement();
            int rows = 0;
            int columns = 0;
            String GET_ROWS = "SELECT COUNT(*) FROM customers;";
            ResultSet cursor = mysqlStatement.executeQuery(GET_ROWS);
            while (cursor.next()) {
                rows = cursor.getInt("COUNT(*)");
                System.err.println("Rows" + rows);
            }

            String SELECT_QUERY = "SELECT * FROM customers ;";
            ResultSet resultSet = mysqlStatement.executeQuery(SELECT_QUERY);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            columns = resultSetMetaData.getColumnCount();
            System.err.println("Columns" + columns);
            customerDataValues = new String[rows][columns];
            for (int i = 0; resultSet.next() && i < rows; i++) {
                for (int j = 0; j < columns; j++) {

                    customerDataValues[i][j] = resultSet.getString(j + 1);
                    System.out.println("" + customerDataValues[i][j]);

                }
                // JOptionPane.showMessageDialog(null, resultSet.getString("code") + "\n" + resultSet.getString("name") + resultSet.getString("price") + "\n" + resultSet.getString("quantity") + resultSet.getString("discount") + "\n" + resultSet.getString("category"));
            }

            JOptionPane.showMessageDialog(null, "customer details Obtained succefully!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        }
        return customerDataValues;
    }

    public void deleteCustomerFromDb(String customerID) {

        try (Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos_front_end", "root", "")) {
            PreparedStatement mysqlStatement = connect.prepareStatement("DELETE FROM customers WHERE customerID IN(?)");

            mysqlStatement.setString(1, customerID);
            mysqlStatement.execute();
            JOptionPane.showMessageDialog(null, "successfully deleted");

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "ERROR deletion failed" + e.getMessage());
        }

    }

    public void deleteAllCustomersFromDB() {
        try (Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppos", "root", "")) {
            connect.setAutoCommit(false);
            PreparedStatement preparedStatement = connect.prepareStatement("DELETE FROM customers;");
            preparedStatement.execute();
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete all customers ?", "iPOS", JOptionPane.YES_NO_CANCEL_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                connect.commit();
                JOptionPane.showMessageDialog(null, "All customers Deleted!! ");
            } else if (option == JOptionPane.NO_OPTION) {
                connect.rollback();
                JOptionPane.showMessageDialog(null, "Delete cancelled!!");

            } else if (option == JOptionPane.CANCEL_OPTION) {
                connect.rollback();
                JOptionPane.showMessageDialog(null, "Delete cancelled!!");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
        }
    }

    public void updateItems(String firstName, String lastName, String phone, String email, String prescription, String lastVisit, String nextAppointment, String diagnosis, int customerID) {
        try (Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos_front_end", "root", "")) {
            PreparedStatement preparedStatement = connect.prepareStatement("UPDATE  items SET code=?, name=?,price=?, quantity=?,discount=?, category=?, imageUrl=? WHERE code IN (?);");
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, prescription);
            preparedStatement.setString(6, nextAppointment);
            preparedStatement.setString(7, diagnosis);
            preparedStatement.setInt(8, customerID);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "customer details updated successfully");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Update failed" + e.getMessage());
        }
    }
}

