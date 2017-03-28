public class advance extends ticket
{
	private int days;
	
	public int getSerialNumber()
	{
		return super.getSerialNumber();
	}
	
	public void setDays(int n)
	{
		days = n;
	}
	
	public int getPrice()
	{
		if(days >= 10)
			return 30;
		else
			return 40;
	}
	
	public String toString()
	{
		return super.toString();
	}
}