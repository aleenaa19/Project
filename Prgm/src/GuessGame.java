/*Pgm using looping statement
===================
Create a guessing game in which user can enter a number between 1 to 100.
If the user given number is equal to program generated random number then he/she
scores point otherwise try the next attempt.
Each user can make five attempts.On correct guess will get 5 score otherwise 0.
Output will be the score of user.(use for loop)
*/

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {


        int randInt,currentInp;
        int points=0;
        Scanner sc = new Scanner(System.in);

        Random random = new Random();


        for (int i = 0; i <5; i++) {
            randInt = random.nextInt(100);

            System.out.print("\nEnter a number:");
            currentInp = sc.nextInt();
            if (currentInp == randInt) {
                points += 5;
            } else {
                System.out.print("Try next attempt\n");

            }
        }
        System.out.print("Total points:" +points);

    }
}
