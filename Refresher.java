import java.util.Scanner;

public class Refresher
	{
		public static void main(String[] args)
			{
				int n;
				
				Scanner keyboard = new Scanner(System.in);
				String name;
				
				System.out.print("What is your name: ");
				name = keyboard.next();
				
				if (name.equals("Mitchell"))
					{
						n = 5;
					}
				else
					{
						n = 1;
					}
					
				for ( int i = n ; i <= 10; i++)
					{
					System.out.println( name );
					}
			}			
	}					 