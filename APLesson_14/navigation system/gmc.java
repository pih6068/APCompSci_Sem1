public class gmc implements location 
{
	private double x,y;
	
	public gmc(double x1,double y1)
	{
		x = x1;
		y = y1;
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
		double[] location = new double[2];
		location[0]=x;
		location[1]=y;
		return location;
	}
}