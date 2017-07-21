package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by angelicaperez on 7/17/17.
 */
public class NumberGameState {
    private int number;
    private boolean gameOver;
    private int lowerBound;
    private int upperBound;

    public NumberGameState() {
        number = (int) (Math.random() * 100) + 1;
        gameOver = false;
        lowerBound = 1;
        upperBound = 100;
    }

    public void update(int guess) {
        if (guess == number) {
            gameOver = true;
        } else if (guess <  lowerBound || guess > upperBound) {
            System.out.printf("Your guess is out of bounds.");
        } else if (guess > number) {
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
        } else{
            System.out.printf("Guess a number between %d and %d.\n", lowerBound, upperBound);
        }
    }

    public boolean gameOver() {
        return gameOver;
    }
}
