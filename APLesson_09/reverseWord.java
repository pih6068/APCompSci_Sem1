import java.util.Scanner;
public class reverseWord
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
		
		for(String word : words)
		{
			System.out.println(word);
		}
		System.out.println();
		System.out.println("Reversed");
		reverse();
	}
	public static String reverse()
	{
		for(int i = 0; i < words.length; i++)
		{
			System.out.println(words[4-i]);
		}
	return "";
	}

}