package com.kerby;
//1. Create an instance of the GradeBook class
//2. Call the enterStudentData method to input student names and test scores
//3. Call the displayGrades method to calculate and display the average scores and letter grades

public class GradeBookTest {

    public static void main(String[] args) {
        // Create and test the GradeBook
        GradeBook gradeBook = new GradeBook();

        // Enter student data
        gradeBook.enterStudentData();

        // Display the results
        gradeBook.displayGrades();
    }
}
//Explanation of Test Program:

//- The GradeBookTest program creates an instance of the GradeBook class.
//- The enterStudentData method prompts the user to enter the names and test scores for five students.
//- The displayGrades method calculates the average score and letter grade for each student and displays them.

