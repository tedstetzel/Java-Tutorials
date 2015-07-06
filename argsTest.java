public class argsTest
  {
    public static void main(String[] args)
      {
        System.out.println("The were " + args.length +  " the arguments passed to the main methods: ");


        for(int i =0; i < args.length; i++)
        {
          System.out.println("arg [" + i + "] is " + args[i]);

        }

      }
  }
