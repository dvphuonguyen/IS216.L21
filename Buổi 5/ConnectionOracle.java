/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_thuchanh;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuon
 */
public class ConnectionOracle {

    /**
     */
    public static Connection getConn() {
        try {
            String userName = "C##JAVA";
            String password = "C##JAVA";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String connectionURL = "jdbc:oracle:thin:@DESKTOP-VKL2M34:1521:XE";
            
            Connection conn;
            try {
                return  DriverManager.getConnection(connectionURL, userName, password);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionOracle.class.getName()).log(Level.SEVERE, null, ex);
            }
            //return conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionOracle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        if(getConn() == null){
            System.out.println("Failed");
        }else{
            System.out.println("Done");
        }
    }
}
