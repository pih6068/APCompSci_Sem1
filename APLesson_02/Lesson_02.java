public class Lesson_02
{
	public static void main(String[]args)
	{
		//Multiplication
		int var1 = 5;
		int var2 = 3;
		int product = var1 * var2;
		System.out.println(var1 + " multiplied by " + var2 + " is " + product);
		//Concatenation
		String name = "Mr. Robinette";
		String address = "3710 Del Mar Heights Road";
		String city = "San Diego, ";
		String zip = "92130";
		System.out.println(name + "\n" + address + "\n" + city + "CA " + zip);
		//Complex Calculation
		int length = 8;
		int width = 3;
		int height = 4;
		int lxw = 2 * length * width;
		int lxh = 2 * length * height;
		int wxh = 2 * width * height;
		int surfaceArea= lxw + lxh + wxh;
		System.out.println("The surface area of your rectangle with length " + length + ", width " + width + ", and height " + height + " is " + surfaceArea);
	}
}