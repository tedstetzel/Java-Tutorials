public class EvennessFunction
{
	public static void main(String[] args)
	{
	
		for (int n = 1; n <= 20; n++)
		{
		System.out.print("\n" + n +" ");
		
		if (isEven(n))
			{
			System.out.print("<");
			}
		
		if (isDivisibleBy3(n))
			{
			System.out.print("=");
			}
		
		}
	}
	
	public static boolean isEven(int n)
	{
		boolean isEven = (n % 2 == 0);
		
		return isEven;
	
	}
	
		
	public static boolean isDivisibleBy3(int n)
	{
		boolean isDivisibleBy3 = (n % 3 == 0);
		
		return isDivisibleBy3;
	
	}
}