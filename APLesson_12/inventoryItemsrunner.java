import java.util.Scanner;

public class inventoryItemsrunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Will you be entering price and category, y or n");
		
		if(kb.nextLine().equals("n"))
		{
			System.out.println("Enter item's manufacturer and name (in that precise order)");
			inventoryItems item1 = new inventoryItems(kb.nextLine(), kb.nextLine());
			System.out.println(item1);
		}
		else
		{
			System.out.println("Enter item's manufacturer, name, category, and price (in that precise order)");
			inventoryItems item1 = new inventoryItems(kb.nextLine(), kb.nextLine(), kb.nextLine(), kb.nextLine());
			System.out.println(item1);			
		}	
	}
}
