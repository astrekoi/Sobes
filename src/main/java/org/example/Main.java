package org.example;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf();
        List<String> books = Arrays.asList("tame", "stiffen", "postpone", "decay", "teach", "double", "leaf", "stupid", "ability", "station", "educator");
        List<List<String>> shelfBooks;

        var newBook = bookShelf.distributeBook(books);

        for(int i = 0; i < newBook.size(); i++ ){
            System.out.println("Shelf" + (i + 1) + newBook.get(i));
        }
    }
}