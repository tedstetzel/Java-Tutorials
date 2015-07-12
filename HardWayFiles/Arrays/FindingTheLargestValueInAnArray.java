import java.util.Random;

public class FindingTheLargestValueInAnArray
  {
    public static void main(String[] args)
    {
      int[] numbers;
      int largestValue = 0;
      int timesFound = 0;
      numbers = new int[10];

      System.out.print("Array: ");

      //make and show array
      for(int i = 0; i < numbers.length;i++ )
        {
          numbers[i] = classicRando();
          System.out.print(numbers[i]+ " ");

        }

      // run through loop to find value

        for(int i = 0; i < numbers.length;i++ )
        {
          if (numbers[i] > largestValue)
          {
            largestValue = numbers[i];
          }
        }

          System.out.println("\nThe largest value is " + largestValue);

    }

    public static int classicRando()
      {
        Random r = new Random();
        int rando = r.nextInt(50) + 1;
        return rando;
      }
  }
