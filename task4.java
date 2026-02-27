import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fixed exchange rates (example rates)
        double USD = 1.0;
        double INR = 83.0;
        double EUR = 0.92;
        double GBP = 0.78;

        System.out.println("Available currencies: USD, INR, EUR, GBP");

        System.out.print("Enter base currency: ");
        String base = sc.next().toUpperCase();

        System.out.print("Enter target currency: ");
        String target = sc.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        // Convert base currency to USD first
        double amountInUSD = 0;

        switch (base) {
            case "USD":
                amountInUSD = amount / USD;
                break;
            case "INR":
                amountInUSD = amount / INR;
                break;
            case "EUR":
                amountInUSD = amount / EUR;
                break;
            case "GBP":
                amountInUSD = amount / GBP;
                break;
            default:
                System.out.println("Invalid Base Currency!");
                return;
        }

        // Convert USD to target currency
        double convertedAmount = 0;

        switch (target) {
            case "USD":
                convertedAmount = amountInUSD * USD;
                break;
            case "INR":
                convertedAmount = amountInUSD * INR;
                break;
            case "EUR":
                convertedAmount = amountInUSD * EUR;
                break;
            case "GBP":
                convertedAmount = amountInUSD * GBP;
                break;
            default:
                System.out.println("Invalid Target Currency!");
                return;
        }

        System.out.println("\nConverted Amount: " + convertedAmount + " " + target);

        sc.close();
    }
}