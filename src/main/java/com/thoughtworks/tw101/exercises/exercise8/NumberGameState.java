package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

/**
 * Created by angelicaperez on 7/17/17.
 */
public class NumberGameState {
    private int number;
    private boolean gameOver;
    private int lowerBound;
    private int upperBound;
    private ArrayList<Integer> guesses;

    public NumberGameState() {
        number = (int) (Math.random() * 100) + 1;
        gameOver = false;
        lowerBound = 1;
        upperBound = 100;
        guesses = new ArrayList<Integer>();
    }

    public void update(int guess) {
        guesses.add(guess);
        if (guess == number) {
            gameOver = true;
        } else if (guess <  lowerBound || guess > upperBound) {
            System.out.printf("Your guess is out of bounds.");
        } else assessGuess(guess);
    }

    private void assessGuess(int guess) {
        if (guess > number) {
            System.out.println("Lower!");
            upperBound = guess-1;
        } else {
            System.out.println("Higher!");
            lowerBound = guess+1;

        }
    }

    public void printGameState() {
        if (gameOver) {
            System.out.printf("You guessed it! The number is %d.\n", number);
            System.out.println("Here are your guesses: ");
            for (Integer guess: guesses) {
                System.out.printf("%d ", guess);
            }
        } else{
            System.out.printf("Guess a number between %d and %d.\n", lowerBound, upperBound);
        }
    }

    public boolean gameOver() {
        return gameOver;
    }
}
