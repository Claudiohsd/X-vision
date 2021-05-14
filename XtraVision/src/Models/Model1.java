/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author claudiodionisio
 */
public class Model1 {
    
    private int size;
    //search for bookings where the customer has already been addes
    public String[] searchGenre() {

        ArrayList<String> data1 = new ArrayList<String>();
        try {
            String dbServer = "jdbc:mysql://apontejaj.com:3306/Claudio_2019235?useSSL=false";
            String dbUser = "Claudio_2019235";
            String dbPassword = "2019235";
            String query = "SELECT Genre, FROM Movie WHERE Available = 'yes';";

            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, dbUser, dbPassword);

            // Get a statement from the connection
            Statement stmt = conn.createStatement();

            // Execute the query
            ResultSet rs = stmt.executeQuery(query);

            // Loop through the result set
            int row = 0;
            data1.add("---select---");
            while (rs.next()) {
                data1.add( rs.getString("Genre"));
                row++;
            }
            // Close the result set, statement and the connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            System.out.println("SQL Exception:");
            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());
                se = se.getNextException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        size = data1.size();
        String[] data = data1.toArray(new String[size]);
        return data;
    }
}
