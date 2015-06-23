public class MultiplicationTable
{
	public static void main(String[] args)
	{
	
	System.out.println("x | 1\t2\t3\t4\t5\t6\t7\t8\t9");
	System.out.println("==+====================================================================");
	
	for (int yAxis = 1; yAxis <=12; yAxis++)
		{
		System.out.print("\n " + yAxis + "|");
	
		for (int xAxis = 1; xAxis <=9; xAxis++)
			{
			 System.out.print((xAxis * yAxis) + "\t");		
			}
		}
	}
}