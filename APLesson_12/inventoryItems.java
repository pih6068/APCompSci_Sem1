public class inventoryItems
{
	private String manufacturer, name, category, price;
	private int upc = (int)(Math.random() * 1000000) + 1;
	
	public inventoryItems()
	{
		manufacturer = "";
		name = "";
		category = "";
		price = "";
	}

	public inventoryItems(String m, String n)
	{
		manufacturer = m;
		name = n;
		category = "Unknown";
		price = "Unknown";
	}
	
	public inventoryItems(String m, String n, String c, String p)
	{
		manufacturer = m;
		name = n;
		category = c;
		price = p;
	}
	
	public String toString()
	{
		return "Item:\nManufacturer: " + manufacturer +
                           "\nName: " + name +
                           "\nCategory: " + category +
                           "\nPrice: " + price +
						   "\nUPC:" + upc;
	}
}