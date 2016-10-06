import java.util.Scanner;
public class circlestatic
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the radius");
		double radius = kb.nextDouble();
		print(radius,area(radius));
	}
	
	public static double area(double radius)
	{
		return 3.14*(radius * radius);
	}
	
	public static void print(double radius,double area)
	{
		System.out.println("The area of a circle with a radius of " + radius + " is " + area);
	}
}