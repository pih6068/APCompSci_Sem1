import java.util.Scanner;

public class boxen
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		boxen vol = new boxen();
		
		System.out.println("Enter the height in inches");
		double height = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter the width in inches");
		double width = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter the length in inches");
		double length = kb.nextDouble();
		kb.nextLine();
		
		double volume = vol.volume(height, width, length);
		vol.print("Volume = ", volume);
		
	}
	
	public double volume(double height, double width, double length)
	{
		double volume = (height/12)*(width/12)*(length/12);
		return(volume);
	}
	
	public void print(String string, double number)
	{
		System.out.printf("\n  %25s%2.5f", string, number);
	}
}