import java.util.Scanner;
public class cube
{
	static double side, sa;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the side length");
		side = kb.nextDouble();
		kb.nextLine();
		print();
	}
	
	public static double calcSurf()
	{
		return (side*side*6);
	}
	
	public static void print()
	{
		System.out.println("The surface area of a cube with side length " + side + " is " + calcSurf());
	}
}