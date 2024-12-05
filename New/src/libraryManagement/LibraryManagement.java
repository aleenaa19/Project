package libraryManagement;
import libraryManagement.*;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        User member = new Member("Alice", "123 Main St", 1);
        User visitor = new Visitor("Bob", "456 Oak St", 2);
        User librarian = new Librarian("Charlie", "789 Pine St", 3);

        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 101));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 102));

        member.performAction(library);

        librarian.performAction(library);

        visitor.performAction(library);
    }
}


