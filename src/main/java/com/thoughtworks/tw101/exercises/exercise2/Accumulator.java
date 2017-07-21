package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    // Instance Variables
    private int total = 0;

    // Methods
    public void increment() {
        total += 1;
    }

    public void total() {
        System.out.printf("%d\n", total);
    }

}
