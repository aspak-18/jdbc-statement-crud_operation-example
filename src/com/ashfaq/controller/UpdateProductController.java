package com.ashfaq.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateProductController {
    public static void main(String[] args) {
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/jdbc-e3";
            String user="root";
            String pass="root";

            connection= DriverManager.getConnection(url,user,pass);
            Statement statement=connection.createStatement();
            String updateQuery="update product set name='aspak' where id=185";
            int a=statement.executeUpdate(updateQuery);
            if(a!=0) {
                System.out.println("Data Updated");
            }
            else {
                System.out.println("Data not found");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
