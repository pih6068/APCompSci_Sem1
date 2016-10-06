import java.util.Scanner;
public class idcard
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		idcard form = new idcard();
		String divider = "***********************************";

		System.out.println("Enter your first name:");
		String name = kb.nextLine();
		
		System.out.println("Enter your last name:");
		String last = kb.nextLine();
		
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		
		System.out.println("Enter the school site:");
		String school = kb.nextLine();
		
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		System.out.printf("\n%34s", divider);
		
		form.display(name,last);
		form.display(title,school);
		form.display(year,subject);
		
		System.out.printf("\n%34s", divider);
	}
	
	public void display(String divider, String linedividerthing)
	{
		System.out.printf("\n* %15s  %14s *", divider, linedividerthing);
	}
}