import java.util.ArrayList;
public class toystore
{
    ArrayList<toy> toylist = new ArrayList<toy>();
    
    public toystore()
    {
        toylist.add(new afigure(""));
        toylist.add(new car(""));
    }
    
    public toystore(String list)
    {
        loadToys(list);
    }
    
    public void loadToys(String list)
    {
        String[] xdlist = list.split(", ");
        
        for(int i = 0; i < xdlist.length; i+=2)
        {
            String name = xdlist[i];
            String type = xdlist[i+1];
            
            if(getThatToy(name) == null)
            {
                if(type.equals("Car"))
                    toylist.add(new car(name));
                if(type.equals("Action Figure"))
                    toylist.add(new afigure(name));
            }
            else
                getThatToy(name).setCount(1);
        }
    }
    
    public toy getThatToy(String name)
    {
        for(toy b: toylist)
        {
            if(b.getName().equals(name))
                return b;
        }
        return null;
    }
    public String getMostFrequentToy()
    {
        String name = "";
        int max = 0;
        for(toy b: toylist)
        {
            if(max < b.getCount())
            {
                max = b.getCount();
                name = b.getName();
            }   
        }
        return name;
    }
    
    public String getMostFrequentType()
    {
        int cars = 0;
        int figures = 0;
        
        for(toy b: toylist)
        {
            if(b.getType().equals("Action Figure"))
                figures += 1;
            if(b.getType().equals("Car"))
                cars += 1;
        }
        if(cars > figures)
            return "Cars";
        if(figures > cars)
            return "Action figures";
        else
            return "Equal amounts of action figures and cars!";
    }
    
    public String toString()
    {
        String s = "";
        for(toy b: toylist)
        {
            s += b.getName() + " ";
            s += b.getCount() + " ";
        }       
        return s;       
    }
    
}