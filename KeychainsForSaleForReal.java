import java.util.Scanner;

public class KeychainsForSaleForReal
{
		public static void main(String[] args)
		{
			
			int keychains = 0;
			int cost = 10;
			
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
				view_order( keychains, cost);
				
				
				}
				
				else if (choice == 4)
				{
				checkout( keychains, cost);
				//checkout
				
				loop = false;
				
				
				}
			}
		}
	
	
	
		public static int add_keychains(int addRemove)
		{ 
		
			int keychains = addRemove;
			return keychains;	
		}
		
		
		public static int remove_keychains(int addRemove)
		{ 
		
			int keychains = addRemove;
			return keychains;	
		}
		
		
		
		public static void view_order(int keychains, int cost)
		{
			System.out.println("\nYou have " + keychains + " keychains");
			System.out.println("Keychains cost " + cost + " each.");
			System.out.println("Total cost is $" + (cost * keychains) + ".");
		}
		
		public static void checkout (int keychains, int cost)
		{	Scanner keyboard = new Scanner(System.in);
			System.out.print("What is your name: ");
			String name = keyboard.next();
			System.out.println("\nYou have " + keychains + " keychains");
			System.out.println("Keychains cost " + cost + " each.");
			System.out.println("Total cost is $" + (cost * keychains) + ".");
			System.out.print("Thank you for your order " + name + ".\n");
		}
}