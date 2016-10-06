import java.util.Scanner;
public class idcard
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		idcard form = new idcard();
		String divider = "***********************************";

		System.out.println("Enter your first name:");
		String s = kb.nextLine();
		
		System.out.println("Enter your last name:");
		String s1 = kb.nextLine();
		
		System.out.println("Enter your title:");
		String s2 = kb.nextLine();
		
		System.out.println("Enter the school site:");
		String s3 = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String s4 = kb.nextLine();
		
		System.out.println("What is your subject?");
		String s5 = kb.nextLine();
		
		System.out.printf("\n%34s", divider);
		
		form.format(s3,s4);
		form.format(s,s1);
		form.format(s2,s5);
		
		String divider2 = "***********************************";
		System.out.printf("\n%34s", divider2);
	}
	
	public void format(String divider, String linedividerthing)
	{
		System.out.printf("\n* %15s  %14s *", divider, linedividerthing);
	}
}