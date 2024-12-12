package Library__Management;
import Library__Management.*;

import java.util.Scanner;

class Visitor extends User {
    public Visitor(String name) {
        super(name);
    }

    @Override
    public void menu() {
        System.out.println("Visitor Menu:");
        System.out.println("1. View Books");
        System.out.println("2. Exit");
        Scanner scanner = new Scanner(System.in);
        Library library = Library.getInstance();

        while (true) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Books in the library:");
                    library.displayBooks();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}

