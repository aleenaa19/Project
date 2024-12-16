/* Create a cart with Product name as key
and price as value
add items to the cart
display items
calculate total price
check whether a particular product is added to cart */

package Collections;

import java.util.HashMap;
import java.util.*;

public class ShoppingCart {

    static HashMap<String, Float> cart = new HashMap<>();

    public void displayItems() {
        if (cart.isEmpty()) {
            System.out.print("Your cart is empty");

        }
        else {
            System.out.println("Items in your cart..");
            for (Map.Entry<String, Float> entry : cart.entrySet()) {
                String product = entry.getKey();
                Float price = entry.getValue();
                System.out.print("Product:" + product + "," + "Price:" + price + "\n");

            }
        }
    }
    public boolean ProductInCart(String product)
    {
        return cart.containsKey(product);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        cart.put("Laptop", 70000.0f);
        cart.put("Travel Bag", 700.0f);
        cart.put("Book", 50.0f);
        cart.put("Headphones", 1000.0f);


        //To Display all items
        float total = 0;
        for (float price : cart.values()) {
            total += price;
        }
        ShoppingCart cart=new ShoppingCart();
        cart.displayItems();

        System.out.print("\nTotal Price:" + total + "\n");
        System.out.print("Enter a product to check in cart:");
        String product=sc.nextLine().toLowerCase();
        if(cart.ProductInCart(product))
        {
            System.out.println("Product " +product+ " is in the cart");
        }
        else {
            System.out.println("Product " +product+ " is not in the cart");
        }

    }

}
