package com.cybertek.jdbc.utilities;

import java.sql.*;

public class DB_Utility {
    // adding static field so we can access in all static methods
    private static Connection conn;
    private static ResultSet rs;

    /*
     * a method to get the column count of the current ResultSet
     *
     *   getColumnCNT()
     *
     * */
    public static int getColumnCNT() {

        int colCount = 0;

        try {
            ResultSetMetaData rsmd = rs.getMetaData();
            colCount = rsmd.getColumnCount();

        } catch (SQLException throwables) {
            System.out.println("ERROR WHILE COUNTING THE COLUMNS");
            throwables.printStackTrace();
        }

        return colCount;
    }


    /*
     * a static method to create connection
     * with valid url and username password
     * */
    public static void createConnection() {

        String connectionStr = "jdbc:oracle:thin:@52.71.242.164:1521:XE";
        String username = "hr";
        String password = "hr";

        try {
            conn = DriverManager.getConnection(connectionStr, username, password);
            System.out.println("CONNECTION SUCCESSFUL");
        } catch (SQLException throwables) {
            System.out.println("CONNECTION HAS FAILED!");
            throwables.printStackTrace();
        }

    }

    /*
     * a static method to get the ResultSet object
     * with valid connection by executing query
     * */
    public static ResultSet runQuery(String query) {

        try {
            Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmnt.executeQuery(query);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return rs;
    }
}