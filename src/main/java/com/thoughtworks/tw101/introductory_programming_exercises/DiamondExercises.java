package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for (int i = n-1; i >= 0; i--) {
            drawShapeRow(i, n);
        }
    }

    // prints n spaces
    private static void printSpaces(int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(" ");
        }
    }

    // prints n asterisks
    private static void printAsterisks(int n) {
        for (int j = 0; j < n; j++) {
            System.out.print("*");
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        for (int i = 1; i < n; i++) {
            drawShapeRow(i, n);
        }
    }

    // draws row of a shape with i spaces on each end
    // for a shape(triangle) of height n
    private static void drawShapeRow(int i, int n) {
        printSpaces(i);
        printAsterisks((n-i-1)*2+1);
        System.out.println();
    }
//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int rowOffset = 0;
        int nameOffset = 0;
        if (n*2 < 7) {
            rowOffset = (8-n*2)/2;
        } else {
            nameOffset = (n*2-8)/2;
        }
        for (int i = n-1; i > 0; i--) {
            printSpaces(rowOffset);
            drawShapeRow(i, n);
        }
        printSpaces(nameOffset);
        System.out.println("Angelica");
        for (int i = 1; i < n; i++) {
            printSpaces(rowOffset);
            drawShapeRow(i, n);
        }
    }
}
