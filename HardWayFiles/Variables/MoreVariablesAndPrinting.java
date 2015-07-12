public class MoreVariablesAndPrinting
{
	public static void main(String[] args)
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		
		myName = "Zed A. Shaw";
		myAge = 35;
		myHeight = 74;
		myWeight = 180;
		myEyes = "Blue";
		myTeeth = "White";
		myHair = "Brown";
		
		//metric vars 
		//myHeightMetric = myHeight ** 2.54;
		//myWeightMetric = myWeight ** .453;
		
		
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " inches (or " + myHeight * 2.54 + " cm) tall.");
		System.out.println("He's" + myWeight + " pounds (or " + myWeight * .453 + "  kg ) heavy.");		
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("His teeth are usually " + myTeeth + " depending on the coffee.");
		
		//tricky
		System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + ".");
		}
	}
		