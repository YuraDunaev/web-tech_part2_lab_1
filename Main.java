package com.company;

import com.company.task_1.Formula;
import com.company.task_12.Book;
import com.company.task_13.ProgrammerBook;
import com.company.task_14.CloneableBook;
import com.company.task_15.ComparableBook;
import com.company.task_16.AuthorTitleBookComparator;
import com.company.task_16.AuthorTitlePriceBookComparator;
import com.company.task_16.TitleAuthorBookComparator;
import com.company.task_16.TitleBookComparator;
import com.company.task_2.Graph;
import com.company.task_3.StepFunction;
import com.company.task_4.PrimeNumbers;
import com.company.task_5.IncConstistency;
import com.company.task_6.Matrix;
import com.company.task_7.ShellSort;
import com.company.task_8.CombineSequences;
import com.company.task_9.Basket;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();

        task12();
        task13();
        task14();
        task15();
        task16();
    }

    public static void task1() {
        System.out.println("Task1: ");

        var formula = new Formula(14, 21);
        System.out.println("Task 1: " + formula.calculate());

        System.out.println("---------------------------\n");
    }

    public static void task2() {
        System.out.println("Task2: ");

        var graph = new Graph();
        System.out.println("Element is contains: "graph.contains(new Point(0, 0)));

        System.out.println("---------------------------\n");
    }

    public static void task3() {
        System.out.println("Task3: ");

        var stepFunction = new StepFunction(10, 100, 10);
        stepFunction.printResults();

        System.out.println("---------------------------\n");
    }

    public static void task4() {
        System.out.println("Task4: ");

        var pNumbers = new PrimeNumbers(10);
        pNumbers.printNumbersOfPrimes();

        System.out.println("---------------------------\n");
    }

    public static void task5() {
        System.out.println("Task5: ");
        IncConstistency incConstistency = new IncConstistency(4);

        System.out.println(incConstistency.getItemsToRemoveCount());
        System.out.println("---------------------------\n");
    }

    public static void task6() {
        System.out.println("Task6: ");

        var matrix = new Matrix(5);
        matrix.createMatrix();
        matrix.printMatrix();

        System.out.println("---------------------------\n");
    }

    public static void task7() {
        System.out.println("Task7: ");

        var shellSort = new ShellSort(10);
        shellSort.sort();
        shellSort.printArray();

        System.out.println("---------------------------\n");
    }

    public static void task8() {
        System.out.println("Task8: ");

        var combineSequences = new CombineSequences(5, 3);
        System.out.println(combineSequences.getIndexesArray());

        System.out.println("---------------------------\n");
    }

    public static void task9() {
        System.out.println("Task9: ");

        Basket basket = new Basket();
        basket.printBalls();

        System.out.println("---------------------------\n");
    }

    public static void task12() {
        System.out.println("Task12: ");

        var book1 = new Book("title", "author", 10);
        var book2 = new Book("title", "author", 10);
        var book3 = new Book("title3", "author3", 4);

        System.out.println("Book1 equals ProgrammerBook2: " + book1.equals(book2));
        System.out.println("Book1 equals ProgrammerBook3: " + book1.equals(book3));

        System.out.println(book1);

        System.out.println("---------------------------\n");
    }

    public static void task13() {
        System.out.println("Task13: ");

        var programmerBook1 = new ProgrammerBook("title", "author", 4, "ru", 1);
        var programmerBook2 = new ProgrammerBook("title", "author", 4, "ru", 1);
        var programmerBook3 = new ProgrammerBook("title3", "author4", 5, "by", 2);

        System.out.println("ProgrammerBook1 equals ProgrammerBook2: " + programmerBook1.equals(programmerBook2));
        System.out.println("ProgrammerBook1 equals ProgrammerBook3: " + programmerBook1.equals(programmerBook3));

        System.out.println(programmerBook1);


        System.out.println("---------------------------\n");
    }

    public static void task14() {
        System.out.println("Task14: ");

        var cloneableBook = new CloneableBook("title", "author", 4);
        System.out.println(cloneableBook.clone());

        System.out.println("---------------------------\n");
    }

    public static void task15() {
        System.out.println("Task15: ");

        var book = new ComparableBook("Title", "Author", 15, 1);
        var equalBook = new ComparableBook("Title", "Author", 15, 1);
        var greaterBook = new ComparableBook("Title", "Author", 15, 2);
        var lesserBook = new ComparableBook("Title", "Author", 15, 0);

        System.out.println("Task 15:");
        System.out.printf("Book & EqualBook: %d\n", book.compareTo(equalBook));
        System.out.printf("Book & LesserBook: %d\n", book.compareTo(lesserBook));
        System.out.printf("Book & GreaterBook: %d\n", book.compareTo(greaterBook));
        System.out.println();
    }

    public static void task16() {

        var books = new ArrayList<Book>();
        books.add(new Book("AAA", "BBB", 1));
        books.add(new Book("AAA", "AAA", 1));
        books.add(new Book("AAA", "AAA", 4));
        books.add(new Book("CCC", "ABC", 2));
        books.add(new Book("ABC", "CCC", 2));
        books.add(new Book("BBB", "AAA", 3));

        System.out.println("Task 16:");

        System.out.println("Origin:");
        printArrayOfBooks(books);

        System.out.println("By title:");
        books.sort(new TitleBookComparator());
        printArrayOfBooks(books);

        System.out.println("By title and author:");
        books.sort(new TitleAuthorBookComparator());
        printArrayOfBooks(books);

        System.out.println("By author and title:");
        books.sort(new AuthorTitleBookComparator());
        printArrayOfBooks(books);

        System.out.println("By author, title and price:");
        books.sort(new AuthorTitlePriceBookComparator());
        printArrayOfBooks(books);

        System.out.println();
    }

    public static void printArrayOfBooks(ArrayList<Book> books) {
        for (Book b : books) {
            System.out.printf("%s\n", b.toString());
        }
        System.out.println();
    }
}
