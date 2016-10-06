import java.util.Scanner;
public class cubestatic
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the side length");
		double side = kb.nextDouble();
		kb.nextLine();
		print(side, surfarea(side));
	}
	
	public static double surfarea(double side)
	{
		return (side*side)*6;
	}
	
	public static void print(double side, double area)
	{
		System.out.println("The surface area of a cube whose sides are " + side + " in length is " + area);
	}
}