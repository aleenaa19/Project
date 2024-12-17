package Library__Management;

public class Books {
    private final int bookId;
    private final String bookTitle;
    private final String bookAuthor;
    private boolean bookAvailability;
    private int numOfCopies;

    public Books(int bookId, String bookTitle, String bookAuthor, boolean bookAvailability,int numOfCopies) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookAvailability = bookAvailability;
        this.numOfCopies=numOfCopies;
    }

    // private static boolean bookIssued;



    public String getTitle() {
        return bookTitle;
    }

    public int getId() {
        return bookId;
    }

    public String getAuthor() {
        return bookAuthor;
    }

    public boolean isBookAvailability() {
        return bookAvailability;
    }

    public void setBookAvailability(boolean bookAvailability) {
        this.bookAvailability = bookAvailability;
    }
    public int getNumOfCopies()
    {
        return numOfCopies;
    }



}