/*
Store names in a TreeSet and print it in alphabetical order.
Print the first name from the set  that comes when arranged in alphabetic order.
Print all the names starting from a specific name.
Name that comes after a given name.*/

package Collections;

import java.util.*;
import java.util.TreeSet;

public class NameOperation {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Gauri");
        names.add("Aleena");
        names.add("Bob");
        names.add("Evelyn");
        names.add("Sherin");

        System.out.println("Names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("\nFirst name in alphabetical order: " + names.first());
        System.out.print("Enter name to print all the names starting from given name:");
        String startingName = sc.nextLine();
        System.out.println("\nNames starting from " + startingName + ":");
        for (String name : names.tailSet(startingName)) {
            System.out.println(name);
        }

        //the name that comes after a given name
        System.out.print("Enter name to print the name that come after a given name:");
        String givenName = sc.nextLine();
        String nextName = names.higher(givenName);
        if (nextName != null) {
            System.out.println("\nThe name after " + givenName + " is: " + nextName);
        } else {
            System.out.println("\nThere is no name after " + givenName);
        }
    }
}
