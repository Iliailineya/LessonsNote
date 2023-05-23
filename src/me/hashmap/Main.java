package me.hashmap;

import java.util.*;

class Book{
    String autor;
    String name;
}

public class Main {
    int value;
    public static void main(String[] args) {
        Book book = new Book();
        book.autor = "Karnegy";
        book.name = "How to get friends";
        Map<String, Book> library = new HashMap<>();
        library.put(book.name, book);

        Book karnegiBook = library.get(book.name);
        System.out.println(karnegiBook.autor);
    }
}
