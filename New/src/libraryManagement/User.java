import java.util.Scanner;

interface Searchable {
    boolean searchItem(String Title);
}

    public class User {

    String name;
    String address;
    int userId;

    public User(String name, String address, int userId) {
        this.name = name;
        this.address = address;
        this.userId = userId;
    }
        public void performAction(Library library) {
            System.out.println("Welcome " + name + "!");
            System.out.println("Choose an action:");
            System.out.println("1. View Available Books");
            library.displayBooks();
        }

}
    class Member extends User implements Searchable {
        public Member(String name, String address, int userId) {

            super(name, address, userId);
        }
        public void performAction(Library library)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Issue Book");
            System.out.println("2. Return Book");
            System.out.println("3. View Available Books");
            System.out.println("4. Search for Book/ Magazine");

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
    }
    class Visitor extends User {
        public Visitor(String name, String address, int userId) {
            super(name, address, userId);
        }
        public void performAction(Library library) {
            System.out.println("Welcome, Visitor " + name + "!");
            System.out.println("You can only view the available books.");
            library.displayBooks();
        }
    }
    class Librarian extends User{
        public Librarian(String name, String address, int userId) {
            super(name, address, userId);
        }

        @Override
        public void performAction(Library library) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Add Book");
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
