import java.util.Scanner; 

public class function
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your variable? \n");
		int variable = keyboard.nextInt();

		System.out.print(variable*variable + 6 * variable +12);
	}
}