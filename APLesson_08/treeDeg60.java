import java.util.Scanner;
public class treeDeg60
{
	static String word;
	static int start, stop;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your word?");
		word = kb.nextLine();
		stop = word.length();
		tree(word, start, stop);
	}

	public static String tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.println(word.substring(0, start));
			start += 1;
			tree(word, start, stop);
		}
		return "";
	}
}