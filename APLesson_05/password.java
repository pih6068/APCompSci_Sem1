import java.util.Scanner;
public class password
{
	static String username, password;
	public static void main(String[]args)
	{
		username = "username";
		password = "password123";
		passCheck();
	}
	public static void passCheck()
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter username");
		String userinput = kb.nextLine();
		System.out.println("Enter password");
		String passinput = kb.nextLine();

		if(userinput.equals(username) && passinput.equals(password))
			System.out.println("You are granted access");
		else
			if(userinput.equals(username) && ! passinput.equals(password))
				System.out.println("Your password is incorrect");
			else if( ! userinput.equals(username) && passinput.equals(password))
				System.out.println("Your username is incorrect");
			else
				System.out.println("Your username and password are incorrect");
	}
	

}