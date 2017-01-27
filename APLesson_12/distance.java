import java.lang.Math.*;

public class distance
{
	private int x1, y1, x2, y2;
	private double distance;
	
	public distance()
	{
		distance = 0;
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
	}
	
	public distance(int x,int y,int x3,int y3)
	{
		distance = 0;
		x1 = x;
		x2 = x3;
		y1 = y;
		y2 = y3;
	}
	
	public void setValues(int x,int y,int x4,int y4)
	{
		x1 = x;
		x2 = x4;
		y1 = y;
		y2 = y4;
	}
	
	public double getDist()
	{
		return distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
}