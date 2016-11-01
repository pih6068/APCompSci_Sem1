import java.util.Scanner;
public class right
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your word?");
		String word = kb.nextLine();
		
		for(int i = word.length()-1; i >= 0; i--)
		{
			System.out.println(word.substring(i, word.length()));
		}
	}
}