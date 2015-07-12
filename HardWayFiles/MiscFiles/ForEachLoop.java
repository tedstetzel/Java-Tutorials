import java.util.Random;

public class ForEachLoop
  {
    public static void main(String [] args)
    {
      int[] nums = new int[10];
      int max, min;

      System.out.println("\n------------------------------------------------------");
      System.out.print("Your Array: ");

      for (int i : nums)
      {
        nums[i] = classicRando();
        System.out.print(nums[i] + ", ");
      }

      max = min = nums[0];

      for (int i : nums)
      {

        if (nums[i] < min)
        {min = nums[i];}


        if (nums[i] > max)
        {max = nums[i];}

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
