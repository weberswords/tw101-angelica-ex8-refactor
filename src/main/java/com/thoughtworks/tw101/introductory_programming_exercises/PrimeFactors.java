package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(35);
    }

    private static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        if (n > 2 && n%2==0) { factors.add(2); }
        for (int i = 3; i <= n; i+=2) {
            if (n%i==0 && isPrime(i)) {
                factors.add(i);
            }
        }
        return factors;
    }

    // returns true if n is prime
    private static boolean isPrime(int n) {
        // doesn't check evens because all input will be an odd number
        for (int i = 3; i < n/2; i+=2) {
            if (n%i==0) { return false;}
        }
        return true;
    }
}
