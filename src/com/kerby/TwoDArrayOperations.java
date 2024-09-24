package com.kerby;
//Class TwoDArrayOperations
//1. Method getTotal:
// a. Loop through each element of the 2D array
// b. Add each element to a total sum
// c. Return the total sum
//2. Method getAverage:
// a. Use getTotal to get the total sum of the array
// b. Divide the total sum by the number of elements in the array
// c. Return the average value
//3. Method getRowTotal:
// a. Loop through the specified row and sum its elements
// b. Return the row's total sum
//4. Method getColumnTotal:
// a. Loop through the specified column and sum its elements
// b. Return the column's total sum
//5. Method getHighestInRow:
// a. Initialize the highest value with the first element in the specified row
// b. Loop through the row and update the highest value if a larger element is found
// c. Return the highest value
//6. Method getLowestInRow:
// a. Initialize the lowest value with the first element in the specified row
// b. Loop through the row and update the lowest value if a smaller element is found
// c. Return the lowest value

public class TwoDArrayOperations {

    // Method to get the total of all elements in the 2D array
    public static int getTotal(int[][] array) {
        int total = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total += array[row][col];
            }
        }
        return total;
    }

    // Method to get the average of all elements in the 2D array
    public static double getAverage(int[][] array) {
        int total = getTotal(array);
        int numberOfElements = array.length * array[0].length;
        return (double) total / numberOfElements;
    }

    // Method to get the total of a specific row
    public static int getRowTotal(int[][] array, int row) {
        int rowTotal = 0;
        for (int col = 0; col < array[row].length; col++) {
            rowTotal += array[row][col];
        }
        return rowTotal;
    }

    // Method to get the total of a specific column
    public static int getColumnTotal(int[][] array, int col) {
        int colTotal = 0;
        for (int row = 0; row < array.length; row++) {
            colTotal += array[row][col];
        }
        return colTotal;
    }

    // Method to get the highest value in a specific row
    public static int getHighestInRow(int[][] array, int row) {
        int highest = array[row][0];
        for (int col = 1; col < array[row].length; col++) {
            if (array[row][col] > highest) {
                highest = array[row][col];
            }
        }
        return highest;
    }

    // Method to get the lowest value in a specific row
    public static int getLowestInRow(int[][] array, int row) {
        int lowest = array[row][0];
        for (int col = 1; col < array[row].length; col++) {
            if (array[row][col] < lowest) {
                lowest = array[row][col];
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        // Initialize a 2D array with test data
        int[][] testArray = {
            {3, 8, 1},
            {4, 5, 6},
            {7, 9, 2}
        };

        // Demonstrate the methods
        System.out.println("Total of all elements: " + getTotal(testArray));
        System.out.printf("Average of all elements: %.2f\n", getAverage(testArray));
        System.out.println("Total of row 1: " + getRowTotal(testArray, 1));
        System.out.println("Total of column 2: " + getColumnTotal(testArray, 2));
        System.out.println("Highest value in row 2: " + getHighestInRow(testArray, 2));
        System.out.println("Lowest value in row 0: " + getLowestInRow(testArray, 0));
    }
}
//Explanation:

//- The TwoDArrayOperations class contains methods to perform operations on a 2D array.
//- The getTotal method calculates the sum of all elements in the 2D array.
//- The getAverage method calculates the average of all elements in the array.
//- The getRowTotal method returns the sum of the elements in a specified row.
//- The getColumnTotal method returns the sum of the elements in a specified column.
//- The getHighestInRow method finds and returns the highest value in a specified row.
//- The getLowestInRow method finds and returns the lowest value in a specified row.

