package com.provajdbc.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	static String url = "jdbc:sqlserver://192.168.0.51\\sqlexpress:53195;databaseName=CORSO2024;encrypt=true;trustServerCertificate=true";
    static String username = "dmicheli";
    static String password = "DMicheli%05";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    
}
