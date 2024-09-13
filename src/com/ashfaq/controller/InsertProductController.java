package com.ashfaq.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertProductController {
    public static void main(String[] args) {
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/jdbc-e3";
            String user="root";
            String pass="root";

            connection= DriverManager.getConnection(url,user,pass);
            Statement statement=connection.createStatement();
            String insertQuery="insert into product (id,name,price,exp_date,color) values(185,'aert',25000,'25-10-08','green')";
            statement.execute(insertQuery);
            System.out.println("Data Stored");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
