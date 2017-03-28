public class gamesystem
{
    String platform;
    int serialNumber;

    public gamesystem()
    {
        this.platform = " ";
        this.serialNumber = 1 + (int)(Math.random()*9999999);
    }

    public gamesystem(String platform)
    {
        this.platform = platform;
        this.serialNumber = 1 + (int)(Math.random()*9999999);
    }

    public String getPlatform() 
    {
        return platform;
    }

    public int getSerialNumber() 
    {
        return serialNumber;
    }
}