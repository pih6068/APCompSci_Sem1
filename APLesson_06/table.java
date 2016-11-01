import java.util.Scanner;
public class table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your number?");
		int number = kb.nextInt();
		System.out.println("What is your table size?");
		int table = kb.nextInt();
		
		for(int i = 1; i<=table; i++)
		{
			int product = i*number;
			System.out.printf("\n| %d | %d |", i, product);
		}
	}
}