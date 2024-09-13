package com.ashfaq.controller;

import java.sql.*;

public class DisplayProductController {
    public static void main(String[] args) {
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/jdbc-e3";
            String user="root";
            String pass="root";

            connection= DriverManager.getConnection(url,user,pass);
            Statement statement=connection.createStatement();
            String displayAllQuery="select * from product order by color";
            ResultSet set=statement.executeQuery(displayAllQuery);

            while(set.next()){
                System.out.println("==================");
                int id=set.getInt("id");
                String name= set.getString("name");
                Double price=set.getDouble("price");
                Object exp_date=set.getObject("exp_date");
                String color=set.getString("color");

                System.out.println("Id is: "+id);
                System.out.println("Name is: "+name);
                System.out.println("Price is: "+price);
                System.out.println("Expiry Date: "+exp_date);
                System.out.println("Color is: "+color);

                if(price>30000){
                    System.out.println("*********************");
                    System.out.println("Id is: "+id);
                    System.out.println("Name is: "+name);
                    System.out.println("Price is: "+price);
                    System.out.println("Expiry Date: "+exp_date);
                    System.out.println("Color is: "+color);
                }

            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
