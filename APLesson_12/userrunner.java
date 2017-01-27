import java.util.Scanner;

public class userrunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String first = kb.nextLine();
		System.out.println("What is your last name?");
		String last = kb.nextLine();
		System.out.println("Would you like a public avatar, y or n");
		String avatar = kb.nextLine();
		
		if(avatar.equals("n"))
		{
			user user1 = new user(first, last);
			System.out.println(user1);
		}
		else
		{
			System.out.println("What is your avatar name?");
			user user2 = new user(first, last, kb.nextLine());
			System.out.println(user2);
		}
	}
}