import java.util.Random;
public class dice
{
	static int player;
	static int computer;
	static String winner;
	public static void main(String[]args)
	{
		player = (int)(Math.random()*6)+1;
		computer = (int)(Math.random()*6)+1;
		diceRoll();
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("And the winner is..." + winner);
	}

	public static void diceRoll()
	{	

		if (player > computer)
			winner = "You!";
		if(computer > player)
			winner = "The Computer.";
		if(computer == player)
			winner = "There was no winner, it was a tie.";

	}	
}