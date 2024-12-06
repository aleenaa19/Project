package libraryManagement;

import libraryManagement.Book;
import libraryManagement.Library;
import libraryManagement.User;

import java.util.Scanner;

class Librarian extends User {
    public Librarian(String name, String address, int userId) {

        super(name, address, userId);
    }

    @Override
    public void performAction(Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add libraryManagement.Book");
        System.out.println("2. View Available Books");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                System.out.print("Enter book author: ");
                String author = scanner.nextLine();
                System.out.print("Enter book ID: ");
                int bookId = scanner.nextInt();
                Book newBook = new Book(title, author, bookId);
                library.addBook(newBook);
                break;

            case 2:
                library.displayBooks();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
