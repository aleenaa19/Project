package libraryManagement;

import java.util.Scanner;



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
            System.out.println("1. View Available Books");
            library.displayBooks();
        }

}


