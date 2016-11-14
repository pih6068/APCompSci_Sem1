import java.util.Scanner;
public class replaceSpaces
{
	static String sentence, newsentence;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your sentence?");
		sentence = kb.nextLine();
		replace(sentence);
	}
	public static String replace(String sentence)
	{
		if(sentence.indexOf(" ") <= 0) 
		{
			System.out.println(sentence);
		}
		else
		{
			newsentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ")+ 1);
			replace(newsentence);
		}
		return "";
	}
	

}