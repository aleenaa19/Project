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


        enum RoomType {
            standard(500, "A standard room with basic facilities."),
            deluxe(800, "A deluxe room with extra amenities and a better view."),
            suite(1000, "A luxurious suite with premium services and more space.");

            private  final float base;
            private final String description;

            RoomType(float base, String description) {
                this.base = base;
                this.description = description;
            }

            public float getBaseRate(){
                return base;}

            private String getDescription(){
            return description;}
        }
    public static void main(String[] args) {
        float base;float discount=0;float amount=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nights:");
        int day = sc.nextInt();
        System.out.print("Enter the room type:");
        sc.nextLine();
        String type = sc.nextLine().toLowerCase();
         RoomType selectedRoom=null;
        for (RoomType room : RoomType.values()) {
            if (room.name().equals(type)) {
                 selectedRoom = room;
                break;
            }
        }
        if (selectedRoom == null) {
            System.out.println("Invalid room type entered.");
            return;
        }

        base=selectedRoom.getBaseRate();
        String description=selectedRoom.getDescription();

        System.out.print("Base rate:" +base);
        System.out.print("\n");
        System.out.print("Description:" +description);
        if(day>=5) {
             discount = 0.15f;
             amount=base*day;
             amount-=amount*0.15f;
             amount+=amount*0.10f;

        }
        else{
            amount=base*day;
            amount+=amount*0.10f;
        }


        System.out.println("\nTotal amount:" +amount);

    }


}

