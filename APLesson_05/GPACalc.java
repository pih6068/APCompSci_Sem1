import java.util.Scanner;
public class GPACalc
{
	static String math, science, history, english, compsci, art, pe;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("What is your math grade?");
		math = kb.nextLine();

		System.out.println("What is your science grade?");
		science = kb.nextLine();

		System.out.println("What is your history grade?");
		history = kb.nextLine();

		System.out.println("What is your english grade?");
		english = kb.nextLine();

		System.out.println("What is your comp sci grade?");
		compsci = kb.nextLine();

		System.out.println("What is your art grade?");
		art = kb.nextLine();

		System.out.println("What is your pe grade?");
		pe = kb.nextLine();

		double gPoints = calcPoints(math) + calcPoints(science) + calcPoints(history) + calcPoints(english) + calcPoints(compsci) + calcPoints(art) + calcPoints(pe);

		System.out.println("Your total GPA is " + gPoints/7);
	}
	public static Double calcPoints(String grade)
	{
		if(grade.equals("A") || grade.equals("a"))
			return 4.0;
		if(grade.equals("B") || grade.equals("b"))
			return 3.0;
		if(grade.equals("C") || grade.equals("c"))
			return 2.0;
		if(grade.equals("D") || grade.equals("d"))
			return 1.0;
		else
			return 0.0;		
	}
}