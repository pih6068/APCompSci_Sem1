import java.util.Scanner;

public class adventure
{
	static int choice, choice2,choice3, choice4, choice5, choice6, choice7;
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You are on an adventure! Use 1 for yes and 2 for no to make decisions.");
		System.out.println("You are in front of a cave; do you go in?");

		choice = kb.nextInt();
		if(choice == 1)
		{	
			System.out.println("You have entered the cave and find a well that is smoking. Do you go down?");
			choice2 = kb.nextInt();
			if(choice2 == 2)
			{
				System.out.println("You progress into the cave, and find a lake with what seems like gold in the middle. Do you row across in the boat?");
				choice4 = kb.nextInt();
				if(choice4 == 1)
					System.out.println("The boat has a hole and sinks. You drown.");
				else
					System.out.println("Instead of seizing treasure, you walk out of the dungeon like a loser. The end");
			}
			else
			{
				System.out.println("In the well you find a dragon sleeping on gold. Do you try to kill it?");
				choice5 = kb.nextInt();
				if(choice5 == 1)
					System.out.println("You forget you don't have a sword and hit it with your fist. The dragon wakes up and eats you. You die.");
				else
					System.out.println("In fear, you run out of the cave like a loser. The end");
			}
		}
		else
		{	
			System.out.println("You circle around to the back of the cave. You are in front of a desert and a forest. Do you go into the desert?");
			choice3 = kb.nextInt();
			if(choice3 == 2)
			{
				System.out.println("In the forest, you find a cottage. Do you go in?");
				choice6 = kb.nextInt();
				if(choice6 == 1)
					System.out.println("You find your grandmother in a bed. In an instant, a wolf jumps out of the bed and mauls you. You die. The end");
				else
					System.out.println("You turn around, but a wolf bursts out of the cottage and mauls you. You die. The end");
			}
			else
			{	
				System.out.println("You enter the desert and walk for hours. Do you keep walking?");
				choice7 = kb.nextInt();
				if(choice7 == 1)
					System.out.println("You walk for fourty years and end up in the promised land. You have succeeded. The end");
				else
					System.out.println("Unfortunately you get lost. You die of thirst. The end");
			}
		}
	}
}