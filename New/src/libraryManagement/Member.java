import libraryManagement.Library;
import libraryManagement.Searchable;
import libraryManagement.User;

import java.util.Scanner;

class Member extends User implements Searchable {
    public Member(String name, String address, int userId) {

        super(name, address, userId);
    }
    public void performAction(Library library)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Issue libraryManagement.Book");
        System.out.println("2. Return libraryManagement.Book");
        System.out.println("3. View Available Books");
        System.out.println("4. Search for libraryManagement.Book/ Magazine");

        int choice = scanner.nextInt();
        scanner.nextLine();

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
            default:
                System.out.println("Invalid choice.");
        }
    }

}