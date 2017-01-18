import java.util.Scanner;
public class firstLetter
{
	static String[] words;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		words = new String[5];
		System.out.println("Please enter 5 words");

		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.nextLine();
		}	

		first();
	}

	public static String first()
	{
		for(String word : words)
		{
			System.out.println(word.substring(0,1));
		}
	return"";
	}

}