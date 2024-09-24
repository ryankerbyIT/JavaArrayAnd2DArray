package com.kerby;
//Class LargerThanN
//1. Method displayLargerThanN:
// a. Accepts an integer array and an integer n as arguments
// b. Loop through the array using an enhanced for-loop
// c. If the current element is greater than n, print the element

public class LargerThanN {

    // Method that accepts an array of integers and a number n, and displays numbers larger than n
    public static void displayLargerThanN(int[] array, int n) {
        System.out.println("Numbers greater than " + n + ":");
        for (int number : array) {
            if (number > n) {
                System.out.println(number);
            }
        }
    }
}
//Explanation:

//- The displayLargerThanN method takes two arguments: an array of integers and a number n.
//- The method iterates through each number in the array.
//- If a number is larger than n, it prints that number.
//- The enhanced for-loop simplifies iteration over the array, and the comparison checks if the number is greater than n.


