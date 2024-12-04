import java.util.*;

public class Validity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with brackets:");
        String s = sc.nextLine();
        //char[] arr = s.toCharArray();
        if(isValid(s)){
            System.out.println("Valid");}
        else{
            System.out.println("Invalid");
        }
    }
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                else if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.pop();

                    if (c == ')' && top != '(' ||
                            c == '}' && top != '{' ||
                            c == ']' && top != '[') {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }


}
