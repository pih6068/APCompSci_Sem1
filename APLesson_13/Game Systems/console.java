public abstract class console extends gamesystem{
    String Controller;
    public console() 
    {
        super();
    }

    public console(String system) 
    {
        super(system);
    }

    public abstract String getController();

    public String toString() 
    {
        return "Platform:'" + super.getPlatform() + '\'' +
                "Serial Number:'" + super.getSerialNumber() + '\'' +
                "Controller:" + getController() + '\'' ;
    }
}