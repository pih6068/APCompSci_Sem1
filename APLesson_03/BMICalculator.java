import java.util.Scanner; 

public class BMICalculator
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is your weight(in kg)?");
		System.out.print("\n");

		float weight = keyboard.nextFloat();

		System.out.print("What is your height(in meters)?");
		System.out.print("\n");

		float height = keyboard.nextFloat();

		float bmi = weight/(height*height);

		System.out.print(bmi);

	}	
}	