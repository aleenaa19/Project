/* 3.Using stream map find the length of all elements in the string array?
 */
package StreamAPI;

import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange"};
        System.out.println("Length of each element in array:");
        Arrays.stream(array).map(x -> x.length())
                .forEach(System.out::println);

    }

}
