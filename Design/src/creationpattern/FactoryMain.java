package creationpattern;

public class FactoryMain
{
	public static void main(String[] args) 
	{
		Laptop aLaptop = new AppleLaptop();
		aLaptop.laptopSpec();
	}
}
