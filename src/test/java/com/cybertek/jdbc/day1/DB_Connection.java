package com.cybertek.jdbc.day1;

import java.sql.*;

public class DB_Connection {
    public static void main(String[] args) throws SQLException {

        // CONNECTION --> STATEMENT --> RESULTSET

        // Driver manager is used to get the connection
        String connectionStr = "jdbc:oracle:thin:@3.89.146.60:1521:XE";
        Connection conn = DriverManager.getConnection("","","");
    }
}
