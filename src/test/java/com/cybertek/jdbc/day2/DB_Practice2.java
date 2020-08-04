package com.cybertek.jdbc.day2;

import com.cybertek.jdbc.utilities.DB_Utility;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Practice2 {
    public static void main(String[] args) throws SQLException {

        // print out all data from Jobs Table
        DB_Utility.createConnection();

        ResultSet rs = DB_Utility.runQuery("SELECT * FROM REGIONS");
        // this method call is displaying the data of the resultset
        DB_Utility.displayAllData();

        // move resultset cursor to second row
        // rs.absolute(2);
        //DB_Utility.runQuery("SELECT * FROM EMPLOYEES WHERE SALARY>19000  ");
        DB_Utility.displayAllData();

        System.out.println("DB_Utility.getColumnDataAtRow(3, 2) = " + DB_Utility.getColumnDataAtRow(3, 2));
        System.out.println("DB_Utility.getColumnDataAtRow(3, \"REGION_NAME\") = " + DB_Utility.getColumnDataAtRow(3, "REGION_NAME"));
        System.out.println("DB_Utility.getRowDataAsList(3) = " + DB_Utility.getRowDataAsList(3));
        System.out.println("DB_Utility.getRowCount() = " + DB_Utility.getRowCount());
    }
}
