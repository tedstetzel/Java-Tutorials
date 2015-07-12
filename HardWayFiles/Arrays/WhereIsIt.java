import java.util.Scanner;
import java.util.Random;

public class WhereIsIt
  {
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      int[] numbers;
      int valueToFind;
      int timesFound = 0;
      numbers = new int[10];

      System.out.println("Array: ");

      //make and show array
      for(int i = 0; i < numbers.length;i++ )
        {
          numbers[i] = classicRando();
          System.out.print(numbers[i]+ " ");

        }
      //get value to find
        System.out.println("\nValue to find: ");
        valueToFind = keyboard.nextInt();

      // run through loop to find value

        for(int i = 0; i < numbers.length;i++ )
        {
          if (numbers[i] == valueToFind)
          {
            System.out.println(valueToFind + " is in slot " + i + ".");
            timesFound++;

          }
        }

        if (timesFound == 0)
        {
          System.out.println(valueToFind + " is not in the array");
        }



    }


    public static int classicRando()
      {
        Random r = new Random();
        int rando = r.nextInt(50) + 1;
        return rando;
      }




  }
