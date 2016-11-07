import java.util.Scanner;
public class averageDigits
{
	static int number, average, num, digits;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your number?");
		number = kb.nextInt();
		average = 0;
		num = number;
		digits = 0;
		averageDigits();
		System.out.println("The average of the digits in " + number + " is " + (average));
	}
	public static void averageDigits()
	{
		while(num > 0)
		{
			average += num % 10;
			num /= 10;
			digits += 1;
		}
		average /= digits;
	}
}