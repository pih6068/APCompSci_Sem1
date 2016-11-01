import java.util.Scanner;
public class digitAdder
{
	static int number, sum, num;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your number?");
		number = kb.nextInt();
		sum = 0;
		num = number;
		
		sumDigits();
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	public static void sumDigits()
	{
		while(num < 0)
		{
			sum += num % 10;
			num /= 10;
		}
	}
}