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

		System.out.println("Your BMI is" + bmi);
		calcCondish(bmi);
	}	
	public static void calcCondish(float bmi)
	{
		String condition = "";
		if(bmi<=18.5)
			condition = "underweight";
		else if (bmi <=24.9)
			condition = "normal";
		else if (bmi <=29.9)
			condition = "overweight";
		else if (bmi <=34.9)
			condition = "obese";
		else if (bmi <=39.9)
			condition = "very obese";
		else
			condition = "morbidly obese";
		System.out.println("Your condition is " + condition);
	}
}	