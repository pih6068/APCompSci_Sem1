import java.util.Scanner; 

public class RudeAI
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hi, my name is RudeAI.");
		System.out.print("\nI'd like to ask you a few questions.");
		System.out.print("\nWhat is your name?");
		System.out.print("\n");
		
		String name = keyboard.nextLine();

		System.out.print(name + "?!!! Why would anyone name a baby that?");
		System.out.print("\nHow old are you, " + name + "?");
		System.out.print("\n");

		String age = keyboard.nextLine();
		
		System.out.print("Oooooo!!! " + age + " is getting up there.");
		System.out.print("\nWhat do you do for fun," + name + "?");
		System.out.print("\n");

		String hobby = keyboard.nextLine();

		System.out.print("\nI thought only nerds like to " + hobby + "?");
		System.out.print("\nWhat kind of music do you like?");
		System.out.print("\n");

		String music = keyboard.nextLine();

		System.out.print("\nBoooo!!! I wouldn't wish the sound of " + music + " on my worst enemy.");
		System.out.print("\nHow many siblings do you have?");
		System.out.print("\n");

		String siblings = keyboard.nextLine();

		System.out.print(siblings + "? Wow, I hope the rest of your family is better looking.");
		System.out.print("\nWhat do you want to be when you grow up?");
		System.out.print("\n");

		String job = keyboard.nextLine();

		System.out.print("\nI think you'd have to be smarter to be a " + job + ".");
		System.out.print("\nSo " + name + ", you're " + age + "...");
		System.out.print("\nYou like to " + hobby + " and listen to " + music);
		System.out.print("\nGood luck becoming a " + job);
		System.out.print("\nI'm only kidding " + name + "."); 
	}
}