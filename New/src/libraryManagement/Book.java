package libraryManagement;//Library Management using oop concepts

public class Book {
    private String b_author;
    private String title;
    private int bookId;
    private boolean isIssued;
    //private boolean availability;

    public Book(String title, String author, int bookId) {
        this.title = title;
        this.b_author = author;
        this.bookId = bookId;
        this.isIssued = true;
    }

    public String getAuthor() {
        return b_author;
    }

    public void setAuthor(String b_author) {
        this.b_author = b_author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;
    }


    public boolean isAvailable() {
        return isIssued;

    }

    public void issue() {
        if (isAvailable()) {
            System.out.println("Book not available");
        } else {
            System.out.println("Book is available");
        }
    }

    public void displayDetails(String title, String b_author, int bookId) {
        System.out.println("Book id:" + bookId);
        System.out.println("Book title:" + title);
        System.out.println("Book author:" + b_author);
        System.out.println("\n");


    }

    public void issueBook(int bookId) {
        System.out.println("Book has been issued");
    }


}



