/*using stream map convert all elements in a string array to upper case?*/

import java.util.Arrays;

public class Uppercase {
    public static void main(String[] args) {
        String[] array = {"apple","banana","orange"};
        String[] result = Arrays.stream(array)
                .map(x -> x.toUpperCase()).toArray(String[]::new);
        System.out.println("Result in uppercase:" + Arrays.toString(result));

    }

}
