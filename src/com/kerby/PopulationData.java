package com.kerby;
//Class PopulationData
//1. Open the file USPopulation.txt and read the population data into an array
//2. Method displayAverageAnnualChange:
// a. Calculate the total change in population from year to year
// b. Calculate the average change by dividing the total change by the number of years
// c. Display the average annual change in population
//3. Method displayGreatestIncreaseYear:
// a. Loop through the population array to find the year with the greatest population increase
// b. Display the year and the increase in population for that year
//4. Method displaySmallestIncreaseYear:
// a. Loop through the population array to find the year with the smallest population increase
// b. Display the year and the increase in population for that year

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PopulationData {

    public static void main(String[] args) {
        try {
            // Open the file containing population data
            File file = new File("USPopulation.txt");
            Scanner fileScanner = new Scanner(file);

            // Array to hold population data
            int[] population = new int[41];  // From 1950 to 1990, 41 years

            // Read the population data from the file
            int year = 1950;
            int index = 0;
            while (fileScanner.hasNextInt()) {
                population[index] = fileScanner.nextInt();
                index++;
            }

            // Close the file scanner
            fileScanner.close();

            // Display the required population data
            displayAverageAnnualChange(population);
            displayGreatestIncreaseYear(population);
            displaySmallestIncreaseYear(population);

        } catch (FileNotFoundException e) {
            System.out.println("USPopulation.txt file not found.");
        }
    }

    // Method to display the average annual change in population
    public static void displayAverageAnnualChange(int[] population) {
        int totalChange = 0;

        // Calculate the total change in population
        for (int i = 1; i < population.length; i++) {
            totalChange += (population[i] - population[i - 1]);
        }

        // Calculate and display the average annual change
        double averageChange = (double) totalChange / (population.length - 1);
        System.out.printf("Average annual change in population: %.2f thousand\n", averageChange);
    }

    // Method to find and display the year with the greatest increase in population
    public static void displayGreatestIncreaseYear(int[] population) {
        int maxIncrease = population[1] - population[0];
        int year = 1950;

        for (int i = 1; i < population.length; i++) {
            int increase = population[i] - population[i - 1];
            if (increase > maxIncrease) {
                maxIncrease = increase;
                year = 1950 + i;
            }
        }

        System.out.printf("Year with the greatest increase in population: %d (Increase: %d thousand)\n", year, maxIncrease);
    }

    // Method to find and display the year with the smallest increase in population
    public static void displaySmallestIncreaseYear(int[] population) {
        int minIncrease = population[1] - population[0];
        int year = 1950;

        for (int i = 1; i < population.length; i++) {
            int increase = population[i] - population[i - 1];
            if (increase < minIncrease) {
                minIncrease = increase;
                year = 1950 + i;
            }
        }

        System.out.printf("Year with the smallest increase in population: %d (Increase: %d thousand)\n", year, minIncrease);
    }
}
//Explanation:

//- The PopulationData class reads population data from a file and calculates various statistics.
//- The displayAverageAnnualChange method calculates the average change in population from year to year and displays it.
//- The displayGreatestIncreaseYear method finds and displays the year with the greatest population increase.
//- The displaySmallestIncreaseYear method finds and displays the year with the smallest population increase.

