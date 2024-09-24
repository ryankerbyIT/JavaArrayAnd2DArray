package com.kerby;
//1. Create an instance of the Magic8Ball class, passing the filename with the responses
//2. Call the play method to start the game
//3. The game will continue to prompt the user for questions until the user types 'quit'

public class Magic8BallTest {

    public static void main(String[] args) {
        // Run the Magic8Ball program with the file of responses
        Magic8Ball magic8Ball = new Magic8Ball("8_ball_responses.txt");
        magic8Ball.play();  // Start the game
    }
}
//Explanation of Test Program:

//- The Magic8BallTest program creates an instance of the Magic8Ball class, passing the filename that contains the responses.
//- The play method is called, which prompts the user to ask questions until they type 'quit'.
//- The program will display random responses from the file for each question asked by the user.

