/*  Create a Adminhelp desk support system such that  will
 process various issues created by the developers.
Tickets having high priority should be processed first.
Implement it using PriorityQueue class.Define a class Ticket with issue
and priority as properties by implementing Comparable interface.*/

package Collections;

import java.util.PriorityQueue;

class Ticket implements Comparable<Ticket> {
    String issue;
    int priority;

    public Ticket(String issue, int priority) {
        this.issue = issue;
        this.priority = priority;
    }

    // The compareTo method is used to order tickets in the PriorityQueue based on priority.
    @Override
    public int compareTo(Ticket o) {
        return Integer.compare(this.priority, o.priority);
    }

    public String toString() {
        return "[Issue: " + issue + ", Priority: " + priority + "]\n";
    }


}

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Ticket> ticket = new PriorityQueue<>();
        ticket.add(new Ticket("Bug in the System", 1));
        ticket.add(new Ticket("System crash", 2));
        ticket.add(new Ticket("Login failure", 3));
        ticket.add(new Ticket("Database connection issue", 1));
        System.out.print("Processing tickets..\n");
        while (!ticket.isEmpty()) {
            Ticket ticket1 = ticket.poll();
            System.out.print(ticket1);

        }


    }
}
