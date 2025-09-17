package supermarket;

import java.util.Scanner;

public class SupermarketBilling {
	
	public static void main(String[] args) {
        Scanner billing = new Scanner(System.in);

       
        System.out.print("Enter number of different items bought: ");
        int n = billing.nextInt();

        
        String[] itemNames = new String[n];
        double[] prices = new double[n];
        int[] quantities = new int[n];
        double[] subtotals = new double[n];

        double total = 0; // total before discount

        for (int i = 0; i < n; i++) {
            billing.nextLine(); 
            System.out.print("Enter item name: ");
            itemNames[i] = billing.nextLine();

            System.out.print("Enter price per unit: ");
            prices[i] = billing.nextDouble();

            System.out.print("Enter quantity: ");
            quantities[i] = billing.nextInt();

        
            subtotals[i] = prices[i] * quantities[i];
            total += subtotals[i];
        }

       
        double discount = 0;
        if (total > 50000) {
            discount = total * 0.05; // 5% discount
        }
        double finalAmount = total - discount;

        
        System.out.println("\n--- SUPERMARKET RECEIPT ---");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item", "Qty", "Price", "Subtotal");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n",
                    itemNames[i], quantities[i], prices[i], subtotals[i]);
        }
        System.out.println("----------------------------");
        System.out.printf("Grand Total: %.2f\n", total);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("Final Amount: %.2f\n", finalAmount);
        billing.close();
    }
}
