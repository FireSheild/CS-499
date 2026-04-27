package db;
import java.sql.*;
public class DatabaseManager{
    private static final String URL="jdbc:sqlite:animals.db";
    public static Connection connect() throws SQLException{return DriverManager.getConnection(URL);}
}