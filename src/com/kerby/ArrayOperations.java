package com.kerby;
//Class ArrayOperations
//1. Method getTotal:
// a. Accepts a one-dimensional array as input
// b. Loop through the array and sum up the elements
// c. Return the total
//2. Method getAverage:
// a. Use getTotal to calculate the total of the array
// b. Divide the total by the array's length to calculate the average
// c. Return the average
//3. Method getHighest:
// a. Accepts a one-dimensional array as input
// b. Assume the first element is the highest
// c. Loop through the array and update the highest value when a larger element is found
// d. Return the highest value
//4. Method getLowest:
// a. Accepts a one-dimensional array as input
// b. Assume the first element is the lowest
// c. Loop through the array and update the lowest value when a smaller element is found
// d. Return the lowest value

public class ArrayOperations {

    // Method to calculate the total of the values in the array
    public static int getTotal(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    // Method to calculate the average of the values in the array
    public static double getAverage(int[] array) {
        int total = getTotal(array);  // Use getTotal to sum up the array
        return (double) total / array.length;  // Calculate and return the average
    }

    // Method to return the highest value in the array
    public static int getHighest(int[] array) {
        int highest = array[0];  // Assume the first element is the highest
        for (int num : array) {
            if (num > highest) {
                highest = num;
            }
        }
        return highest;
    }

    // Method to return the lowest value in the array
    public static int getLowest(int[] array) {
        int lowest = array[0];  // Assume the first element is the lowest
        for (int num : array) {
            if (num < lowest) {
                lowest = num;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        // Initialize an array with test data
        int[] testArray = {10, 25, 5, 15, 30};

        // Demonstrate the methods
        System.out.println("Total: " + getTotal(testArray));
        System.out.printf("Average: %.2f\n", getAverage(testArray));
        System.out.println("Highest: " + getHighest(testArray));
        System.out.println("Lowest: " + getLowest(testArray));
    }
}
//Explanation:

//- The ArrayOperations class contains methods to perform various operations on a one-dimensional array.
//- The getTotal method calculates the sum of the elements in the array.
//- The getAverage method calculates the average of the values in the array by calling getTotal and dividing by the number of elements.
//- The getHighest method returns the highest value in the array by iterating through the array and comparing each element to find the largest one.
//- The getLowest method returns the lowest value in the array by iterating through the array and comparing each element to find the smallest one.

