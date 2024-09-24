package com.kerby;
//Class Magic8Ball
//1. Declare an ArrayList to hold the 8 Ball responses
//2. Constructor:
// a. Accept a filename as input
// b. Read each line from the file and store it in the ArrayList
//3. Method getRandomResponse:
// a. Use the Random class to generate a random index
// b. Return the response at the random index from the ArrayList
//4. Method play:
// a. Use a Scanner to prompt the user for a yes/no question
// b. If the user types 'quit', exit the loop
// c. Otherwise, call getRandomResponse and display the random response

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    // ArrayList to store the 8 Ball responses
    private ArrayList<String> responses;

    // Constructor to read responses from a file
    public Magic8Ball(String filename) {
        responses = new ArrayList<>();
        try {
            // Open the file
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            // Read each line and add it to the ArrayList
            while (fileScanner.hasNextLine()) {
                responses.add(fileScanner.nextLine());
            }

            // Close the scanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    // Method to get a random response
    public String getRandomResponse() {
        Random random = new Random();
        int index = random.nextInt(responses.size());  // Get a random index
        return responses.get(index);  // Return the response at the random index
    }

    // Method to prompt the user for a question and display a response
    public void play() {
        Scanner scanner = new Scanner(System.in);
        String question;

        // Loop until the user is ready to quit
        do {
            System.out.print("Ask a yes or no question (or type 'quit' to exit): ");
            question = scanner.nextLine();

            if (!question.equalsIgnoreCase("quit")) {
                System.out.println("Magic 8 Ball says: " + getRandomResponse());
            }
        } while (!question.equalsIgnoreCase("quit"));

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) {
        // Create an instance of Magic8Ball, providing the filename of the responses
        Magic8Ball magic8Ball = new Magic8Ball("8_ball_responses.txt");

        // Start the game
        magic8Ball.play();
    }
}
//Explanation:

//- The Magic8Ball class reads responses from a file and stores them in an ArrayList.
//- The getRandomResponse method uses a Random object to select a random response from the ArrayList.
//- The play method prompts the user to ask a question and displays a random response from the 8 Ball.
//- The program continues until the user types 'quit' to exit.

