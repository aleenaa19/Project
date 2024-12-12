package Library__Management;
import Library__Management.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library Management System!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your role (Visitor/Member/Librarian): ");
        String role = scanner.nextLine();

        try {
            User user = UserFactory.createUser(role, name);
            user.menu();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid role specified. Please try again.");
        }
    }
}