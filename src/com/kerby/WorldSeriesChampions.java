package com.kerby;
//Class WorldSeriesChampions
//1. Create an ArrayList to store the names of World Series winning teams from 1903 to 2009
//2. Read the names from the WorldSeriesWinners.txt file and add them to the ArrayList
//3. Prompt the user to enter the name of a team to search for
//4. Loop through the ArrayList and count how many times the entered team name appears
//5. Display the number of times the team has won the World Series, or display a message if the team has never won

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WorldSeriesChampions {

    public static void main(String[] args) {
        // Create an ArrayList to store the names of the winning teams
        ArrayList<String> worldSeriesWinners = new ArrayList<>();

        // Read the names from the WorldSeriesWinners.txt file
        try {
            File file = new File("WorldSeriesWinners.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                worldSeriesWinners.add(fileScanner.nextLine());
            }

            // Close the file scanner
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("WorldSeriesWinners.txt file not found.");
            return;
        }

        // Get user input for the team name
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the name of a team to search: ");
        String teamName = inputScanner.nextLine();

        // Count the number of times the team has won
        int winCount = 0;
        for (String winner : worldSeriesWinners) {
            if (winner.equalsIgnoreCase(teamName)) {
                winCount++;
            }
        }

        // Display the result
        if (winCount > 0) {
            System.out.printf("%s has won the World Series %d times.\n", teamName, winCount);
        } else {
            System.out.println(teamName + " has never won the World Series.");
        }

        // Close the input scanner
        inputScanner.close();
    }
}
//Explanation:

//- The WorldSeriesChampions program reads the names of World Series winning teams from 1903 to 2009 into an ArrayList.
//- The user is prompted to enter a team name, and the program counts how many times that team has won the World Series.
//- If the team has won, the program displays the number of wins. If the team has never won, a message is displayed.

