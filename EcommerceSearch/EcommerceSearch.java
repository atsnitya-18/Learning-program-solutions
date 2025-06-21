import java.util.Arrays;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(202, "Shoes", "Fashion"),
            new Product(303, "Watch", "Accessories"),
            new Product(404, "Phone", "Electronics"),
            new Product(505, "Bag", "Travel")
        };

        System.out.print("Enter Product ID to search: ");
        int searchId = sc.nextInt();

        System.out.println("\nLinear Search:");
        long startLinear = System.nanoTime();
        int index1 = linearSearch(products, searchId);
        long endLinear = System.nanoTime();
        if (index1 != -1) {
            Product p = products[index1];
            System.out.println("Product Found: " + p.productName + " | " + p.category);
        } else {
            System.out.println("Product not found.");
        }
        System.out.println("Time taken (ns): " + (endLinear - startLinear));

        Arrays.sort(products, (a, b) -> a.productId - b.productId);

        System.out.println("\nBinary Search:");
        long startBinary = System.nanoTime();
        int index2 = binarySearch(products, searchId, 0, products.length - 1);
        long endBinary = System.nanoTime();
        if (index2 != -1) {
            Product p = products[index2];
            System.out.println("Product Found: " + p.productName + " | " + p.category);
        } else {
            System.out.println("Product not found.");
        }
        System.out.println("Time taken (ns): " + (endBinary - startBinary));

        sc.close();
    }

    public static int linearSearch(Product[] products, int searchId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == searchId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, int searchId, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (products[mid].productId == searchId) {
            return mid;
        } else if (products[mid].productId < searchId) {
            return binarySearch(products, searchId, mid + 1, high);
        } else {
            return binarySearch(products, searchId, low, mid - 1);
        }
    }
}
