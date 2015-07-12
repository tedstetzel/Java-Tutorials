public class NestingLoops
{
	public static void main (String [] args)
	{
		// CN
		for (char c='A'; c <= 'E'; c++)
		{
			for (int n = 1; n <= 3; n++)
			{
				System.out.println (c + " " + n);
			}
		}
		
		System.out.println("\n");
		
		// AB
		for (int a=1; a <=3; a++)
		{
		
		
			for (int b=1; b <=3; b++)
			{ 
				System.out.print (a + "-" + b + " " );
			}
		
		// TBD
			
		}
		
		 System.out.println("\n");
	}
}