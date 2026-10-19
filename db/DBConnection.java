package db;

import java.sql.*;


public class DBConnection{
    //Database URL
    private static final String URL ="jdbc:mysql://localhost:3306/library_management_system";

    //Username and Password
    private static final String USER="root";
    private static final String PASS="root1234";

    //Initiate connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASS);
    }
}