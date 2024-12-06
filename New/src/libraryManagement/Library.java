package libraryManagement;

import libraryManagement.Book;


abstract class LibraryItem {
    public abstract void displayDetails();
}

public class Library {
    public static final int MAX_ITEMS = 100;
    public static Book[] items = new Book[MAX_ITEMS];

    private int Count ;

    public void addBook(Book book) {
        if (Count < MAX_ITEMS) {
            items[Count++] = book;
            System.out.println("Book '" + book.getTitle() + "' added to the library.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void issueBook(int bookId) {
        for (int i = 0; i < Count; i++) {
            Book book = items[i];
            if (book.getBookId() == bookId) {
                book.issueBook(bookId);
                return;

            }

        }

        System.out.println("Book with ID " + bookId + " not found.");
    }

    public void returnBook(int bookId) {
        for (int i = 0; i < Count; i++) {

            Book book = items[i];
            if (book.getBookId() == bookId) {
                System.out.println("Book has been returned");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");

    }

    public void displayBooks() {
        //Book book = null;
        System.out.println("Library Collection:\n");
        for (int i = 0; i < Count; i++) {
            if (items[i] != null) {
                items[i].displayDetails(items[i].getTitle(), items[i].getAuthor(), items[i].getBookId());
            }
        }
    }
}



