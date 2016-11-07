import java.util.Scanner;
public class reverseNum
{
	static int number, num, rev;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your number?");
		number = kb.nextInt();
		rev = 0;
		num = number;
		getReverse();
		System.out.println(number + " reversed is " + rev);
	}
	public static void getReverse()
	{
		while(num > 0)
		{
			rev *= 10;
			rev += num%10;
			num /= 10;
		}
	}
}