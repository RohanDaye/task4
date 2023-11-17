
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount in your source currency: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the exchange rate to USD: ");
        double toUSDRate = scanner.nextDouble();

        System.out.print("Enter the target currency (e.g., EUR, GBP): ");
        String targetCurrency = scanner.next();

        double convertedAmount = amount * toUSDRate;

        System.out.println("Amount in " + targetCurrency + ": " + convertedAmount);

        scanner.close();
    }
}
