package com.codehub.academy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionFactory {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/vehicle_insurance_schema",
                    "root",
                    "Chri5to5"
            );
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }

    }

}
