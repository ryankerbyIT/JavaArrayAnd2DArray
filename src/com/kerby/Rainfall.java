package com.kerby;
//Class Rainfall
//1. Declare an array to hold rainfall for 12 months
//2. Constructor takes an array of doubles and initializes monthly rainfall, replacing negative values with zero
//3. Method getTotalRainfall:
// a. Loop through the rainfall array
// b. Add up all values to calculate the total
//4. Method getAverageRainfall:
// a. Divide total rainfall by 12 to get the average
//5. Method getMonthWithMostRain:
// a. Loop through array to find the index of the month with the most rain
// b. Return the index + 1 (convert to 1-based month number)
//6. Method getMonthWithLeastRain:
// a. Loop through array to find the index of the month with the least rain
// b. Return the index + 1 (convert to 1-based month number)

public class Rainfall {

    // Array to store rainfall for each of the 12 months
    private double[] monthlyRainfall;

    // Constructor to initialize the array
    public Rainfall(double[] rainfall) {
        // Input validation: no negative values
        monthlyRainfall = new double[12];
        for (int i = 0; i < rainfall.length; i++) {
            if (rainfall[i] >= 0) {
                monthlyRainfall[i] = rainfall[i];
            } else {
                monthlyRainfall[i] = 0;  // Setting invalid negative values to 0
            }
        }
    }

    // Method to calculate total rainfall for the year
    public double getTotalRainfall() {
        double total = 0;
        for (double rain : monthlyRainfall) {
            total += rain;
        }
        return total;
    }

    // Method to calculate average monthly rainfall
    public double getAverageRainfall() {
        return getTotalRainfall() / monthlyRainfall.length;
    }

    // Method to find the month with the most rainfall
    public int getMonthWithMostRain() {
        int maxMonth = 0;
        for (int i = 1; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] > monthlyRainfall[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // Returning the month number (1-based index)
    }

    // Method to find the month with the least rainfall
    public int getMonthWithLeastRain() {
        int minMonth = 0;
        for (int i = 1; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] < monthlyRainfall[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1; // Returning the month number (1-based index)
    }
}

/*
Explanation:

- monthlyRainfall is an array that stores rainfall data for 12 months. 
  The constructor ensures that no negative values are stored in the array, 
  by checking each value and setting invalid ones to 0.
  
- getTotalRainfall() method sums up all the values in the monthlyRainfall 
  array to calculate the total rainfall for the year.

- getAverageRainfall() method divides the total rainfall by 12 (the number of months) 
  to calculate the average.

- getMonthWithMostRain() finds the index of the month with the maximum rainfall 
  by iterating through the array and comparing values. It returns the 1-based index of that month.

- getMonthWithLeastRain() works similarly to the most rain method but searches 
  for the minimum value instead.
*/
