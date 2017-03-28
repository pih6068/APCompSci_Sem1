public class playstation extends console
{
	public playstation()
	{
		super();
	}
	
	public playstation(String p)
	{
		super(p);
	}
	
	public int getSerialNumber()
	{
		return super.getSerialNumber();
	}
	
	public String getController()
	{
		return "PS DualShock 3";
	}
	
	public String getPlatform()
	{
		return "PlayStation";
	}
	
	public String toString()
	{
		return getPlatform() + " " + getSerialNumber() + " " + getController();
	}
}