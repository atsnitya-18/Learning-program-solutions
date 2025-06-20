import java.util.Scanner;

public class FinancialForecast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of months of income data: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Need at least 2 months to forecast.");
            return;
        }

        double[] income = new double[n];
        System.out.println("Enter monthly income values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            income[i] = sc.nextDouble();
        }

        double min = income[0], max = income[0];
        for (int i = 1; i < n; i++) {
            if (income[i] < min) min = income[i];
            if (income[i] > max) max = income[i];
        }

        double totalGrowth = 0;
        for (int i = 1; i < n; i++) {
            totalGrowth += income[i] - income[i - 1];
        }

        double avgGrowth = totalGrowth / (n - 1);
        double growthPercent = (avgGrowth / income[n - 2]) * 100;
        double forecast = income[n - 1] + avgGrowth;

        System.out.println("\nForecast Summary:");
        System.out.printf("Highest Income: %.2f\n", max);
        System.out.printf("Lowest Income: %.2f\n", min);
        System.out.printf("Average Monthly Growth: %.2f (%.2f%%)\n", avgGrowth, growthPercent);
        System.out.printf("Estimated Income Next Month: %.2f\n", forecast);

        if (avgGrowth < 0) {
            System.out.println("Income is decreasing.");
        } else if (growthPercent < 1) {
            System.out.println("Income is stable with low growth.");
        } else {
            System.out.println("Income trend is positive.");
        }

        sc.close();
    }
}
