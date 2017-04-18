public class honda implements location 
{
	private double x,y;
	private double[] location;
	
	public honda(double[] loc)
	{
		location = loc;
		x = loc[0];
		y = loc[1];
	}
	public int getID()
	{
		return (int)(Math.random() * (1000000-100000)+1) + 100000;
	}
	public void move(double x1,double y1)
	{
		x += x1;
		y += y1;
	}
	public double[] getLoc()
	{
		return location;
	}
}