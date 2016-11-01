import java.util.Scanner;
public class count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your number?");
		int number = kb.nextInt();
		System.out.println("What is your increment?");
		int increment = kb.nextInt();
		
		for(int i = increment; i <= number; i+=increment)
		{
			System.out.println(i);
		}
	}
}