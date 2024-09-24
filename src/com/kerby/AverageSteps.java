package com.kerby;
//Class AverageSteps
//1. Declare an array daysInMonth to store the number of days in each month (non-leap year)
//2. Open the file steps.txt using a Scanner
//3. Declare an array monthlySteps to store the total steps for each month
//4. Loop through the file and read each day's steps, summing them up by month:
// a. Use a nested loop: outer loop for each month, inner loop for each day in the month
// b. For each day, read the next integer from the file and add it to the corresponding month in monthlySteps
//5. After reading the file, calculate and display the average steps for each month:
// a. Divide the total steps for the month by the number of days in that month
// b. Display the result

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AverageSteps {

    // Array to hold the number of days in each month (non-leap year)
    private static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        try {
            // Open the file containing the steps data
            File file = new File("steps.txt");
            Scanner fileScanner = new Scanner(file);

            // Array to hold the total steps for each month
            int[] monthlySteps = new int[12];

            // Loop through the file and sum up the steps for each month
            int dayOfYear = 0;
            for (int month = 0; month < 12; month++) {
                for (int day = 0; day < daysInMonth[month]; day++) {
                    if (fileScanner.hasNextInt()) {
                        int steps = fileScanner.nextInt();
                        monthlySteps[month] += steps;
                        dayOfYear++;
                    }
                }
            }

            // Close the file scanner
            fileScanner.close();

            // Display the average steps for each month
            for (int month = 0; month < 12; month++) {
                double averageSteps = (double) monthlySteps[month] / daysInMonth[month];
                System.out.printf("Average steps in month %d: %.2f\n", month + 1, averageSteps);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
//Explanation:

//- The AverageSteps class calculates the average number of steps taken for each month in a year based on daily step data.
//- The program reads the steps for 365 days from the file steps.txt and stores them in a monthly array.
//- The daysInMonth array holds the number of days in each month (for a non-leap year).
//- A nested loop iterates through each month and day, reading the corresponding steps and summing them for the month.
//- After summing up the steps for each month, the program calculates the average by dividing the total steps by the number of days in that month.
//- The average steps for each month are then printed to the console.

