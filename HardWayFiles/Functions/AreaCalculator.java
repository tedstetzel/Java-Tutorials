import java.util.Scanner;

public class AreaCalculator
{
		public static void main(String[] args)
		{
			
			Scanner keyboard = new Scanner(System.in);
			
			int shape;
			int input1 = 0;
			int input2 = 0;
			//Square
			
			double area = 0;
			int loop = 1;
			
			System.out.println("Shape Area Calculator");
			
			while (loop == 1)
			{
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			
			System.out.println("1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Square");
			System.out.println("4) Circle");
			System.out.println("5) Quit");
			System.out.print("Which shape: ");
			shape = keyboard.nextInt();
			
				if (shape == 1) //triangle
				{
					System.out.print("Base: ");
					input1 = keyboard.nextInt();
					
					System.out.print("Height: ");
					input2 = keyboard.nextInt();
					
					area = area_triangle(input1, input2); 
				}
				
				else if (shape == 2) //Rectangle
				{
					System.out.print("Length: ");
					input1 = keyboard.nextInt();
					
					System.out.print("Height: ");
					input2 = keyboard.nextInt();
					
					area = area_rectangle(input1, input2);
				}
				
								
				else if (shape == 3) //Square
				{
					System.out.print("Side Length: ");
					input1 = keyboard.nextInt();
					
					
					area = area_square(input1);
				}
				
				
				else if (shape == 4) //Circle
				{
					System.out.print("Radius: ");
					input1 = keyboard.nextInt();
					
					
					area = area_circle(input1);
				}
				
				
				System.out.println("");
				
				if (shape == 5)
				{
					System.out.println("OKbye");
					loop = 0;
				}
				
				else if (shape == 1 || shape == 2 || shape == 3 || shape == 4)    
				{
				System.out.println("The area is " + area + "\n");
				}
				
				}
				
				
		}
			
			
			public static double area_triangle( int base, int height )
			{	
					double area;
					
					area = (.5 * base * height);
					
					return area; 		
			}
			
			public static int area_rectangle( int length, int width )   // returns the area of a rectangle
			{	
					int area;
					
						area = (length * width);
					
					return area; 		
			}
			
			
			public static int area_square( int side )                   // returns the area of a square
			{	
					int area;
					
						area = (side * side);
					
					return area; 		
			}
			
			
			public static double area_circle( int radius )              // returns the area of a circle
			{	
					double area;
					
						area = (Math.PI * (radius *radius ));
					
					return area; 		
			}
		
}
			
			