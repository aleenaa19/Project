package Library__Management;
import Library__Management.*;

import java.util.Scanner;


class Member extends User {

    Library library = Library.getInstance();
    public Member(String name) {
        super(name);
    }

    @Override
    public void menu() {
        System.out.println("Member Menu:");
        System.out.println("1.View Books");
        System.out.println("2.Borrow Book");
        System.out.println("3.Return Book");
        System.out.println("4.Search for a book");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.println("Books in the library:");
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter the book ID to issue: ");
                    int bookId = sc.nextInt();
                    for (Books book : library.getItems().keySet()) {
                        if (book.getId() == bookId) {
                            if (book.isBookAvailability()) {
                                System.out.println("The book has been issued.");
                                book.setBookAvailability(false);
                                int borrowCopies=library.getItems().get(book) - 1;
                                library.getItems().replace(book, borrowCopies);
                            } else {
                                System.out.println("Sorry, the book is already issued.");
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the book ID to return: ");
                    bookId = sc.nextInt();
                    for (Books book : library.getItems().keySet()) {
                        if (book.getId() == bookId) {
                            if (book.isBookAvailability()) {
                                System.out.println("The book has been returned.");
                                book.setBookAvailability(true);
                                int availableCopies = library.getItems().get(book) + 1;
                                library.getItems().replace(book, availableCopies);
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter the title of the book to search: ");
                    String title = sc.nextLine();
                    sc.nextLine();
                    if (search(title)) {
                        System.out.println("Item found:" + title);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 5:
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    public boolean search(String title) {
        for (Books book : library.getItems().keySet()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }
}
