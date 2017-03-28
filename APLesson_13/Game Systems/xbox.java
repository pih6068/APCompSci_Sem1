public class xbox extends console 
{
    public xbox()
    {
        super();
    }
    
    public xbox(String p)
    {
        super(p);
    }
    
    public int getSerialNumber()
    {
        return super.getSerialNumber();
    }
    
    public String getController()
    {
        return "XBox Wireless Controller";
    }
    
    public String getPlatform()
    {
        return "XBox";
    }
    
    public String toString()
    {
        return getPlatform() + " " + getSerialNumber() + " " + getController();
    }
}