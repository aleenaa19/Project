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


