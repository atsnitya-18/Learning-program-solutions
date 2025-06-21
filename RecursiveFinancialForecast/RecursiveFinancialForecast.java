import java.util.Scanner;

public class RecursiveFinancialForecast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of months of income data: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Need at least 2 months to forecast.");
            return;
        }

        double[] income = new double[n];
        System.out.println("Enter income for each month:");
        for (int i = 0; i < n; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            income[i] = sc.nextDouble();
        }

        double totalGrowth = 0;
        for (int i = 1; i < n; i++) {
            totalGrowth += income[i] - income[i - 1];
        }

        double avgGrowth = totalGrowth / (n - 1);

        System.out.print("Enter number of future months to predict: ");
        int futureMonths = sc.nextInt();

        double forecastedValue = predictIncome(income[n - 1], avgGrowth, futureMonths);
        System.out.printf("Estimated income after %d month(s): %.2f\n", futureMonths, forecastedValue);

        sc.close();
    }

    public static double predictIncome(double currentValue, double growth, int monthsRemaining) {
        if (monthsRemaining == 0) {
            return currentValue;
        }
        return predictIncome(currentValue + growth, growth, monthsRemaining - 1);
    }
}
