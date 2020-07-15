package javaLearning;

public class Keywords {
	
	//THIS Keyword - Instances Created
	 int rollno;
	 String name;
	 float fees;

	public void Keywords(int rollno,String name,float fees)
	{
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
		System.out.println(rollno+"\n"+name+"\n"+fees);
	}
	
	public void print()
	{
		System.out.println(rollno+"\n"+name+"\n"+fees);
	}
	
	


}
