import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // welcome screen; asks for table name, cashier name, number of guests
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter table name: ");
        String tableName = scan.nextLine();
        System.out.print("Cashier name: ");
        String cashierName = scan.nextLine();
        System.out.print("Enter the number of people: ");
        int numPeople = scan.nextInt();
        scan.nextLine();

        // initializations of variables
        double totalPrice = 0.00;
        String receipt = "";

        // program asks for food name, quantity, cost; ends when -1 is entered to name of food
        boolean isRunning = true;
        while (isRunning) {
            System.out.print("\nEnter the name of the food (-1 to end): ");
            String foodName = scan.nextLine();
            if (foodName.equals("-1")) {
                isRunning = false;
            } else {
                System.out.print("Enter the quantity: ");
                int foodQuantity = scan.nextInt();
                System.out.print("Enter a cost in dollars and cents: $");
                double foodCost = scan.nextDouble();
                scan.nextLine();

                // calculates total price of the food entered
                totalPrice += foodQuantity * foodCost;

                // formats receipt
                receipt += foodQuantity + "x\t\t\t$" + String.format("%.2f", foodCost) + "\t\t" + foodName + "\n";
            }
        }

        // prompts user to enter the tip percentage
        System.out.print("\nEnter tip percent: ");
        double tipPercent = scan.nextDouble();
        scan.nextLine();

        // initialize and declared some variables used for the computations
        double averagePrice = totalPrice/numPeople;
        double totalTip = (double) tipPercent / 100 * totalPrice;
        double tipPerPerson = totalTip/numPeople;
        double totalBill = totalPrice + totalTip;

        // prints the bill before and after tip
        System.out.println("Total Bill Before Tip: $" + String.format("%.2f", totalPrice));
        System.out.println("Tip Percent: " + tipPercent + "%");
        System.out.println("Total Tip: $" + String.format("%.2f", totalTip));
        System.out.println("Total Bill: $" + String.format("%.2f", totalBill));

        // prints bill and tip per person before and after tip
        System.out.println("\nNumber of people: " + numPeople);
        System.out.println("Bill per person before tip: $" + String.format("%.2f", averagePrice));
        System.out.println("Tip per person: $" + String.format("%.2f", tipPerPerson));
        System.out.println("Total Bill per person: $" + String.format("%.2f", totalBill / numPeople));

        // prints formatted "receipt"
        System.out.println("\n------------------------------------");
        System.out.println("Total Items");
        System.out.println("Amount\t\tPrice\t\tItem");
        System.out.println(receipt);
        System.out.println("Table: " + tableName);
        System.out.println("Cashier: " + cashierName);
        System.out.println("------------------------------------");
        scan.close();
    }
}