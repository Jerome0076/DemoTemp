package javaLearning;

public class MobileNames implements CommunicationDevices {

	 String NewSchool = "Harjith's School";
	
	public void mobilePreethi(String firstValue, String secondValue)
	{
		//Functionality 2
//		String firstValue = "Mobile Name :";
//		String secondValue = " OPPO RENO 1";	
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
	
	public static void mobilePreethi1()
	{
		String firstValue = "Mobile Name :";
		String secondValue = " OPPO RENO 2";
		
		String combinedValue = firstValue+secondValue;
		
		System.out.println(combinedValue);
	}
	public static void mobilePreethi2()
	{
		String firstValue = "Mobile Name :";
		String secondValue = " OPPO RENO 3 Super";
		
		String combinedValue = firstValue+secondValue;
		
		System.out.println(combinedValue);
	}
	public static void mobilePreeth3()
	{
		String firstValue = "Mobile Name :";
		String secondValue = " OPPO RENO 4";
		
		String combinedValue = firstValue+secondValue;
		
		System.out.println(combinedValue);
	}

	@Override
	public void bluetooth(String range, int Price, String Currency) {
		// TODO Auto-generated method stub
		System.out.println("Bluetooth Range : "+range);
		System.out.println("Bluetooth Price : "+Price);
		System.out.println("Bluetooth Currency : "+Currency);
	}

	@Override
	public void charger(String range, int Price, String Currency) {
		// TODO Auto-generated method stub
		System.out.println("Charger Range : "+range);
		System.out.println("Charger Price : "+Price);
		System.out.println("Charger Currency : "+Currency);
	}

	@Override
	public void headphone(String range, int Price, String Currency) {
		// TODO Auto-generated method stub
		System.out.println("Headphones Range : "+range);
		System.out.println("Headphones Price : "+Price);
		System.out.println("Headphones Currency : "+Currency);
	}

	@Override
	public void sim(String range, int Price, String Currency) {
		// TODO Auto-generated method stub
		System.out.println("SIM Range : "+range);
		System.out.println("SIM Price : "+Price);
		System.out.println("SIM Currency : "+Currency);
	}
	
}
