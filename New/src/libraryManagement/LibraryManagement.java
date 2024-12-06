
package libraryManagement;
import libraryManagement.*;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {

        Library library = new Library();
        User member = new Member("Alice", "123 Main St", 1);
        User visitor = new Visitor("Bob", "456 Oak St", 2);
        User librarian = new Librarian("Charlie", "789 Pine St", 3);

        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 101));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 102));

        Scanner sc=new Scanner(System.in);
        System.out.println("\nWelcome to Library Management System");
        System.out.println("Enter user type");
        System.out.println("1.Member");
        System.out.println("2.Librarian");
        System.out.println("3.Visitor");
        System.out.print("Enter option:");

        int ch=sc.nextInt();
        sc.nextLine();
        do{
            switch (ch) {
                case 1:
                    member.performAction(library);
                    break;
                case 2:
                    librarian.performAction(library);
                    break;
                case 3:
                    visitor.performAction(library);
                    break;
            }
        }
        while(ch!=3);
        return;
    }
}


