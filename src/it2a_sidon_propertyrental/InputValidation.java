package it2a_sidon_propertyrental;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputValidation {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntInput() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
