import java.util.Scanner;

public class distancer
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		distance object = new distance(kb.nextInt(),kb.nextInt(),kb.nextInt(),kb.nextInt());
		
		System.out.println("Distance = " + object.getDist());
		
		object.setValues(1,2,3,4);
		
		System.out.println("Distance = " + object.getDist());
	}
}