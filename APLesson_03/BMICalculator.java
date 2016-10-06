import java.util.Scanner; 

public class BMICalculator
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is your weight(in lb)?");
		System.out.print("\n");

		float weight = keyboard.nextFloat();

		System.out.print("What is your height(in inches)?");
		System.out.print("\n");

		float height = keyboard.nextFloat();

		float bmi = 703*(weight/(height*height));

		System.out.print(bmi);

	}	
}	