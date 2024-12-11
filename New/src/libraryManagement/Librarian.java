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
        System.out.println("\n1. Add Book");
        System.out.println("2. View Available Books");
        System.out.println("3.Exit");


        System.out.println("Enter choice for librarian");
        int choice = scanner.nextInt();
        scanner.nextLine();
        do {
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    scanner.nextLine();
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
                case 3:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.print("Do u want to continue librarian operations?:");
            choice=scanner.nextInt();
        }
        while(choice!=3);
    }
}
