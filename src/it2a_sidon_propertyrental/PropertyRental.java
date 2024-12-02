package it2a_sidon_propertyrental;

import java.awt.Menu;
import java.sql.*;
import java.util.Scanner;

public class PropertyRental {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.connect()) {
            while (true) {
                displayMenu();
                System.out.print("Select an option: ");
                int choice = InputValidation.getIntInput();

                if (choice == 1) {
                    PropertyActions.viewAvailableProperties(conn);
                } else if (choice == 2) {
                    PropertyActions.rentProperty(conn);
                } else if (choice == 3) {
                    PropertyActions.viewRentalHistory(conn);
                } else if (choice == 4) {
                    PropertyActions.addProperty(conn);
                } else if (choice == 5) {
                    PropertyActions.updatePropertyDetails(conn);
                } else if (choice == 6) {
                    PropertyActions.deleteProperty(conn);
                } else if (choice == 7) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }
   


      
        public static void displayMenu() {
        System.out.println("\nProperty Rental System");
        System.out.println("1. View Available Properties");
        System.out.println("2. Rent Property");
        System.out.println("3. View Rental History");
        System.out.println("4. Add Property");
        System.out.println("5. Update Property Details");
        System.out.println("6. Delete Property");
        System.out.println("7. Exit");
    }
    }


