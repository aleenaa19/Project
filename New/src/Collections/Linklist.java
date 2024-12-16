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
            if (!list.isEmpty()) {
                System.out.println("Calls to be processed:");
                for (String remaining : list) {
                    System.out.println(remaining);
                }
            }
            else
            {
                System.out.println("All calls processed");
            }
        }
    }

}

