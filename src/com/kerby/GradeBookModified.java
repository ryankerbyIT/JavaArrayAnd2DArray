package com.kerby;
//Class GradeBook
//1. Declare an array studentNames to store the names of five students
//2. Declare an array letterGrades to store the letter grades of five students
//3. Declare a 2D array testScores to store four test scores for each student
//4. Method enterStudentData:
// a. Use a loop to prompt the user to enter each student's name and their four test scores
// b. Validate that the test scores are between 0 and 100
//5. Method calculateAverage:
// a. Accepts the student's index and calculates the average of their four test scores after dropping the lowest score
// b. Loop through the scores, sum them up, and find the lowest score
// c. Subtract the lowest score from the total and divide by 3 to calculate the average
//6. Method assignLetterGrade:
// a. Assign a letter grade based on the student's average score (A for 90+, B for 80+, etc.)
//7. Method displayGrades:
// a. Loop through each student, calculate their average score, assign a letter grade, and display the results

import java.util.Scanner;

public class GradeBookModified {

    // Array to store the names of five students
    private String[] studentNames = new String[5];

    // Array to store the letter grades for each student
    private char[] letterGrades = new char[5];

    // 2D Array to store four test scores for each student
    private double[][] testScores = new double[5][4];

    // Method to enter student names and their test scores
    public void enterStudentData() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            for (int j = 0; j < 4; j++) {
                double score;
                do {
                    System.out.print("Enter test score " + (j + 1) + " for " + studentNames[i] + " (0-100): ");
                    score = scanner.nextDouble();

                    // Input validation: score must be between 0 and 100
                } while (score < 0 || score > 100);

                testScores[i][j] = score;
            }

            scanner.nextLine();  // Consume newline
        }

        scanner.close();
    }

    // Method to calculate the average test score for a student, dropping the lowest score
    public double calculateAverage(int studentIndex) {
        double total = 0;
        double lowest = testScores[studentIndex][0];

        // Calculate the total score and find the lowest score
        for (int i = 0; i < 4; i++) {
            total += testScores[studentIndex][i];
            if (testScores[studentIndex][i] < lowest) {
                lowest = testScores[studentIndex][i];
            }
        }

        // Subtract the lowest score from the total and divide by the remaining three scores
        return (total - lowest) / 3;
    }

    // Method to assign a letter grade based on the average score
    public char assignLetterGrade(double averageScore) {
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to calculate and display each student's average and letter grade
    public void displayGrades() {
        for (int i = 0; i < 5; i++) {
            double averageScore = calculateAverage(i);
            letterGrades[i] = assignLetterGrade(averageScore);

            System.out.println("Student: " + studentNames[i]);
            System.out.printf("Average Score (after dropping the lowest): %.2f\n", averageScore);
            System.out.println("Letter Grade: " + letterGrades[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create an instance of GradeBook
        GradeBook gradeBook = new GradeBook();

        // Enter student data
        gradeBook.enterStudentData();

        // Display grades
        gradeBook.displayGrades();
    }
}
//Explanation:

//- The GradeBook class is modified to drop the lowest score when calculating a student's average test score.
//- The calculateAverage method loops through a student's test scores, sums them up, and identifies the lowest score.
//- The lowest score is subtracted from the total, and the average is calculated by dividing the sum of the remaining three scores.
//- The assignLetterGrade method assigns a letter grade based on the student's average score.
//- The displayGrades method prints out each student's name, their average test score after dropping the lowest, and their letter grade.

