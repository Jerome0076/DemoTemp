package javaLearning;

import java.util.Scanner;

public class FirstClass {
 
	public static int numbers = 12;
	
	
	public static void main(String[] args) {
		
		String word = "Books   ";
		String defn = "are good!     ";
		
		String newWord = word.trim()+" "+defn.trim();
		
		String newstr = newWord.concat(word.trim());
		
		System.out.println(newstr);
		
		String sbStr = newstr.substring(6,12);
		
		System.out.println(sbStr);
		
		String replace = newstr.replace("good", "not good");
		
		System.out.println(replace);
		
		int rep = newstr.indexOf("!");
		System.out.println(rep);
		
		if(newstr.contains("good!"))
		{
			System.out.println("PASS");
		}
		
		
		
		
		
		
		
		
//		System.out.println(newWord);
//		
//		String[] words = {"Books","Thinks","56"};
//		int ln = words.length;
//		
//		for(int i =0; i<ln;i++)
//		{
//		System.out.println(words[i]);
//		}
		
//		//Char Array to String
//		char[] ch={'j','a','v','a','t','p','o','i','n','t'}; 
//		int charlen = ch.length;
//		String s=new String(ch);  
//		System.out.println(s);
//		
//		//String to Char Array
//		char[] chararray = s.toCharArray();
//		for(int i = 0;i<chararray.length;i++)
//		{
//			System.out.println(chararray[i]);
//		}
		
		
		
		
		
//		MobileAccessories acc = new MobileAccessories();	
//		for(int i =0 ; i<=15; i++)
//		{
//			System.out.println(i);
//			
//			if(i==numbers)
//			{
//				continue;
//			}
//			
//		}
		
//		int j=12;
//		while(j<14)
//		{
//			System.out.println(j);
//			if(j==12)
//			{
//				System.out.println("Current Iteration : " +j);	
//				j++;
//				continue;
//			}			
//			break;
//		}
		
//		int k = 1;
//		do 
//		{
//			System.out.println(k);
//			k++;
//			break;
//		}
//		while(k<15);
			
		
//		acc.name();
//		acc.learnSwitch("Demo");
		
		
//		printCall();
//		callProgress();
//		phoneName();
//		String Value = phoneName();
//		System.out.println(Value);		
//		MobileNames variableValue = new MobileNames();
//		variableValue.mobilePreeth3();	
//		MobileAccessories acc = new MobileAccessories();
//		acc.mobilePreethi();
//		acc.headphones();		
//		Scanner scan = new Scanner(System.in);		
//		System.out.println("Enter Charge Time : ");
//		int chargeTime = scan.nextInt();	
//		Scanner scan1 = new Scanner(System.in);
//		System.out.println("Enter Voltage : ");
//		String volts = scan1.nextLine();	
//		acc.fastCharger(chargeTime, volts);
//		scan.close();
//		scan1.close();		
//		MobileAccessories acc = new MobileAccessories();
//		acc.bluetooth("10 Meters", 2500, "INR");
//		Keywords key = new Keywords();
//		key.Keywords(111, "Harjith", 1234.0f);
//		key.print();
		
	}
	
	private static void printCall()
	{
		System.out.println("Make a call"); 
		System.out.println(numbers);
	}

	public static void callProgress()
	{
		System.out.println("Call in Progress");
	}
	
	public static String phoneName()
	{
		String phName = "Motorola";   
		
		return phName;
	}
	
	
	
}


//Access Modifier = Private, Public, Default, Protected
//Interface, Inheritance, POM Basics, Scanner, Parameterised Methods,Method Overloading, Method Overriding

//this, super, final, continue, break, loops, conditional stmts






