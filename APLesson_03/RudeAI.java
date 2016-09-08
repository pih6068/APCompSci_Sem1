import java.util.Scanner; 

public class RudeAI
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hi, my name is RudeAI.");
		System.out.print("I'd like to ask you a few questions.");
		System.out.print("What is your name?");
		
		String name = keyboard.nextLine();

		System.out.print(name + "?!!! Why would anyone name a baby that?");
		System.out.print("How old are you, " + name + "?");

		Int age = keyboard.nextInt();
		
		System.out.print("Oooooo!!! " + age + " is getting up there.");
		System.out.print("What do you do for fun," + name + "?");

		System.out.print("I thought only nerds like to " + activity + "?");
		System.out.print("What kind of music do you like?");

		System.out.print("Boooo!!! I wouldn't wish the sound of " + music + " on my worst enemy.");
		System.out.print("How many siblings do you have?");

		System.out.print(siblings + "? Wow, I hope the rest of your family is better looking.");
		System.out.print("What do you want to be when you grow up?");

		System.out.print("I think you'd have to be smarter to be a " + profession + ".");
		System.out.print("So " + name + ", you're " + age "...");
		System.out.print("You like to " + activity + " and listen to " + music);
		System.out.print("Good luck becoming a " + profession);
		System.out.print("I'm only kidding " + name + "."); 
	}
}