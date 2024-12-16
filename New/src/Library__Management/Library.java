package Library__Management;

import Library__Management.*;


import java.util.*;

// Singleton Pattern for Library

class Library {
    private static Library libraryInstance = null;
    private List<String> books;
    private static final int maxLength = 100;
    //private Books[] items ;
    HashMap<Books, Integer> items;
    private int count = 0;

    private Library() {
       /* items=new Books[maxLength];
        items[count++] = new Books(101,"The Great Gatsby","F. Scott Fitzgerald",  true);
        items[count++]=new Books(102,"Harper Lee",  "To Kill a Mockingbird",true);

*/
        items = new HashMap<>();
        Books book1 = new Books(101, "The Great Gatsby", "F. Scott Fitzgerald", true);
        Books book2 = new Books(102, "To Kill a Mockingbird", "Harper Lee", true);

        items.put(book1, 2);
        items.put(book2, 3);

}

        public static Library getInstance() {
            if (Library.libraryInstance == null) {
                libraryInstance = new Library();
            }
            return Library.libraryInstance;
        }

        public Map<Books, Integer> getItems() {
            return items;
        }


        public List<String> getBooks() {
            return books;
        }

        public void addBook(Books book) {
            if (count < maxLength) {
                items.put(book,book.getId());
                System.out.println("Book added to the library.");
            } else {
                System.out.println("library is full");
            }

        }

       /* public void displayBooks() {

            for (Books book : items) {
                System.out.println(book);
                if (book == null) {
                    break;
                }
                System.out.println("Book id: " + book.getId() + "\nBook Title: " + book.getTitle() + "\nBook Author: " + book.getAuthor());
                System.out.print("\n");
            }

        }*/
       public void displayBooks() {
           if (items.isEmpty()) {
               System.out.println("No books available.");
           } else {
               for (Map.Entry<Books, Integer> entry : items.entrySet()) {
                   Books book = entry.getKey();
                   int copies = entry.getValue();
                   System.out.println( "Book id: " + book.getId() + "\nBook Title: " + book.getTitle() +
                           "\nBook Author: " + book.getAuthor()+ ", Copies: " + copies);
               }
           }
       }
}

/*
    public void removeBook(String book) {
        books.remove(book);
    }*/

