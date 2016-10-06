import java.util.Scanner;
public class cube
{
	static double side;
	static double sa;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the side length");
		side = kb.nextDouble();
		kb.nextLine();
		print();
	}
	
	public static double surfarea()
	{
		return (side*side)*6;
	}
	
	public static void print()
	{
		System.out.println("The surface area of a cube whose sides are " + side + " in length is " + surfarea());
	}
}