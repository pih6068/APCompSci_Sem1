import java.util.Scanner;
public class rectangle
{
	static double length, width;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length and width in feet");
		length = kb.nextDouble();
		kb.nextLine();
		width  = kb.nextDouble();
		kb.nextLine();
		print();
		
	}
	
	public static double calcPerim()
	{
		double perimeter  = (2*length)+(2*width);
		return perimeter;
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is " + calcPerim() + " ft around");
	}
}
