public class NumberPuzzles1
{
		public static void main(String [] args)
	{
		int counter = 0;
		
		for (int i1 = 10; i1 <=99; i1++)
		
		{
		
			for (int i2 = 10; i2 <=99; i2++)
			
			{
				if (Math.abs(i1 - i2) == 14 && i1 + i2 == 60)
					{
					System.out.println(i1 + ", " + i2);
					counter++;
					}
			}
		}
	}
}	