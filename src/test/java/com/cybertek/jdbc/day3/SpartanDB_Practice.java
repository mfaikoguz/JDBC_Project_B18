package com.cybertek.jdbc.day3;

import static com.cybertek.jdbc.utilities.DB_Utility.*;

public class SpartanDB_Practice {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@3.89.146.60:1521:XE";
        createConnection(url, "SP", "SP");


//        Run query "SELECT * FROM SPARTANS"
        runQuery("SELECT * FROM SPARTANS");
//        1. Display all data in console
        displayAllData();
//        2. Print column count
        System.out.println("getColumnCNT() = " + getColumnCNT());
//        3. Print row count
        System.out.println("getRowCount() = " + getRowCount());
//        4. Print out 3rd row data as a list
        System.out.println("getRowDataAsList(3) = " + getRowDataAsList(3));
//        5. Print out 2nd column data as a list
        System.out.println("getColumnDataAsList(2) = " + getColumnDataAsList(2));
//        6, Print out Name column data as a list
        System.out.println("getColumnDataAsList(\"Name\") = " + getColumnDataAsList("Name"));
//        7, Print out 4th row as a Map
        System.out.println("getRowMap(4) = " + getRowMap(4));
//        8, Print out the data at row 5, column 1
        System.out.println("getColumnDataAtRow(5,1) = " + getColumnDataAtRow(5, 1));
//        9, Print out the data at row 53, phone column
        System.out.println("getColumnDataAtRow(53,\"Phone\") = " + getColumnDataAtRow(53, "Phone"));
//        10. Print out all the data as List of Map
        System.out.println("getAllDataAsListOfMap() = " + getAllDataAsListOfMap());

        // WE Are storing each row as map object
        // and we have 100 row ,  so can store this 100 map object into one Collection
        // --->>  List of these Map object  List< Map<String,String>  >


//        System.out.println("4TH ROW AS A MAP \n"
//                + DB_Utility.getRowMap(4)  );
//        System.out.println("5TH ROW AS A MAP \n"
//                + DB_Utility.getRowMap(5)  );


    }
}
