package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        printStream.printf("Looking for book titles containing substring \"%s\":\n", partialBookTitle);
        for (String book : books) {
            if (book.toLowerCase().contains(partialBookTitle.toLowerCase())) {
                printStream.println(book);
            }
        }
        printStream.print("\n");
    }
}
