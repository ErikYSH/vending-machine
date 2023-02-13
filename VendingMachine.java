import java.util.Scanner;

public class VendingMachine 
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;

        System.out.println("Enter bill value (1 = $1 bill, 5 = $5 bill, 10 = $10 bill");
        int billValue = in.nextInt();
        System.out.println("Enter quater value (1 = $0.25, 2 = $0.50, 3 = $0.75)");
        int quarterValue = in.nextInt();
        System.out.println("Enter item value in quarters");
        int itemPrice = in.nextInt();
        
        int quarterBill = quarterValue * PENNIES_PER_QUARTER;
        itemPrice = itemPrice * PENNIES_PER_QUARTER;
        int changeDue = (PENNIES_PER_DOLLAR * billValue) + quarterBill - itemPrice;
        int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
        changeDue = changeDue % PENNIES_PER_DOLLAR;
        int quaters = changeDue/ PENNIES_PER_QUARTER;   

        System.out.println("Lab 4 VendingMachine - Shih-Hung Yang");
        System.out.println("Your change below:");
        System.out.printf("Dollar coins: %6d %n", dollarCoins);
        System.out.printf("Quarters coins: %4d %n", quaters);
    }
    
}