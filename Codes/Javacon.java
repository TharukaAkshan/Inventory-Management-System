/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tharuka
 */
public class Javacon {
     public static Connection Connectdb(){
        try {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB","login","123");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Javacon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
    }
}
