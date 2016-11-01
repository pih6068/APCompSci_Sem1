import java.util.Scanner;
public class factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your number?");
		int number = kb.nextInt();
		int factorial = 1;
		for(int i = 1; i <= number; i++)
		{
			factorial *= i;
		}
		System.out.println(factorial);
	}
}