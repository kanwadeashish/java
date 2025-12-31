package com.xworkz.jdbcExample.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AjayRunner {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/AjayDetails_Database";
            String username = "root";
            String password = "root";
            String query = "insert into ajay_details values (?,?,?)";

            Connection connection =
                    DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Connection successful");
            }

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,3);
            statement.setString(2,"EFGH");
            statement.setDouble(3,99.99);
            int rows = statement.executeUpdate();

            if (rows==1){
                System.out.println("Data update seccess.");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException s) {
            s.printStackTrace();
        }
    }

}
