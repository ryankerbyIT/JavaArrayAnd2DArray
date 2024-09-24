package com.kerby;
//Class GasPrices1994
//1. Declare an array weeksInMonth to store the number of weeks in each month
//2. Declare an array monthNames to store the names of the months
//3. Open the file 1994_Weekly_Gas_Averages.txt and read the gas prices for each week into an array
//4. Method displayLowestPrice:
// a. Find the lowest price and the corresponding week
// b. Determine the month using the helper method getMonthForWeek
// c. Display the lowest price, the week number, and the month name
//5. Method displayHighestPrice:
// a. Find the highest price and the corresponding week
// b. Determine the month using the helper method getMonthForWeek
// c. Display the highest price, the week number, and the month name
//6. Method displayMonthlyAverages:
// a. Loop through each month
// b. Sum up the gas prices for the number of weeks in that month
// c. Calculate and display the average price for the month
//7. Helper method getMonthForWeek:
// a. Accept a week number and return the corresponding month name

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GasPrices1994 {

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

            // Display the lowest, highest, and average gas prices for each month
            displayLowestPrice(weeklyPrices);
            displayHighestPrice(weeklyPrices);
            displayMonthlyAverages(weeklyPrices);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    // Method to find and display the lowest gas price
    public static void displayLowestPrice(double[] prices) {
        double lowestPrice = prices[0];
        int lowestWeek = 0;

        // Find the lowest price
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
                lowestWeek = i;
            }
        }

        String month = getMonthForWeek(lowestWeek);
        System.out.printf("Lowest price: $%.2f during week %d (%s)\n", lowestPrice, lowestWeek + 1, month);
    }

    // Method to find and display the highest gas price
    public static void displayHighestPrice(double[] prices) {
        double highestPrice = prices[0];
        int highestWeek = 0;

        // Find the highest price
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > highestPrice) {
                highestPrice = prices[i];
                highestWeek = i;
            }
        }

        String month = getMonthForWeek(highestWeek);
        System.out.printf("Highest price: $%.2f during week %d (%s)\n", highestPrice, highestWeek + 1, month);
    }

    // Method to display the average gas price for each month
    public static void displayMonthlyAverages(double[] prices) {
        int weekIndex = 0;

        for (int month = 0; month < 12; month++) {
            double total = 0;

            for (int week = 0; week < weeksInMonth[month]; week++) {
                total += prices[weekIndex++];
            }

            double averagePrice = total / weeksInMonth[month];
            System.out.printf("Average price for %s: $%.2f\n", monthNames[month], averagePrice);
        }
    }

    // Helper method to get the month name for a given week number
    public static String getMonthForWeek(int week) {
        int weekIndex = 0;

        for (int month = 0; month < weeksInMonth.length; month++) {
            weekIndex += weeksInMonth[month];
            if (week < weekIndex) {
                return monthNames[month];
            }
        }

        return "Unknown";
    }
}
//Explanation:

//- The GasPrices1994 class reads weekly gas prices from a file and calculates various statistics.
//- The displayLowestPrice method finds and displays the lowest price along with the corresponding week and month.
//- The displayHighestPrice method finds and displays the highest price along with the corresponding week and month.
//- The displayMonthlyAverages method calculates and displays the average gas price for each month.
//- The getMonthForWeek helper method converts a week number into the corresponding month name based on the number of weeks in each month.

