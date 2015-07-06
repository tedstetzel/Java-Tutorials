import java.util.Random;

public class MaxMinArray
  {
    public static void main(String [] args)
    {
      int[] nums = new int[10];
      int max, min;

      System.out.println("\n------------------------------------------------------");
      System.out.print("Your Array: ");

      for (int i = 0; i < nums.length; i++ )
      {
        nums[i] = classicRando();
        System.out.print(nums[i] + ", ");
      }

      max = min = nums[0];

      for (int j = 0; j < nums.length; j++)
      {

        if (nums[j] < min)
        {min = nums[j];}


        if (nums[j] > max)
        {max = nums[j];}

      }

      System.out.println("\nThe largest number is " + max);
      System.out.println("The smallest number is " + min);
      System.out.println("------------------------------------------------------\n");



    }


    static int classicRando()
    {
      Random r = new Random();
      return r.nextInt(100) + 1;


    }


  }
