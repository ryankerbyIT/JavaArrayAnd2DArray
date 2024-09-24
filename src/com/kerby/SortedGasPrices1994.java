package com.kerby;
//Class SortedGasPrices1994
//1. Declare arrays weeksInMonth and monthNames to store the number of weeks per month and the names of the months
//2. Open the file 1994_Weekly_Gas_Averages.txt and read the gas prices into an array weeklyPrices
//3. Method calculateMonthlyAverages:
// a. Sum the weekly prices for each month based on the number of weeks in that month
// b. Calculate the average price for each month and store it in monthlyAverages
//4. Method sortAndDisplayAverages:
// a. Sort a copy of the monthlyAverages array
// b. Loop through the sorted array and display the corresponding month names and average prices
//5. Method saveSortedAveragesToFile:
// a. Sort a copy of the monthlyAverages array
// b. Write the sorted averages and corresponding month names to a file Sorted_Gas_Prices_1994.txt

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class SortedGasPrices1994 {

    // Array to hold the number of weeks in each month (non-leap year)
    private static final int[] weeksInMonth = {
        4, 4, 5, 4, 4, 5, 4, 4, 5, 4, 4, 5
    };

    // Array to hold the names of the months
    private static final String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    public static void main(String[] args) {
        try {
            // Open the file containing the gas prices
            File file = new File("1994_Weekly_Gas_Averages.txt");
            Scanner fileScanner = new Scanner(file);

            // Array to hold gas prices for each week of the year
            double[] weeklyPrices = new double[52];

            // Read the gas prices from the file
            for (int i = 0; i < weeklyPrices.length; i++) {
                if (fileScanner.hasNextDouble()) {
                    weeklyPrices[i] = fileScanner.nextDouble();
                }
            }

            // Close the file scanner
            fileScanner.close();

            // Array to hold average gas prices for each month
            double[] monthlyAverages = new double[12];

            // Calculate the average price for each month
            calculateMonthlyAverages(weeklyPrices, monthlyAverages);

            // Sort and display the sorted average prices for each month
            sortAndDisplayAverages(monthlyAverages);

            // Save the sorted averages and month names to a file
            saveSortedAveragesToFile(monthlyAverages);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    // Method to calculate the average gas price for each month
    public static void calculateMonthlyAverages(double[] prices, double[] monthlyAverages) {
        int weekIndex = 0;

        for (int month = 0; month < 12; month++) {
            double total = 0;

            for (int week = 0; week < weeksInMonth[month]; week++) {
                total += prices[weekIndex++];
            }

            monthlyAverages[month] = total / weeksInMonth[month];
        }
    }

    // Method to sort and display the monthly average prices
    public static void sortAndDisplayAverages(double[] monthlyAverages) {
        // Copy the original array to keep track of month order
        double[] sortedAverages = Arrays.copyOf(monthlyAverages, monthlyAverages.length);

        // Sort the array
        Arrays.sort(sortedAverages);

        // Display the sorted average prices along with month names
        System.out.println("Sorted Average Gas Prices for 1994:");
        for (double avgPrice : sortedAverages) {
            for (int i = 0; i < 12; i++) {
                if (monthlyAverages[i] == avgPrice) {
                    System.out.printf("%s: $%.2f\n", monthNames[i], avgPrice);
                }
            }
        }
    }

    // Method to save sorted averages and corresponding month names to a file
    public static void saveSortedAveragesToFile(double[] monthlyAverages) {
        try (PrintWriter outputFile = new PrintWriter("Sorted_Gas_Prices_1994.txt")) {
            double[] sortedAverages = Arrays.copyOf(monthlyAverages, monthlyAverages.length);
            Arrays.sort(sortedAverages);

            outputFile.println("Sorted Average Gas Prices for 1994:");
            for (double avgPrice : sortedAverages) {
                for (int i = 0; i < 12; i++) {
                    if (monthlyAverages[i] == avgPrice) {
                        outputFile.printf("%s: $%.2f\n", monthNames[i], avgPrice);
                    }
                }
            }
            System.out.println("Sorted averages saved to Sorted_Gas_Prices_1994.txt.");
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file.");
        }
    }
}
//Explanation:

//- The SortedGasPrices1994 class reads weekly gas prices from a file, calculates monthly averages, and sorts the results.
//- The calculateMonthlyAverages method calculates the average gas price for each month based on the number of weeks in that month.
//- The sortAndDisplayAverages method sorts the monthly average gas prices and displays them alongside their corresponding month names.
//- The saveSortedAveragesToFile method saves the sorted monthly averages and corresponding month names to a text file.

