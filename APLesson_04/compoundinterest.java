import java.util.Scanner;
public class compoundinterest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		compoundinterest interest = new compoundinterest();
		
		System.out.println("Please enter the interest rate");
		double rate = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter the principal amount");
		double principal = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter the number of times interest is compounded in years");
		double numbertime = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter the life of the loan in years");
		double lifeyr = kb.nextDouble();
		kb.nextLine();
		
		double payment = interest.total(numbertime, principal, rate , lifeyr);
		interest.print("Your total monthly payment is $", payment);
	}
	
	public double total(double numbertime, double principal, double rate, double lifeyr) 
	{
		double thing = Math.pow(((rate/numbertime)+1),(numbertime*lifeyr)) *principal;
		return((thing/12)/lifeyr);
	}
	
	public void print(String string, double number)
	{
		System.out.printf("\n  %50s%5.2f", string, number);
	}
}
