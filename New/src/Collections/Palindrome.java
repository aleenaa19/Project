package Collections;
import java.util.*;
import java.util.ArrayDeque;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.add(c);
        }
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        if(isPalindrome(str)==true)
        {
            System.out.println(" The string is palindrome");
        }
        else {
            System.out.println(" The string is not palindrome");

        }
    }

}

