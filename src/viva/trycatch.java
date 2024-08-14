package viva;
public class trycatch
{
public static void main(String[] args) 
	{
	String s= "JavaViva";
	try
	{
		for(int i =0;i<s.length();i++)
		{
			System.out.println(s.charAt(s.length()));
		}
	}
	catch (StringIndexOutOfBoundsException eh)
	{
		System.out.println(s.charAt(s.length()-2));
	}
	
	}

	}


