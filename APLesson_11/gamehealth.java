import java.util.Scanner;

public class gamehealth
{
	static String[] health;
	static int healthload = 6;
	static int healthcount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		String turn = "";
		int damage = 0;
		int ammount = 0;
		
		healthcount = 6;
		health = new String[healthload];
		
		while(!turn.equals("Q") && healthcount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = kb.next();
			damage = (int)(Math.random()*2) + 1;
			ammount = (int)(Math.random()*6) + 1;
			System.out.println(takeD(ammount, damage));
			printClip();
		}
		
	}
	public static String takeD(int ammount, int damage)
	{
		if(damage == 1)
		{
			healthcount = healthcount - ammount;
			return "Taking " + ammount + " damage";
		}
		else	
		{
			if(healthcount + ammount < healthload)
				healthcount = healthcount + ammount;
			else
				healthcount = healthload;
			return "Power up " + ammount;
		}
	}
	public static void printClip()
	{
		String output = "health"  +  "\t";
		for(int i = 0;i < healthcount;i++ )
		{
			if(i < healthcount)
				health[i] = " @ ";
			else
				health[i] =  "[]";
			output = output + health[i];
		}
		System.out.println(output);
	}
}