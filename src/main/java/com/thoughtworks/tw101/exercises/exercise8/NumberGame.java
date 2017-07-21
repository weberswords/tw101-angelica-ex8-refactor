package com.thoughtworks.tw101.exercises.exercise8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by angelicaperez on 7/17/17.
 */
public class NumberGame {

    NumberGameState state;

    public NumberGame() {
        state = new NumberGameState();
        welcome();
    }

    public void play() {
        while(!state.gameOver()) {
            // Ask user for guess
            int guess = requestGuess();
            if (guess == -1) {
                continue;
            }

            // Update game state
            state.update(guess);

            // Print state of game
            state.printGameState();
        }
    }

    private void welcome() {
        System.out.println("Let's play! I've chosen a number between 1 and 100");
    }

    private int requestGuess() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a guess: ");
        String userInput = "";
        int guess = -1;
        try {
            try {
                userInput = br.readLine();
            } catch (IOException e) {
                System.out.println("User input error.");
            }
            guess = Integer.parseInt(userInput);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid integer format!");
        }
        return guess;
    }

}
