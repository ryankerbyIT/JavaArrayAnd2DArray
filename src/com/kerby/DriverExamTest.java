package com.kerby;
//1. Create a Scanner object to accept the student's answers
//2. Loop through each of the 20 questions, prompting the user to enter A, B, C, or D for each
// a. Use input validation to ensure only A, B, C, or D are accepted
//3. Create an instance of the DriverExam class, passing the student's answers
//4. Call the passed method and display whether the student passed or failed the exam
//5. Display the total number of correct and incorrect answers
//6. Call questionsMissed to get the question numbers the student missed and display them
//7. Close the Scanner object after input is processed

import java.util.Scanner;

public class DriverExamTest {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Array to store the student's answers
        char[] studentAnswers = new char[20];

        // Input validation: only accept A, B, C, or D as answers
        for (int i = 0; i < 20; i++) {
            char answer;
            do {
                System.out.print("Enter answer for question " + (i + 1) + " (A, B, C, or D): ");
                answer = Character.toUpperCase(scanner.next().charAt(0));
            } while (answer != 'A' && answer != 'B' && answer != 'C' && answer != 'D');
            studentAnswers[i] = answer;
        }

        // Create an instance of the DriverExam class
        DriverExam exam = new DriverExam(studentAnswers);

        // Display results
        if (exam.passed()) {
            System.out.println("You passed the exam!");
        } else {
            System.out.println("You failed the exam.");
        }

        System.out.println("Total correct answers: " + exam.totalCorrect());
        System.out.println("Total incorrect answers: " + exam.totalIncorrect());

        // Display missed questions
        int[] missedQuestions = exam.questionsMissed();
        if (missedQuestions.length > 0) {
            System.out.print("Questions missed: ");
            for (int question : missedQuestions) {
                System.out.print(question + " ");
            }
        } else {
            System.out.println("No questions missed.");
        }

        // Close the scanner
        scanner.close();
    }
}
//Explanation of Test Program:

//- The program prompts the user to input answers for 20 questions, validating that only A, B, C, or D are entered.
//- An instance of the DriverExam class is created with the student's answers.
//- The program checks whether the student passed or failed using the passed method.
//- The totalCorrect and totalIncorrect methods are called to display the number of correct and incorrect answers.
//- The questionsMissed method is used to display the numbers of the questions the student missed, if any.

