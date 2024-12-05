public class LibraryManagement {
    public static void main(String[] args) {
        // Create library and users
        Library library = new Library();
        User member = new Member("Alice", "123 Main St", 1);
        User visitor = new Visitor("Bob", "456 Oak St", 2);
        User librarian = new Librarian("Charlie", "789 Pine St", 3);

        // Add some items to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 101));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 102));

        // Demonstrate member actions
        member.performAction(library);

        // Demonstrate librarian actions
        librarian.performAction(library);

        // Demonstrate visitor actions
        visitor.performAction(library);
    }
}


