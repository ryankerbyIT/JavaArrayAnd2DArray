package com.kerby;
//Class DriverExam
//1. Declare an array correctAnswers that holds the correct answers for 20 questions
//2. Declare a studentAnswers array to hold the student's answers
//3. Constructor:
// a. Accepts an array of student's answers and stores it
//4. Method passed:
// a. Call totalCorrect to count the correct answers
// b. If correct answers are 15 or more, return true (student passed)
// c. Otherwise, return false (student failed)
//5. Method totalCorrect:
// a. Loop through both arrays and count how many answers match the correctAnswers
// b. Return the count of correct answers
//6. Method totalIncorrect:
// a. Subtract totalCorrect from 20 (total number of questions) to get incorrect answers
// b. Return the number of incorrect answers
//7. Method questionsMissed:
// a. Loop through the answers and check where the student's answers do not match correctAnswers
// b. Store the missed question numbers in an array and return it

public class DriverExam {

    // Array to store correct answers
    private char[] correctAnswers = {
        'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D',
        'B', 'C', 'D', 'A', 'D', 'C', 'C', 'D', 'D', 'A'
    };

    // Array to store the student's answers
    private char[] studentAnswers;

    // Constructor to initialize the student's answers
    public DriverExam(char[] answers) {
        studentAnswers = answers;
    }

    // Method to determine if the student passed (must correctly answer 15 or more)
    public boolean passed() {
        return totalCorrect() >= 15;
    }

    // Method to calculate the total number of correct answers
    public int totalCorrect() {
        int correct = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i] == correctAnswers[i]) {
                correct++;
            }
        }
        return correct;
    }

    // Method to calculate the total number of incorrect answers
    public int totalIncorrect() {
        return correctAnswers.length - totalCorrect();
    }

    // Method to return an array containing the question numbers that the student missed
    public int[] questionsMissed() {
        int[] missed = new int[totalIncorrect()];
        int index = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i] != correctAnswers[i]) {
                missed[index++] = i + 1; // Store question numbers as 1-based index
            }
        }
        return missed;
    }
}
//Explanation:

//- The DriverExam class holds the correct answers in an array and the student's answers in a separate array.
//- The passed method checks if the student has correctly answered 15 or more questions, indicating they passed the exam.
//- The totalCorrect method counts the number of correct answers by comparing the student's answers with the correct ones.
//- The totalIncorrect method calculates how many questions the student answered incorrectly by subtracting correct answers from 20.
//- The questionsMissed method returns an array of question numbers that the student missed.

