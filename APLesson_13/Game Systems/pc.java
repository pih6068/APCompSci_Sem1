public class pc extends gamesystem
{
	public pc()
	{
		super();
	}
	
	public pc(String p)
	{
		super(p);
	}
	
	public int getSerialNumber()
	{
		return super.getSerialNumber();
	}
	
	public String getPlatform()
	{
		return "PC";
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return getPlatform() + " " + getSerialNumber() + " " + systemInput();
	}
}