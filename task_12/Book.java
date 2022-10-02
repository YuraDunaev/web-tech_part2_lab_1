package com.company.task_12;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition = 10;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book)obj;

        return  (this.title == book.title)  &&
                (this.author == book.author) &&
                (this.price == book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return "Title: " + title + " Author: " + author + " Price: " + price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
