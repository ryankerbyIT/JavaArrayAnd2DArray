package com.kerby;
//Class ChargeAccountValidatorFromFile
//1. Declare an ArrayList to store the valid account numbers (dynamic resizing needed for file input)
//2. Constructor:
// a. Accepts a filename as input
// b. Open the file and use a Scanner to read the account numbers
// c. Read each integer from the file and store it in the ArrayList
// d. Close the file when done
//3. Method isValidAccount:
// a. Accepts an account number as input
// b. Use ArrayList's contains method to check if the account number exists in the list
// c. Return true if the account number is found, false otherwise

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ChargeAccountValidatorFromFile {

    // ArrayList to hold valid charge account numbers
    private ArrayList<Integer> validAccounts;

    // Constructor reads valid account numbers from a file
    public ChargeAccountValidatorFromFile(String filename) {
        validAccounts = new ArrayList<>();
        try {
            // Open the file
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            // Read each line from the file and add it to the ArrayList
            while (fileScanner.hasNextInt()) {
                validAccounts.add(fileScanner.nextInt());
            }

            // Close the scanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    // Method to check if a given account number is valid
    public boolean isValidAccount(int accountNumber) {
        return validAccounts.contains(accountNumber);  // Check if the list contains the account number
    }
}
//Explanation:

//- The validAccounts ArrayList stores all valid charge account numbers, which are dynamically read from a file.
//- The constructor reads account numbers from the file specified by the filename and stores them in the ArrayList.
//- If the file is not found, an error message is displayed.
//- The isValidAccount method checks if the account number exists in the ArrayList using the contains method and returns the result.

