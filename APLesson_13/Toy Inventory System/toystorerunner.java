import java.util.Scanner;
public class toystorerunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		toystore toyStore = new toystore("Hotwheel, Car, G.I.Joe, Action Figure, PennyRacer, Car, Matchbox, Car, Star Wars, Action Figure, Pullback, Car, Star Wars, Action Figure");
		System.out.println(toyStore);
		System.out.println("Most Frequent Toy:" + toyStore.getMostFrequentToy());
		System.out.println("Most Frequent Type:" + toyStore.getMostFrequentType());
	}
}