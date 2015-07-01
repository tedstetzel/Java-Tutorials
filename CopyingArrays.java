import java.util.Random;

public class CopyingArrays
  {
    public static void main(String[] args)
    {
      //declare random object


      //array
      int[] myFirstArray;
      int[] mySecondArray;
      myFirstArray = new int[10];
      mySecondArray = new int[10];

      // loop that copies

      for (int i = 0; i < myFirstArray.length; i++)
      {
          myFirstArray[i] = classicRando();
          mySecondArray[i] = myFirstArray[i];

      }

      System.out.print("First Array: ");
      for (int i = 0; i < myFirstArray.length; i++)
      {
          System.out.print(myFirstArray[i] + " ");
      }

      System.out.print("\nSecond Array: ");
      for (int i = 0; i < mySecondArray.length; i++)
      {
          System.out.print(mySecondArray[i] + " ");
      }
      System.out.println();

    }

    public static int classicRando()
    {
      Random r = new Random();
      int rando = r.nextInt(100) + 1;
      return rando;

    }


}
