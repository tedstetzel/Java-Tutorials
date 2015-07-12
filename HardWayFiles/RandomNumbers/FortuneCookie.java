import java.util.Random;

public class FortuneCookie
{
	public static void main(String[] args)
	{
	Random r = new Random();

	
	System.out.print("Fortune cookie says: ");
	
	int number = r.nextInt(6);
	int lottoNumber1 = 1 + r.nextInt(54);
	int lottoNumber2 = 1 + r.nextInt(54);
	int lottoNumber3 = 1 + r.nextInt(54);
	int lottoNumber4 = 1 + r.nextInt(54);
	int lottoNumber5 = 1 + r.nextInt(54);
	int lottoNumber6 = 1 + r.nextInt(54);

	
	if (number == 1)
	{
	System.out.println("People are naturally attracted to you.");
	}
	else if	(number == 2)
	{
	System.out.println("You learn from your mistakes... You will learn a lot today.");
	}
	else if	(number == 3)
	{
	System.out.println("If you have something good in your life, don't let it go!");
	}
	else if	(number == 4)
	{
	System.out.println("Your shoes will make you happy today.");
	}
	else if	(number == 5)
	{
	System.out.println("Land is always on the mind of a flying bird.");
	}
	else if	(number == 6)
	{
	System.out.println("The greatest risk is not taking one.");
	}
	else
	{
	System.out.println("Fortune Cookie error");
	}
	
	System.out.println("\nYour Lucky Numbers:");
	
	System.out.println(lottoNumber1 + " - " + lottoNumber2 + " - " + lottoNumber3 + " - " + lottoNumber4 + " - " + lottoNumber5 + " - " + lottoNumber6);

	
	}
}