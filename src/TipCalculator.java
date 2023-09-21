import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.println("Enter table name: ");
        String tableName = scan.nextLine();
        System.out.println("Enter the number of people: ");
        int numPeople = scan.nextInt();

        while (true) {
            System.out.println("Enter a cost in dollars and cents (-1 to end): ");
            float foodCost = scan.nextFloat();
            System.out.println("Enter the item: ");
            String foodName = scan.nextLine();
        }
    }
}