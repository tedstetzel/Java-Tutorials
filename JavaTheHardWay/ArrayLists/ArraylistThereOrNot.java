import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListThereOrNot
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
    int finder = 0;
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i) == numIn)
      {
      System.out.println(numIn + " is in the ArrayList");
       finder++;
       }

    }
    if (finder == 0)
    System.out.println(numIn + " is not in the ArrayList ");


    System.out.println();
    System.out.println("Find using a contains(): ");

    if (list.contains(numIn))
    System.out.println(numIn + " is in the ArrayList");
    else
    System.out.println(numIn + " is not in the ArrayList");

    System.out.println();
  }







}
