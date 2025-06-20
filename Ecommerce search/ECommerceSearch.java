import java.util.Scanner;

public class ECommerceSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] products = {"Shoes", "Laptop", "Mobile", "Watch", "T-shirt", "Headphones"};
        System.out.println("Welcome to E-Commerce Search");
        System.out.print("Enter product to search: ");
        String input = sc.nextLine();


        boolean found = false;
        for (String product : products) {
            if (product.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }

    
        if (found) {
            System.out.println("Product \"" + input + "\" is available in the catalog.");
        } else {
            System.out.println("Product \"" + input + "\" not found.");
        }

        sc.close();
    }
}
