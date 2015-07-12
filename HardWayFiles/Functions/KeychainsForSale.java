import java.util.Scanner;

public class KeychainsForSale
{
		public static void main(String[] args)
			{
			
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
				System.out.println("\nADD KEYCHAINS");
				
				
				}
				else if (choice == 2)
				{
				System.out.println("\nREMOVE KEYCHAINS");
				}
				
				else if (choice == 3)
				{
				System.out.println("\nVIEW CURRENT ORDER");
				}
				
				else if (choice == 4)
				{
				System.out.println("\nCHECKOUT - GOODBYE");
				loop = false;
				}
			}
		}
	}