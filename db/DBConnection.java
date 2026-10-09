package db;

import java.sql.*;

public class DBConnection{
  
//Database Connection
private static final String URL="jdbc:mysql://localhost:3306/information";

//username and password
private static final String USER="root";
private static final String PASS="root1234";

//Initialize the connection 
public static Connection getConnection() throws SQLException{
    return DriverManager.getConnection(URL,USER,PASS);
}
}