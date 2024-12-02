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
        int day = sc.nextInt();
        System.out.println("Enter the room type");
        String type = sc.nextLine();
        base=switch (type) {
            case "Standard" -> 500f;
            case "delux" -> 800f;
            case "suite" -> 1000f;

        };

        System.out.println("Base:" +base);
        float cost=base*day;
        System.out.println("Total amount:" +cost);
        if(day>5) {
             discount = 0.15f;

            float roomCost=base*day;

            float tax_rate = 10 / 100f;

             amount =(tax_rate * roomCost) - discount;
        }
            


        System.out.println("Total amount:" +amount);
    }
}
