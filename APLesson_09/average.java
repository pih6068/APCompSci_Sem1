import java.util.Scanner;
public class average
{
	static int[] numbers;
	static int average;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		numbers = new int[10];

		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}	
		System.out.println("Numbers...");

		for(int number: numbers)
		{
			System.out.print(number + " ");
		}
		System.out.println();

		System.out.println("The average of the above numbers is " + average());
	}

	public static int average()
	{
		average = 0;
		for(int number : numbers)
		{
			average += number;
		}
		
		return average/(numbers.length);
	}

}