package com.company.task_16;

import com.company.task_12.Book;

import java.util.Comparator;

public class TitleBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}