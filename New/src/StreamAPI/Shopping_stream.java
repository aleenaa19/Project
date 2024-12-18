/*.create a shopping cart program(Using HashMap with product name and price as key value pair)
Process the map with Stream
  1. add product
  2.remove product
  3.get all products
  4.find the total price of all products purchased
  5.Find product with its price value
  6.Find the price value of a product
 */

package StreamAPI;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Shopping_stream {
    Map<String, Double> cart;

    public Shopping_stream() {
        cart = new HashMap<>();
    }

    public void addProd(String prodName, double price) {
        cart.put(prodName, price);
    }

    public void removeProd(String prodName) {
        cart.remove(prodName);
    }

    public void getProducts() {
        cart.forEach((prodName, price) ->
                System.out.println(prodName + ":" + price));
    }

    public double getTotalPrice() {
        return cart.values().stream()
                .mapToDouble(Double::doubleValue).sum();
    }

    public void findProd(String prodName) {
        if (cart.containsKey(prodName)) {
            System.out.println("ProductName:" + prodName + "  price:" + cart.get(prodName));
        }
        else {
            System.out.println("Product not found");
        }
    }

    public double findPrice(String prodName) {
        if (cart.containsKey(prodName)) {
            return cart.get(prodName);
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shopping_stream cart = new Shopping_stream();

        // Add products
        cart.addProd("Apple", 10.0);
        cart.addProd("Banana", 5.0);
        cart.addProd("Cherry", 7.0);

        // Get all products
        System.out.println("All Products in the Cart:");
        cart.getProducts();

        // Find total price
        double total = cart.getTotalPrice();
        System.out.println("\nTotal Price of All Products: " + total);

        //Find product
        System.out.print("\nEnter a product to find:");
        String prod = sc.nextLine();
        cart.findProd(prod);

        //Find price
        System.out.print("Enter a product to find price:");
        String prod1 = sc.nextLine();
        System.out.println("Price of product:"+ cart.findPrice(prod1));

        //Remove product
        System.out.print("Enter a product to remove:");
        String prod2 = sc.nextLine();
        cart.removeProd(prod2);

        //Display cart after removing ptoduct
        System.out.print("\nAll Products in the Cart After Removal:\n");
        cart.getProducts();

    }

}

