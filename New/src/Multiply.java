/*1.using stream map function multiply all elements in an array by 3?
 */

import java.util.Arrays;

public class Multiply {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = Arrays.stream(array).map(x -> x * 3).toArray();
        System.out.println(Arrays.toString(result));

    }

}
