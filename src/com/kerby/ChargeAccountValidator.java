package com.kerby;
//Class ChargeAccountValidator
//1. Declare an array validAccounts to store the list of valid charge account numbers
//2. Method isValidAccount:
// a. Accepts an account number as input
// b. Use a loop to iterate through the validAccounts array
// c. If the account number matches an element in the array, return true (valid)
// d. If no match is found, return false (invalid)

public class ChargeAccountValidator {

    // Array to hold valid charge account numbers
    private int[] validAccounts = {
        5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152,
        4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231,
        3852085, 7576651, 7881200, 4581002
    };

    // Method to check if a given account number is valid
    public boolean isValidAccount(int accountNumber) {
        // Perform a sequential search in the array
        for (int i = 0; i < validAccounts.length; i++) {
            if (validAccounts[i] == accountNumber) {
                return true;  // Account number found
            }
        }
        return false;  // Account number not found
    }
}
//Explanation:

//- The validAccounts array is initialized with the given list of valid account numbers.
//- The isValidAccount method accepts a charge account number as its argument.
//- A sequential search is performed through the validAccounts array to check whether the given number exists.
//- If the number is found in the array, the method returns true, indicating the account number is valid.
//- If the number is not found, the method returns false, indicating the account number is invalid.

