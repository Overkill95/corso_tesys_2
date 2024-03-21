package com.provasoap.business;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	
    public static Connection getConnection() throws SQLException, NamingException {
        try {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/CORSO2024");
            return ds.getConnection();
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
            throw e;
        }
    
}
//	static String url = "jdbc:sqlserver://192.168.0.51\\sqlexpress:53195;databaseName=CORSO2024;encrypt=true;trustServerCertificate=true";
//    static String username = "dmicheli";
//    static String password = "DMicheli%05";
//
//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(url, username, password);
//    }

    
}







//static String url = "jdbc:sqlserver://192.168.0.51\\sqlexpress:53195;databaseName=CORSO2024;encrypt=true;trustServerCertificate=true";
//static String username = "dmicheli";
//static String password = "DMicheli%05";
//
//public static Connection getConnection() throws SQLException {
//  return DriverManager.getConnection(url, username, password);