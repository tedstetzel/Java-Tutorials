import java.util.ArrayList;
import java.util.Scanner;

public class FindingAValueInAnArraylist
{
  public static void main(String[] args)
  {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++)
    list.add(Rando.classicRando(50));

    System.out.print("ArrayList: " + list );

    Scanner keyboard = new Scanner(System.in);
    System.out.print("\nValue to find: ");
    int numIn = keyboard.nextInt();
    System.out.println();

    //Display results

    System.out.println("Find using a loop: ");
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i) == numIn)
      System.out.println(numIn + " is in the ArrayList");
    }
    System.out.println();
    System.out.println("Find using a contains(): ");
    if (list.contains(numIn))
    {
    System.out.println(numIn + " is in the ArrayList");
    }
    System.out.println();
  }







}
