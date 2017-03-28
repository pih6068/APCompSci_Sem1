public class studentadvance extends advance
{
	public int getSerialNumber()
	{
		return super.getSerialNumber();
	}
	
	public void setDays(int n)
	{
		super.setDays(n);
	}
	
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return super.toString()+" (STUDENT ID REQUIRED)" ;
	}
}
