package com.kerby;
//1. Create an instance of ChargeAccountValidatorFromFile, passing the filename that contains valid account numbers
//2. Create a Scanner object to accept user input
//3. Prompt the user to enter a charge account number
//4. Call the isValidAccount method to validate the number
//5. If the method returns true, display "The account number is valid."
//6. If the method returns false, display "The account number is invalid."
//7. Close the Scanner object after input is processed

import java.util.Scanner;

public class ChargeAccountTestFromFile {

    public static void main(String[] args) {
        // Create an instance of the ChargeAccountValidatorFromFile class
        ChargeAccountValidatorFromFile validator = new ChargeAccountValidatorFromFile("validAccounts.txt");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a charge account number
        System.out.print("Enter a charge account number: ");
        int accountNumber = scanner.nextInt();

        // Validate the entered account number
        if (validator.isValidAccount(accountNumber)) {
            System.out.println("The account number is valid.");
        } else {
            System.out.println("The account number is invalid.");
        }

        // Close the scanner
        scanner.close();
    }
}
//Explanation of Test Program:

//- The program creates an instance of the ChargeAccountValidatorFromFile class by passing the name of the file containing valid account numbers.
//- The user is prompted to enter a charge account number.
//- The program checks if the entered account number is valid using the isValidAccount method.
//- If the number is found in the file, a message is displayed indicating the number is valid. Otherwise, the program displays an invalid message.
//- The Scanner is closed to avoid resource leakage.

