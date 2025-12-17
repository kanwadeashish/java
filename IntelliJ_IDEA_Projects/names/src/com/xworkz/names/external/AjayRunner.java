package com.xworkz.names.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AjayRunner {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/AjayDetails_Database";
            String username = "root";
            String password = "root";

            Connection connection =
                    DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Connection successful");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException s) {
            s.printStackTrace();
        }
    }
}
