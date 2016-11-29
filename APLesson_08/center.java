import java.util.Scanner;
public class center
{
	static String word1, word2, word3;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your first word?");
		word1 = kb.nextLine();
		System.out.println("What is your second word?");
		word2 = kb.nextLine();
		System.out.println("What is your third word?");
		word3 = kb.nextLine();

		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
		{
			return word;
		}	
		else
		{
			return makeCenter(" " + word + " ");
		}
	}
}
