package creationpattern;

public class FactoryMain
{
	public static void main(String[] args) 
	{
		System.out.println("Hiii");
		LaptopFactory aLF = new LaptopFactory();
		Laptop aLaptop = aLF.getNewLaptop("Omsml");
		aLaptop.laptopSpec();
	}
}
