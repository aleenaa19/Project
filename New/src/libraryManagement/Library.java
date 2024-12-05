abstract class LibraryItem {
    public abstract void displayDetails();
}

class Library {
        public static final int MAX_ITEMS = 100;
        public static LibraryItem[] items = new LibraryItem[MAX_ITEMS];
        private int  Count = 0;

        public void addBook(Book book) {
            if (Count < MAX_ITEMS) {
                items[Count++] = book;
                System.out.println("Book '" + book.getTitle() + "' added to the library.");
            } else {
                System.out.println("Library is full. Cannot add more books.");
            }
        }
        public void returnBook(int bookId) {
            for (int i = 0; i < Count; i++) {
                if (items[i] instanceof Book) {
                    Book book = (Book) items[i];
                    if (book.getBookId() == bookId) {
                        book.returnBook();
                        return;
                    }
                }
            }
            System.out.println("Book with ID " + bookId + " not found.");
        }

        public void displayBooks() {
            System.out.println("Library Collection:");
            for (int i = 0; i < itemCount; i++) {
                if (items[i] != null) {
                    items[i].displayDetails();
                }
            }
        }
    }



