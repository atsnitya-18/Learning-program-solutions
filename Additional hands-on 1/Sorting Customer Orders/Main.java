import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Tharunika", 5500),
            new Order(102, "Anjali", 12000),
            new Order(103, "Ravi", 3000),
            new Order(104, "Kiran", 7000)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.print("Choose sorting method: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Sorter.bubbleSort(orders);
            System.out.println("\nSorted using Bubble Sort:");
        } else if (choice == 2) {
            Sorter.quickSort(orders, 0, orders.length - 1);
            System.out.println("\nSorted using Quick Sort:");
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
