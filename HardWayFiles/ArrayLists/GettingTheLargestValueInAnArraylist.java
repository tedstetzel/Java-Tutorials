import java.util.ArrayList;

public class LocatingTheLargestValueInAnArraylist
{
  public static void main(String[] args)
  {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++)
    list.add(Rando.classicRando(50));

    System.out.print("ArrayList: " + list );

  /*  Scanner keyboard = new Scanner(System.in);
    System.out.print("\nValue to find: ");
    int numIn = keyboard.nextInt();
    System.out.println();*/

    //Display results

    System.out.println("\n");
    int finder = 0;
    int largest = 0, slotNum;
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i) > largest)
      {
        largest = list.get(i);
        slotNum = i;
       }

    }
    System.out.println("The largest value is: " + largest + "and it is in slot" + slotNum);

    System.out.println();
  /*  System.out.println("Find using a contains(): ");

    if (list.contains(numIn))
    System.out.println(numIn + " is in the ArrayList");
    else
    System.out.println(numIn + " is not in the ArrayList");

    System.out.println();*/
  }







}
