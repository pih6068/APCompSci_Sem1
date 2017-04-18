public class toyota extends car
{
	public toyota(String string)
	{
		String[] split = string.split(", ");
		location[0] = Double.parseDouble(split[0]);
		location[1] = Double.parseDouble(split[1]);
	}
}