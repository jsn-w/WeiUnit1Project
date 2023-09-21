import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.println("Enter table name: ");
        String tableName = scan.nextLine();
        System.out.println("Enter the number of people: ");
        int numPeople = scan.nextInt();

        double totalPrice = 0.00;


        while (true) {
            System.out.println("Enter a cost in dollars and cents (-1 to end): ");
            float foodCost = scan.nextFloat();
            totalPrice += foodCost;

            if (foodCost == -1) {
                break;
            }
        }
        System.out.println("Enter tip percent: ");
        double tipPercent = scan.nextDouble();
        System.out.println("Total bill before tip: $" + totalPrice);
        System.out.println("Tip Percent: " + tipPercent);
        System.out.println("Total Tip: " + tipPercent * totalPrice);

        scan.close();
    }
}