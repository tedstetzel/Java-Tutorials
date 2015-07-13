import java.util.Scanner;

public class Keychains3
{
		public static void main(String[] args)
		{
			
			int keychains = 0;
			int cost = 10;
			double tax = .0825;
			int costPerOrder = 5;
			int costPerItem = 1;
			
			Scanner keyboard = new Scanner(System.in);
			int choice;
			boolean loop = true;
			
			System.out.println("Ye Olde Keychain Shoppe");
			
			while (loop == true)
			{
				System.out.println("\n1. Add Keychains to Order");
				System.out.println("2. Remove Keychains from Order");
				System.out.println("3. View Current Order");
				System.out.println("4. Check out");
				System.out.print("\nPlease enver your choice: ");
				choice = keyboard.nextInt();
				System.out.print(" ");
				
				if (choice == 1)
				{
				System.out.print("\nYou have " + keychains + " how many would you like to add? ");
				keychains = keychains + add_keychains(keyboard.nextInt());
				System.out.print("\nYou now have " + keychains + " keychains");
				
				
				}
				else if (choice == 2)
				{
				System.out.println("\nREMOVE KEYCHAINS");
				System.out.print("\nYou have " + keychains + " how many would you like to remove? ");
				keychains = keychains - add_keychains(keyboard.nextInt());
				System.out.print("\nYou now have " + keychains + " keychains");
				
				}
				

				
				
				else if (choice == 3)
				{
				view_order(keychains, cost, tax, costPerOrder, costPerItem);
				
				
				}
				
				else if (choice == 4)
				{
				checkout(keychains, cost, tax, costPerOrder, costPerItem);
				//checkout
				
				loop = false;
				
				
				}
			}
		}
	
	
	
		public static int add_keychains(int addRemove)
		{ 
			int keychains = 0;
		
			if (addRemove > 0)
			{
				keychains = addRemove;
				return keychains;	
			}
			else if (addRemove <= 0)
			{
				System.out.println("Please enter a number greater than 0");
			}
			
			return keychains;	
		}
		
		public static int remove_keychains(int addRemove)
		{ 
			int keychains = 0;
		
			if (addRemove > 0)
			{
		
				keychains = addRemove;	
			}
			else if (addRemove <= 0)
			{
				
				System.out.println("Please enter a number greater than 0");			
			}
			return keychains;	
		
		}
		
		
		public static void view_order(int keychains, int cost, double tax, int costPerOrder, int costPerItem)
		{
			int shippingCosts = costPerOrder + (costPerItem * keychains);
			double taxPaid = tax * (shippingCosts+(keychains*cost));
			double priceWithTax = taxPaid + shippingCosts + (keychains * cost);
			
			System.out.println("\nYou have " + keychains + " keychains");
			System.out.println("Keychains cost " + cost + " each.");
			System.out.println("Your shipping costs are:");
			System.out.println("Shipping costs per order: $" + costPerOrder);
			System.out.println("Shipping costs item : $" + costPerItem);
			System.out.println("Total Shipping costs: ($" + costPerOrder + ".00 + " + keychains + " * $" + costPerItem +".00) = $" +  shippingCosts +".00");
			System.out.println("Total cost is $" + ((cost * keychains) + shippingCosts) + ".");
			System.out.println("Tax (" + (tax*100) + "%) : $" + taxPaid);
			System.out.println("Final Price  : $" + priceWithTax); 
		
		}
		
		
		
		public static void checkout (int keychains, int cost, double tax, int costPerOrder, int costPerItem)
		{	
			Scanner keyboard = new Scanner(System.in);
			int shippingCosts = costPerOrder + (costPerItem * keychains);
			double taxPaid = tax * (shippingCosts+(keychains * cost));
			double priceWithTax = taxPaid + shippingCosts + (keychains * cost);
			
			System.out.print("What is your name: ");
			String name = keyboard.next();
			System.out.println("\nYou have " + keychains + " keychains");
			System.out.println("Keychains cost " + cost + " each.");
			System.out.println("Your shipping costs are:");
			System.out.println("Shipping costs per order: $" + costPerOrder);
			System.out.println("Shipping costs item : $" + costPerItem);
			System.out.println("Total Shipping costs: ($" + costPerOrder + ".00 + " + keychains + " * $" + costPerItem +".00) = $" +  shippingCosts +".00");
			System.out.println("Total cost is $" + ((cost * keychains) + shippingCosts) + ".");
			System.out.println("Tax (" + (tax*100) + "%) : $" + taxPaid);
			System.out.println("Final Price: $" + priceWithTax); 
		}
}