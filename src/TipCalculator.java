import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter table name: ");
        String tableName = scan.nextLine();
        System.out.print("Cashier name: ");
        String cashierName = scan.nextLine();
        System.out.print("Enter the number of people: ");
        int numPeople = scan.nextInt();
        double totalPrice = 0.00;
        String receipt = "";

        while (true) {
            System.out.print("\nEnter the name of the food (-1 to end): ");
            scan.nextLine();
            String foodName = scan.nextLine();
            if (foodName.equals("-1")) {
                break;
            }
            System.out.print("Enter the quantity: ");
            int foodQuantity = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter a cost in dollars and cents: $");
            double foodCost = scan.nextDouble();
            totalPrice += foodQuantity * foodCost;
            receipt += foodQuantity + "x\t\t\t$" + foodCost + "\t\t\t"+ foodName + "\n";
        }
        System.out.print("\nEnter tip percent: ");

        double tipPercent = scan.nextDouble();
        double averagePrice = totalPrice/numPeople;
        double totalTip = (double) tipPercent / 100 * totalPrice;
        double tipPerPerson = totalTip/numPeople;
        double totalBill = totalPrice + totalTip;

        System.out.println("Total bill before tip: $" + String.format("%.2f", totalPrice));
        System.out.println("Bill before tip per person: $" + String.format("%.2f", averagePrice));
        System.out.println("Tip Percent: " + tipPercent + "%");
        System.out.println("Total Tip: $" + String.format("%.2f", totalTip));
        System.out.println("Tip per person: $" + String.format("%.2f", tipPerPerson));
        System.out.println("Total bill: $" + String.format("%.2f", totalBill));
        System.out.println("Total bill per person: $" + totalBill / numPeople);

        System.out.println("\n------------------------------------");
        System.out.println("Receipt");
        System.out.println("Amount\t\tPrice\t\tItem");
        System.out.println(receipt);
        System.out.println("Table: " + tableName);
        System.out.println("Cashier: " + cashierName);
        System.out.println("------------------------------------");
        scan.close();
    }
}