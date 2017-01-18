import java.util.Scanner;
public class findZs
{
	static String[] words;
	static Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{
		
		words = new String[5];
		fillArray();
		printArray();
		System.out.println("Only " + hasZs() + " contain(s) the letter z");
	}

	public static String fillArray()
	{
		System.out.println("Enter 5 words");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.nextLine();
		}
		return "";
	}

	public static String printArray()
	{
		System.out.print("For the following words...");
		for(String word : words)
		{
			System.out.print(word + ", ");
		}
		return "";
	}

	public static String hasZs()
	{
		String zs = "";
		for(String word : words)
			if(word.indexOf("z") >= 0)
			{
				zs = zs.concat(word + ", ");
			}
		return zs;
	}
}