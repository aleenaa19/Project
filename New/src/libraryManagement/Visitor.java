package libraryManagement;

import libraryManagement.Library;
import libraryManagement.User;

class Visitor extends User {
    public Visitor(String name, String address, int userId) {

        super(name, address, userId);
    }
    public void performAction(Library library) {
        //System.out.println("Welcome, Visitor " + name + "!");
        System.out.println("You can only view the available books.");
        library.displayBooks();
    }
}