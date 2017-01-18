import java.util.Scanner;
public class getodds
{
	static int[] numbers;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		numbers = new int[10];
		fillArray();
		printArray();
		System.out.println("The "+ getOdds() + " are odd numbers");
	}

	public static int fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		return 0;
	}

	public static int printArray()
	{
		System.out.print("For the following numbers...");
		for(int num: numbers)
		{
			System.out.print(num + ", ");
		}
		return 0;
	}

	public static String getOdds()
	{
		String odds = "";
		for(int num: numbers)
			if(num%2 == 1)
			{
				odds = odds.concat(String.valueOf(num) + ", ");
			}
		return odds;
	}
}