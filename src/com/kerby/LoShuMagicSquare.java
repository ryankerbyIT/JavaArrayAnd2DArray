package com.kerby;
//Class LoShuMagicSquare
//1. Method isLoShuMagicSquare:
// a. Verify that the grid contains numbers 1 through 9 exactly once
// b. Calculate the sum of the rows, columns, and diagonals
// c. If all sums are equal to the magic sum (15), return true
// d. Otherwise, return false
//2. In the main method, create a valid and an invalid 2D array for testing
//3. Test both arrays using the isLoShuMagicSquare method

public class LoShuMagicSquare {

    // Method to determine if the 2D array is a Lo Shu Magic Square
    public static boolean isLoShuMagicSquare(int[][] square) {
        // Check if the grid contains numbers 1 through 9 exactly once
        boolean[] numbers = new boolean[9];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                int value = square[row][col];
                if (value < 1 || value > 9 || numbers[value - 1]) {
                    return false;  // Invalid value or duplicate
                }
                numbers[value - 1] = true;
            }
        }

        // Calculate the sum of the first row as the magic constant
        int magicSum = 15;

        // Check sums of all rows
        for (int row = 0; row < 3; row++) {
            int rowSum = 0;
            for (int col = 0; col < 3; col++) {
                rowSum += square[row][col];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }

        // Check sums of all columns
        for (int col = 0; col < 3; col++) {
            int colSum = 0;
            for (int row = 0; row < 3; row++) {
                colSum += square[row][col];
            }
            if (colSum != magicSum) {
                return false;
            }
        }

        // Check sum of the main diagonal
        int diagonalSum1 = square[0][0] + square[1][1] + square[2][2];
        if (diagonalSum1 != magicSum) {
            return false;
        }

        // Check sum of the other diagonal
        int diagonalSum2 = square[0][2] + square[1][1] + square[2][0];
        if (diagonalSum2 != magicSum) {
            return false;
        }

        // If all checks pass, it is a Lo Shu Magic Square
        return true;
    }

    public static void main(String[] args) {
        // Example of a valid Lo Shu Magic Square
        int[][] magicSquare = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        };

        // Example of an invalid square
        int[][] nonMagicSquare = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        // Test if the first square is a Lo Shu Magic Square
        if (isLoShuMagicSquare(magicSquare)) {
            System.out.println("This is a Lo Shu Magic Square.");
        } else {
            System.out.println("This is not a Lo Shu Magic Square.");
        }

        // Test if the second square is a Lo Shu Magic Square
        if (isLoShuMagicSquare(nonMagicSquare)) {
            System.out.println("This is a Lo Shu Magic Square.");
        } else {
            System.out.println("This is not a Lo Shu Magic Square.");
        }
    }
}
//Explanation:

//- The LoShuMagicSquare class checks whether a 3x3 grid is a Lo Shu Magic Square.
//- The isLoShuMagicSquare method verifies that the grid contains the numbers 1 to 9 exactly once, and checks that the sum of every row, column, and diagonal equals 15.
//- The main method tests the function with both a valid and an invalid example of a Lo Shu Magic Square.

