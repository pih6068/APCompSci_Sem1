import java.util.Scanner;
public class carrunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter options. (Paint, interior, engine, tires.");
		
		car object = new car(kb.nextLine(), kb.nextLine(), kb.nextLine(), kb.nextLine());
		
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint: \t" + object.getPaint());
		System.out.println("Interior: \t" + object.getInterior());
		System.out.println("Engine: \t" + object.getEngine());
		System.out.println("Tires: \t" + object.getTires());
	}
}