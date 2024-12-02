/*Pgm using switch expression
==================
In a hotel room booking system the price of a room is based on its type and dynamically calculates the final price with
additional taxes or discounts.
standard room base rate is 500Rs
delux room base rate is 800Rs
suite room base rate is 1000Rs
if a customer stays for more than 5 nights there is a discount of 15%
and tax rate is 10%
Take as input number of nights he/she want to stay and room type based on that
 calculate total amount he/she need to pay*/


import java.util.Scanner;
 public class hotel {

    public static void main(String[] args) {
        float base;float discount=0;float amount=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nights:");
        int day = sc.nextInt();
        System.out.print("Enter the room type:");
        sc.nextLine();
        String type = sc.nextLine();
        base=switch (type) {
            case "Standard" -> 500f;
            case "delux" -> 800f;
            case "suite" -> 1000f;
            default -> {
                System.out.println("Invalid room type");
                yield 0.0f;
            }
        };

        System.out.println("Base:" +base);
        amount=base*day;

        if(day>5) {
             discount = 0.15f;
              amount=base*day;
             amount-=amount*0.15f;
             amount+=amount*0.10f;

        }

        System.out.println("Total amount:" +amount);
    }
}
