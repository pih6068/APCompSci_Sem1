import java.util.Scanner;

public class mphrunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		mph object = new mph(kb.nextInt(),kb.nextInt(),kb.nextInt());
		
		System.out.println(object.getDist() + " miles in " + object.getHour() + " hours = " + object.getMph() + " mph");
		
		object.mod(5,4,3);
		
		System.out.println(object.getDist() + " miles in " + object.getHour() + " hours = " + object.getMph() + " mph");
	}
}




