import java.util.ArrayList;
public class toyota implements location 
{
	private double x,y;
	
	public toyota(String string)
	{
		String[] stringsplit = string.split(", ");
		ArrayList<Integer> toyota = new ArrayList<Integer>();
		for(int i = 0; i < stringsplit.length; i++)
		{
			toyota.add(Integer.parseInt(stringsplit[i]));
		}
		x = toyota.get(0);
		y = toyota.get(1);
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