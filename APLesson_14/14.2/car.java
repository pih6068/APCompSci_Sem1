public class car implements location
{
	double[] location;
	public final int id=(int)(Math.random() * (1000000-100000)+1) + 100000;
	
	public car()
	{
		location = new double[2];
		location[0]=0;
		location[1]=0;
	}
	public int getID()
	{
		return id;
	}
	public void move(double x1,double y1)
	{
		location[0] += x1;
		location[1] += y1;
	}
	public double[] getLoc()
	{
		return location;
	}
}