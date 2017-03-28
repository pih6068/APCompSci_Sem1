import java.util.Scanner;
import java.util.ArrayList;

public abstract class toy{

	private String name;
	private int count;

	public toy()
	{
		this.name = " ";
        this.count = 0;
	}

	public toy(String name) 
	{
        this.name = name;
        this.count = 1;
    }


    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getCount() 
    {
        return count;
    }

    public void setCount(int c) 
    {
        count += c;
    }

    public abstract String getType();

    public String toString() {
        return  "Toy:" + "name: '" + name + ", count: " + count;
    }
}