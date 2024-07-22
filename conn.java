/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

// Import necessary packages for SQL operations
import java.sql.*;  

// Define a class named `conn` to manage the database connection
public class conn {
    Connection c;  // Declare a Connection object to establish a connection to the database
    Statement s;   // Declare a Statement object to execute SQL queries

    // Constructor of the `conn` class
    public conn() {  
        try {  
            // Load the MySQL JDBC driver class dynamically at runtime
            Class.forName("com.mysql.jdbc.Driver");  
            
            // Establish a connection to the database named 'hms' using the username 'root' and no password
            c = DriverManager.getConnection("jdbc:mysql:///hms", "root", ""); 
            
            // Create a Statement object to execute SQL queries
            s = c.createStatement();  
            
        } catch(Exception e) { 
            // Print any exception that occurs to the console
            System.out.println(e);
        }  
    }  
}  
