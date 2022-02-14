package com.training.paradise.util;

import com.training.paradise.configuration.ApplicationConfig;
import com.training.paradise.configuration.KeyNotFoundException;
import com.training.paradise.configuration.ValueNotFoundException;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {
    private static Connection connection;

    private ConnectionManager() {
    }

    public static Connection getConnection(){

        if (connection == null){
            ApplicationConfig applicationConfig = new ApplicationConfig();
            try {
                applicationConfig.load();
                Class.forName(applicationConfig.getForName());
                connection = DriverManager.getConnection(applicationConfig.getUrl(),
                        applicationConfig.getUser(),
                        applicationConfig.getPassword());
            } catch (ClassNotFoundException | SQLException | FileNotFoundException | KeyNotFoundException | ValueNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void Close(){
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                connection = null;
            }
        }
    }
}
