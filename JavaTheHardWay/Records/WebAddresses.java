

class Address
{
	String street;
	String city;
	String state;
	int zip;
}

public class WebAddresses
{
	public static void main(String[] args) throws Exception
	{


		Address uno = new Address();
		uno.street = "ted stetzel";
		uno.city   = "san francisco";
		uno.state  = "Cal";
		uno.zip    = 99999;


		Address dos = new Address();
		dos.street = "D stetzel";
		dos.city   = "New Orleans";
		dos.state  = "LA";
		dos.zip    = 11111;

		Address tre = new Address();
		tre.street = "B stetzel";
		tre.city   = "Fremont"
		tre.state  = "CA";
		tre.zip    = 22222;

		System.out.println(uno.street + ", " + uno.city + ", " + uno.state + "  " + uno.zip);
		System.out.println(dos.street + ", " + dos.city + ", " + dos.state + "  " + dos.zip);
		System.out.println(tre.street + ", " + tre.city + ", " + tre.state + "  " + tre.zip);
	}
}
