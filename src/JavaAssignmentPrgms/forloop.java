package JavaAssignmentPrgms;

public class forloop
{
public static void main(String[] args) 
	{
	System.out.println("Print 100 to 0");
		for (int i=100;i>=0;i--)
		{
			System.out.println(i);
		}
	System.out.println("Print 0 to 100");
		for (int i=0;i<=100;i++)
		{
			System.out.println(i);
		}
	System.out.println("Print -50 to -30");
		for (int i=-50;i<=-30;i++)
		{
			System.out.println(i);
		}	
	System.out.println("Print 10 to -10");
		for (int i=10;i>=-10;i--)
		{
			System.out.println(i);
		}		
    System.out.println("Print even numbers 0 to 100");
        for (int i=2;i<=100;i++)
	    {
        	if (i%2==0)
        	{
		System.out.println(i);
	        }
	    }
        System.out.println("Print odd numbers 0 to 100");
        for (int i=1;i<=100;i++)
	    {
        	if (i%2!=0)
        	{
		System.out.println(i);
	        }
	    }
	}


}
