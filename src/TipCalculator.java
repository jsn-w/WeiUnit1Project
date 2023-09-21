import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter table name: ");
        String tableName = scan.nextLine();
        System.out.print("Enter the number of people: ");
        int numPeople = scan.nextInt();

        double totalPrice = 0.00;

        while (true) {
            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            float foodCost = scan.nextFloat();
            totalPrice += foodCost;
            if (foodCost == -1) {
                totalPrice += 1;
                break;
            }
        }
        System.out.println("Enter tip percent: ");
        double tipPercent = scan.nextDouble();
        System.out.println("Total bill before tip: $" + totalPrice);
        double averagePrice = totalPrice/numPeople;
        System.out.println("Average bill per person: " + String.format("%.2f", averagePrice));
        System.out.println("Tip Percent: " + tipPercent + "%");
        double totalTip = (double) tipPercent / 100 * totalPrice;
        System.out.println("Total Tip: " + String.format("%.2f", totalTip));
        System.out.println("Average tip per person: $" + String.format("%.2f", totalPrice/numPeople));
        System.out.println("Total bill with tip: $" + String.format("%.2f", totalPrice + totalTip));

        scan.close();
    }
}