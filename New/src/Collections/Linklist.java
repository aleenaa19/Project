/*
1.Using LinkedList process all the incoming calls in a call center in first come first serve manner.You can use string as collection object.
Add all incoming calls to the list .
Remove the first call from list for processing
If the list is empty print the message "all calls processed"
Otherwise display all calls to be processed from the list.*/

package Collections;


import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Call 1");
        list.add("Call 2");
        list.add("Call 3");
        list.add("Call 4");
        while (!list.isEmpty()) {
            String call = list.remove();
            System.out.println("Processing:" + call);
            System.out.println("Calls to be processed:" + list);
        }
        System.out.println("All calls processed");

    }
}



