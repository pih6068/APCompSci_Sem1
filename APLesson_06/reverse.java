import java.util.Scanner;
public class reverse
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your word?");
		String word = kb.nextLine();
		
		for(int i = word.length(); i >= 0; i--)
		{
			System.out.println(word.substring(0, i));
		}
	}
}