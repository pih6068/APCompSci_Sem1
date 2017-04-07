public abstract class ticket
{
	int serialNumber;
    public ticket() {
        serialNumber = 1000000 + (int)(Math.random() * 9999999);
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public abstract int getPrice();

    
    public String toString() {
        return "Serial Number:" + getSerialNumber() + "\nPrice:" + getPrice();
    }
}