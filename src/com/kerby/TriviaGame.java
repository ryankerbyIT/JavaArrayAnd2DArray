package com.kerby;
//Class TriviaGame
//1. Create an array of 10 Question objects
//2. Initialize the array with trivia questions and answers
//3. Create variables to keep track of player 1 and player 2 scores
//4. Use a loop to alternate between player 1 and player 2, asking each player 5 questions
//5. After each player answers a question, check if their answer is correct and update their score
//6. At the end of the game, display the scores and announce the winner
import java.util.Scanner;

public class TriviaGame {

    public static void main(String[] args) {
        // Create an array of 10 Question objects
        Question[] questions = new Question[10];

        // Initialize the questions (example questions; feel free to create your own)
        questions[0] = new Question("What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", 3);
        questions[1] = new Question("Which planet is known as the Red Planet?", "Earth", "Mars", "Venus", "Jupiter", 2);
        questions[2] = new Question("What is the largest ocean?", "Atlantic", "Indian", "Arctic", "Pacific", 4);
        questions[3] = new Question("Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "J.K. Rowling", "George Orwell", "Mark Twain", 1);
        questions[4] = new Question("What is the hardest natural substance?", "Gold", "Iron", "Diamond", "Silver", 3);
        questions[5] = new Question("Which element is represented by the symbol 'O'?", "Oxygen", "Hydrogen", "Helium", "Carbon", 1);
        questions[6] = new Question("What is the smallest country by land area?", "Monaco", "Vatican City", "Luxembourg", "Liechtenstein", 2);
        questions[7] = new Question("What is the fastest land animal?", "Lion", "Cheetah", "Tiger", "Leopard", 2);
        questions[8] = new Question("Which country invented pizza?", "Spain", "Greece", "Italy", "USA", 3);
        questions[9] = new Question("What year did the Titanic sink?", "1912", "1915", "1905", "1920", 1);

        // Create variables to store player scores
        int player1Score = 0;
        int player2Score = 0;

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Loop through each player, asking 5 questions per player
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {  // Player 1's turn for even indices
                System.out.println("Player 1, your question:");
                questions[i].displayQuestion();
                System.out.print("Enter your answer (1-4): ");
                int answer = scanner.nextInt();
                if (questions[i].isCorrect(answer)) {
                    System.out.println("Correct!");
                    player1Score++;
                } else {
                    System.out.println("Wrong answer.");
                }
            } else {  // Player 2's turn for odd indices
                System.out.println("Player 2, your question:");
                questions[i].displayQuestion();
                System.out.print("Enter your answer (1-4): ");
                int answer = scanner.nextInt();
                if (questions[i].isCorrect(answer)) {
                    System.out.println("Correct!");
                    player2Score++;
                } else {
                    System.out.println("Wrong answer.");
                }
            }
        }

        // Display scores and determine the winner
        System.out.println("\nGame Over!");
        System.out.println("Player 1's Score: " + player1Score);
        System.out.println("Player 2's Score: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }

        // Close the scanner
        scanner.close();
    }
}
//Explanation:

//- The Question class stores a trivia question, four possible answers, and the correct answer.
//- The TriviaGame class creates an array of 10 trivia questions and alternates between two players, asking each player 5 questions.
//- Players are awarded points for answering questions correctly, and the game announces the winner at the end based on the scores.

