import java.util.Random;

public class FlickerPhrase
{
	public static void main(String[] args ) 
	throws InterruptedException
	{
		Random rng = new Random();
		int r;
		
		for ( int i=0; i<100000; i++ )
		{
			r = 1 + rng.nextInt(5);
			// Write five if statements here.
				if (r == 1)
				{
					Thread.sleep(1000);
					first();
				}
				
				if (r == 2)
				{
					Thread.sleep(1000);
					second();
				}
				if (r == 3)
				{
				Thread.sleep(1000);
				third();
				}
				
				if (r == 4)
				{
					Thread.sleep(1000);
					fourth();
				}
				
				if (r == 5)
				{
					Thread.sleep(1000);
					fifth();
				}
				
				
				
		
			// If r is 1, then call the function named 'first'.
			// If r is 2, then call the function named 'second', and so on.
			

			// Optional: after the if statements are over, add in a slight delay.
		}

		System.out.println("-------------------");
	
	}

	public static void first() 
	{   
		System.out.print("Get               \r");
		
	}

	public static void second() 
	{   
		System.out.print("    off           \r");
		
	}

	public static void third() 
	{   
		System.out.print("        of        \r");
		
	}

	public static void fourth() 
	{   
		System.out.print("           my     \r");
		
	}

	public static void fifth() 
	{   
		System.out.print("              lawn\r");
		
	}
}