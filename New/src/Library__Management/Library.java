package Library__Management;
import Library__Management.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Singleton Pattern for Library
class Library {
    private static Library libraryInstance = null;
    private List<String> books;
    private static final int maxLength = 100;
    private Books[] items ;
    private int count=0;

    private Library() {
        items=new Books[maxLength];
        items[count++] = new Books(101,"The Great Gatsby","F. Scott Fitzgerald",  true);
        items[count++]=new Books(102,"Harper Lee",  "To Kill a Mockingbird",true);

    }

    public static Library getInstance() {
        if (libraryInstance == null) {
            libraryInstance = new Library();
        }
        return libraryInstance;
    }

    public Books[] getItems() {
        return items;
    }


    public List<String> getBooks() {
        return books;
    }

    public void addBook(Books book) {
        if (count < maxLength) {
            items[count++] = book;
            System.out.println("Book added to the library.");
        } else {
            System.out.println("library is full");
        }

    }
    public void displayBooks() {

        for (Books book : items) {
            System.out.println(book);
            if (book == null) {
                break;
            }
            System.out.println("Book id: " + book.getId() + "\nBook Title: " + book.getTitle() + "\nBook Author: " + book.getAuthor());
            System.out.print("\n");
        }

    }
/*
    public void removeBook(String book) {
        books.remove(book);
    }*/
}
