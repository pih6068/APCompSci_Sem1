import java.util.Scanner;

public class boxen
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		boxen vol = new boxen();
		
		System.out.println("please enter the height in inches");
		double height = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("please enter the width in inches");
		double width = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("please enter the length in inches");
		double length = kb.nextDouble();
		kb.nextLine();
		
		double volume = vol.volume(height, width, length);
		
		vol.format("Height in inches: ", height);
		vol.format("Width in inches: ", width);
		vol.format("Length in inches: ", length);
		vol.format("Volume in cubic feet: ", volume);
		
	}
	
	public double volume(double height, double width, double length)
	{
		double volume = (height/12)*(width/12)*(length/12);
		return(volume);
	}
	
	public void format(String string, double number)
	{
		System.out.printf("\n  %25s%2.5f", string, number);
	}
}