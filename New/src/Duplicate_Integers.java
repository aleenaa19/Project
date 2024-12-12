import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;


    @FunctionalInterface
    interface Duplicates {
        void store(Integer num);
    }
public class Duplicate_Integers {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the elements:");

            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            HashSet<Integer> uniqueNumbers = new HashSet<>();

                Duplicates adder = num -> uniqueNumbers.add(num);

            for ( int i = 0; i < size; i++) {
                adder.store(arr[i]);
            }

            Integer[] result = uniqueNumbers.toArray(new Integer[0]);
            System.out.println("Array with unique elements: " + Arrays.toString(result));

            scanner.close();
        }
    }



