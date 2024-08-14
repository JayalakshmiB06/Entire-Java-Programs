package javaByMkt;

public class Ex2_forloop 
{

	public static void main(String[] args) 
{
	System.out.println("Print numbers from -50 to -30");
	
		for(int i =-50;i<=-30;i++)
		{
			System.out.println(i);
		}
		
	System.out.println("Print numbers from -10 to +10");
		
		for(int i =-10;i<=10;i++)
		{
			System.out.println(i);
		}
		
	System.out.println("Print a to z");
	
	    for(char i ='a';i<='z';i++)
	    {
		    System.out.println(i);
	    }
	
	System.out.println("Print A to Z");
	 
	    for(char i ='A';i<='Z';i++)
	    {
		    System.out.println(i);
	    }
	    
	System.out.println("Print z to a");
		 
	    for(char i ='z';i>='a';i--)
	    {
		    System.out.println(i);
	    }
	
	 System.out.println("Print Z to A");
		 
	    for(char i ='Z';i>='A';i--)
	    {
		    System.out.println(i);
	    }
}
}
