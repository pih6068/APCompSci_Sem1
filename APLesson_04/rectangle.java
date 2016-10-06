import java.util.Scanner;
public class rectangle
{
	static double length, width;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length in feet");
		length = kb.nextDouble();
		kb.nextLine();

		System.out.println("Enter width in feet");
		width  = kb.nextDouble();
		kb.nextLine();
		print();
	}
	
	public static double perim()
	{
		double perimeter  = (2*length)+(2*width);
		return perimeter;
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is " + perim() + " ft around");
	}
}
