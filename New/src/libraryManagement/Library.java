package libraryManagement;
import libraryManagement.Book;

abstract class LibraryItem {
    public abstract void displayDetails();
}

public class Library {
        public static final int MAX_ITEMS = 100;
        //public static LibraryItem[] items = new LibraryItem[MAX_ITEMS];
        public static Book[] items = new Book[MAX_ITEMS];

    private int  Count = 0;

        public void addBook(Book book) {
            if (Count < MAX_ITEMS) {
                items[Count++] = book;
                System.out.println("libraryManagement.Book '" + book.getTitle() + "' added to the library.");
            } else {
                System.out.println("Library is full. Cannot add more books.");
            }
        }
        public void returnBook(int bookId) {
            for (int i = 0; i < Count; i++) {
                /*if (items[i] instanceof Book) {
                    Book book = (Book) items[i];
                    if (book.getBookId() == bookId) {
                        book.returnBook();
                        return;
                    }
                }*/
                Book book=items[i];
                if(book.getBookId()==bookId) {
                    book.issue();
                    return;
                }
            }
            System.out.println("libraryManagement.Book with ID " + bookId + " not found.");
        }

        public void displayBooks() {
            Book book;
            System.out.println("Library Collection:");
            for (int i = 0; i < Count; i++) {
                if (items[i] != null) {
                    items[i].displayDetails(book.getTitle(),book.getAuthor(),book.getBookId());
                }
            }
        }
    }



