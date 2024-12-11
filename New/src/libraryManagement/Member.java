package libraryManagement;

import libraryManagement.Library;
import libraryManagement.Searchable;
import libraryManagement.User;

import java.util.Scanner;

import static libraryManagement.Library.items;

class Member extends User implements Searchable {
    Scanner scanner = new Scanner(System.in);

    @Override
    public boolean searchItem(String Title) {
       /* Book book=null;
        String inp = scanner.nextLine();
        if (book.getTitle() == inp) {
            return true;
        }
        else {
            return false;
        }*/
        for (Book book : items) {
            if (book.getTitle().equalsIgnoreCase(Title)) {
                return true;
            }
        }
        return false;
    }


    public Member(String name, String address, int userId) {

        super(name, address, userId);
    }

    public void performAction(Library library) {

        System.out.println("1. Issue Book");
        System.out.println("2. Return Book");
        System.out.println("3. View Available Books");
        System.out.println("4. Search for Book/ Magazine");
        System.out.println("5.Exit\n");
        System.out.print("Enter choice for Member operations:");
        int choice = scanner.nextInt();
        scanner.nextLine();

        do {
            switch (choice) {
                case 1:
                    System.out.print("Enter the book ID to issue: ");
                    int issueId = scanner.nextInt();
                    library.issueBook(issueId);
                    break;
                case 2:
                    System.out.print("Enter the book ID to return: ");
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    System.out.print("Enter the title of the book or magazine to search: ");
                    String title = scanner.nextLine();
                    if (searchItem(title)) {
                        System.out.println("Item found: " + title);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Member..");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Do u want to continue Member operations?:");
            choice=scanner.nextInt();

        }
        while(choice!=5);
    }

}