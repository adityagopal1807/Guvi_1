package com.lms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    // Get DB connection using credentials from properties file
    public static Connection getConnection() throws SQLException {
        Properties props = new Properties();
        try {
            // Load database credentials from application.properties
            props.load(DBConnection.class.getClassLoader().getResourceAsStream("application.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        String url = props.getProperty("db.url");
        String username = props.getProperty("db.username");
        String password = props.getProperty("db.password");

        return DriverManager.getConnection(url, username, password);
    }
}
