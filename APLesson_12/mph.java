import static java.lang.Math.*;

public class mph
{
	private int distance, hours, mins;
	private double mph;
	
	public mph()
	{
		distance=0;
		hours=0;
		mins=0;
		mph=0;
	}
	
	public mph(int dist,int hour,int min)
	{
		distance=dist;
		hours=hour;
		mins=min;
		mph=0;
	}
	
	public void mod(int dist,int hour,int min)
	{
		distance=dist;
		hours=hour;
		mins=min;
	}
	
	public int getDist()
	{
		return distance;
	}
	
	public int getHour()
	{
		return hours;
	}
	
	public double getMph()
	{
		return mph=Math.round(distance / (hours + mins / 60.0));
	}
	
}