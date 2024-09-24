package com.kerby;
//1. Create an instance of the ChargeAccountValidator class
//2. Create a Scanner object to accept user input
//3. Prompt the user to enter a charge account number
//4. Call the isValidAccount method to validate the number
//5. If the method returns true, display "The account number is valid."
//6. If the method returns false, display "The account number is invalid."
//7. Close the Scanner object after input is processed

import java.util.Scanner;

public class ChargeAccountTest {

    public static void main(String[] args) {
        // Create an instance of the ChargeAccountValidator class
        ChargeAccountValidator validator = new ChargeAccountValidator();
        
        // Create a Scanner object for input
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

//- The program first creates an instance of the ChargeAccountValidator class to access the validation method.
//- The user is prompted to enter a charge account number using the Scanner object.
//- The entered account number is then passed to the isValidAccount method.
//- Based on whether the account number is found in the list of valid accounts, a message is displayed to the user 
//indicating whether the number is valid or invalid.
//- The Scanner is closed after input is completed to prevent resource leakage.

