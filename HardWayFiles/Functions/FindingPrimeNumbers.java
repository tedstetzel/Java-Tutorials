public class FindingPrimeNumbers
{
	public static void main(String[] args)
	{
	
	
	
		for (int n = 1; n <= 100; n++)
		{
		//System.out.print("\n" + n +" ");
		
		if (isPrime(n))
			{
			System.out.println(n);
			}

		
		}
	}
	
	public static boolean isPrime( int n )
	{
		boolean isPrime = false;
		
		int divisor;
		int myCheck = 0;
		
		for (int i = n - 1 ; i > 1; i--)
			{
			
				if ( n % i == 0)
				{
				//System.out.print("not prime" + n + " / " + i + " = " + (n/i));
				myCheck++;
				 
				}	
			}
		
		if (myCheck == 0)
			{
				isPrime = true;
			}	
		
		
		return isPrime;
	
	}
	
		

}