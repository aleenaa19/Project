import java.util.Scanner;
import java.util.HashSet;
public class Stringg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sentence = sc.nextLine();
        sentence = sentence.toLowerCase();
        String[] words = sentence.split(" ");

        HashSet set = new HashSet();
        for(String word : words ) {
            if(!set.add(word)){
                System.out.println("Duplicate word present:" +word);
            }
        }
    }
}