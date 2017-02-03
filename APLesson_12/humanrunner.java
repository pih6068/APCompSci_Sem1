import java.util.Scanner;

public class humanrunner
{
	
	public static void main(String[]args)
	{
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter your hair, eye and skin colors");
	
	human object = new human(kb.nextLine(), kb.nextLine(), kb.nextLine());
	
	System.out.println("My info...");
	System.out.println("Hair " + object.getHair());
	System.out.println("Eyes " + object.getEyes());
	System.out.println("Skin " + object.getSkin());
	
	object.setHES("Black", "Brown", "White");
	
	System.out.println("Friend info...");
	System.out.println("Hair " + object.getHair());
	System.out.println("Eyes " + object.getEyes());
	System.out.println("Skin " + object.getSkin());
	}
}