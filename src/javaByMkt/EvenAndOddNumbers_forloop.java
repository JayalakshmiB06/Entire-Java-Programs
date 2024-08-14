package javaByMkt;

public class EvenAndOddNumbers_forloop 
{

	public static void main(String[] args) 
{
System.out.println("Print even numbers from 0 to 100");
	
	for(int i=2; i<=100; i++)	
	{
		if (i%2==0)
		{
			System.out.println(i);
		}
	}
	
System.out.println("Print odd numbers from 0 to 100");
	
	for(int i=1; i<=100; i++)	
	{
		if (i%2!=0)
		{
			System.out.println(i);
		}
	}
	
System.out.println("Print even numbers from 100 to 200");

     for(int i=100; i<=200; i++)
     {
    	 System.out.println(i);
    	 i++;
     }
     
System.out.println("Print even numbers from 100 to 0");
 	
 	for(int i=100; i>=0; i--)	
 	{
 		if (i%2==0)
 		{
 			System.out.println(i);
 		}
 	}

System.out.println("Print 0dd numbers from 100 to 0");
 	
 	for(int i=99; i>=0; i--)	
 	{
 		
 	    {
 			System.out.println(i);
 			i--;
 		}
 	}
}

}
