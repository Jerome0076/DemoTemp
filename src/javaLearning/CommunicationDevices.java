package javaLearning;

public interface CommunicationDevices {
	
	void bluetooth(String range, int Price, String Currency);
	
	void charger(String range, int Price, String Currency);
	
	void headphone(String range, int Price, String Currency);
	
	void sim(String range, int Price, String Currency);
	
	public static void android()
	{
		System.out.println("I am a Android Device");
	}

}
