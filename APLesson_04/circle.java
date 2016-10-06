import java.util.Scanner;
public class circle
{
	static double radius;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the radius");
		radius = kb.nextDouble();
		print();
	}
	
	public static double area()
	{
		return 3.14*(radius * radius);
	}
	
	public static void print()
	{
		System.out.println("The area of a circle with a radius of " + radius + " is " + area());
	}
}