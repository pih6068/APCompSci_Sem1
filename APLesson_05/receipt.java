import java.util.Scanner;
public class receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		receipt form = new receipt();
		
		System.out.println("Enter item 1");
		String item1 = kb.nextLine();
		
		System.out.println("Enter the price");
		Double price1 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Enter item 2");
		String item2 = kb.nextLine();
		
		System.out.println("Enter the price");
		Double price2 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("Enter item 3");
		String item3 = kb.nextLine();
		
		System.out.println("Enter the price");
		Double price3 = kb.nextDouble();
		
		kb.nextLine();
		
		String header = "<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>";
		System.out.printf("\n%41s", header);
		String subtotal = "Subtotal";
		Double subtotalnum = price1 + price2 + price3;
		String tax = "Tax";
		Double taxnum = (subtotalnum)*0.08;
		Double discount = calcDisc(subtotalnum);
		String total = "Total";
		Double totalnum = subtotalnum + taxnum - discount;
		
		
		form.change(item1,price1);
		form.change(item2,price2);
		form.change(item3,price3);
		form.change(subtotal,subtotalnum);
		form.change("Discount",discount);
		form.change(tax,taxnum);
		form.change(total,totalnum);


		String bottom = "___________________________________________________";
		System.out.printf("\n%41s", bottom);
		String thanks = " * Thank you for your support *";
		System.out.printf("\n%41s", thanks);
		System.out.println("\n");
	}

	public static Double calcDisc(double subtotalnum)
		{
			if (subtotalnum >= 2000)
				return subtotalnum * 0.15;
			return 0.0;
		}

	public void change(String string, double number)
	{
		System.out.printf("\n * %15s .......  %4.2f", string, number);
	}
}
