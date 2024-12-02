package it2a_sidon_propertyrental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DATABASE_URL = "jdbc:sqlite:Rental.db";

    public static Connection connect() {
        try {
            Connection conn = DriverManager.getConnection(DATABASE_URL);
            System.out.println("Connected to SQLite.");
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException("Connection failed: " + e.getMessage());
        }
    }
}
