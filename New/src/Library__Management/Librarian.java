package Library__Management;
import Library__Management.*;


import java.util.Scanner;

// Librarian Class
class Librarian extends User {
    public Librarian(String name) {
        super(name);
    }

    @Override
    public void menu() {
        System.out.println("Librarian Menu:");
        System.out.println("1. View Books");
        System.out.println("2. Add Book");
        System.out.println("3. Remove Book");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        Library library = Library.getInstance();

        while (true) {
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Books in the library:");
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter book author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter book ID: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter number of copies: ");
                    int copies = sc.nextInt();
                    Books newBook = new Books(bookId,title,author,true,copies);
                    library.addBook(newBook);
                    System.out.println("Book added: " + newBook);
                    break;
                case 3:
                    System.out.print("Enter book name to remove: ");
                    String removeBook = sc.nextLine();

                    //todo
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
