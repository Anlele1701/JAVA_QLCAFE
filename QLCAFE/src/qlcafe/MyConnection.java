/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlcafe;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class MyConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("");
            con = DriverManager.getConnection ("", "root", "root");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
