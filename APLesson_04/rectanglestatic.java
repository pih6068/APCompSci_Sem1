import java.util.Scanner;
public class rectanglestatic
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length in feet");
		double length = kb.nextDouble();
		kb.nextLine();

		System.out.println("Enter width in feet");
		double width  = kb.nextDouble();
		kb.nextLine();
		print(perim(length, width));
	}
	
	public static double perim(double length, double width)
	{
		return (2*length)+(2*width);
	}
	
	public static void print(double perim)
	{
		System.out.println("Your rectangle is " + perim + " ft around");
	}
}
