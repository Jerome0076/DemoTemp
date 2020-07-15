package javaLearning;

public class MobileAccessories extends MobileNames{
	
	 final String NewSchool = "Preethi's School";
	
	 public void name() 
		{
//		  NewSchool="Jerome's School";
		  
			System.out.println(super.NewSchool);
			System.out.println(NewSchool);			
			mobilePreethi2();
			super.mobilePreethi2();
		}
		
	public static void fastCharger(int chargeTime, String Voltage)
	{
		System.out.println("I am a Fast Charging Device");
		System.out.println("Charging Time :"+chargeTime);
		System.out.println("Wattage :"+Voltage);
	}
	
	private static void bluetooths()
	{
		System.out.println("I am a Bluetooth Device");
	}
	
	public static void headphones1()
	{
		System.out.println("I am a headphone Device");
	}
	
	public static void wifi1()
	{
		System.out.println("I am a wifi Device");
	}
	
	public void mobilePreethi(String firstValue, String secondValue)
	{
		//Functionality 3
		//DB Valicdation
		String combinedValue = firstValue+secondValue;		
		System.out.println(combinedValue);
	}
	
	public  void mobilePreethi(String firstValue)
	{
		//Functionality 1
//		String firstValue = "Mobile Name :";
		String secondValue = " OPPO RENO 1";	
		String combinedValue = firstValue+secondValue;		
		System.out.println(combinedValue);
	}
	
	public static void mobilePreethi2()
	{
		String firstValue = "Mobile Name :";
		String secondValue = " OPPO RENO 3 Local";
		
		String combinedValue = firstValue+secondValue;
		
		System.out.println(combinedValue);
	}
	
	public void learnSwitch(String value)
	{
		switch(value)
		{
		case "Demo": 
		{
			System.out.println("This is a demo");
		}
		
		case "Pro" : 
		{
			System.out.println("This is a Pro Version");
		}
		break;
		case "Home" : 
		{
			System.out.println("This is a Home Version");
		}
		
		default : System.out.println("No Value is matching");
			
		}
	}
	
	
	//Multiple Inheritance cannot be applicable for Java	
	//A => B - Possible
	//A, B => C - Impossible
	//A => B => C - Possible
	
	//Hierarchy	
	//Interface (Interface - Class) - implements Keyword
	//Classes - Multiple  I - a- b - c -d = extends keyword
	
	
	
}
