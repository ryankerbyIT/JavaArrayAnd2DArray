package com.kerby;
//1. Create a sample integer array (numbers) with several elements.
//2. Call the displayLargerThanN method and pass the array and a number n (e.g., 15).
//3. The method will display numbers greater than n in the array.

public class TestLargerThanN {

    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {10, 15, 22, 7, 18, 34, 3};
        
        // Call method to display numbers larger than a specified value (e.g., 15)
        LargerThanN.displayLargerThanN(numbers, 15);
    }
}
//Explanation of Test Program:

//- The main method creates a sample integer array with multiple values.
//- The displayLargerThanN method is called with the array and a specific number n (e.g., 15).
//- The method will iterate through the array and print out numbers larger than 15.

