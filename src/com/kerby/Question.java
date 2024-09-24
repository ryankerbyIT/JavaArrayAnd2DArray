package com.kerby;
//Class Question
//1. Fields to store a trivia question, four possible answers, and the correct answer number
//2. Constructor to initialize these fields
//3. Accessor methods to get the question and possible answers
//4. Method displayQuestion to print the question and the four possible answers
//5. Method isCorrect to check if the player's answer matches the correct answer
public class Question {
    // Fields to store the question and possible answers
    private String triviaQuestion;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int correctAnswer;  // 1, 2, 3, or 4 representing the correct answer

    // Constructor to initialize the fields
    public Question(String triviaQuestion, String answer1, String answer2, String answer3, String answer4, int correctAnswer) {
        this.triviaQuestion = triviaQuestion;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
    }

    // Accessor methods to retrieve question and answers
    public String getTriviaQuestion() {
        return triviaQuestion;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    // Method to display the question and possible answers
    public void displayQuestion() {
        System.out.println(triviaQuestion);
        System.out.println("1. " + answer1);
        System.out.println("2. " + answer2);
        System.out.println("3. " + answer3);
        System.out.println("4. " + answer4);
    }

    // Method to check if the player's answer is correct
    public boolean isCorrect(int playerAnswer) {
        return playerAnswer == correctAnswer;
    }
}

