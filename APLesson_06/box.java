import java.util.Scanner;
public class box
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your word?");
		String word = kb.nextLine();
		
		int number = word.length();
		System.out.println(number);
		for(int i = 0; i < number; i++)
		{
			System.out.println(word);
		}
	}
}