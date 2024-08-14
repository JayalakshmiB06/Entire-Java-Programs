package javaByMkt;

public class logicalOperator 
{

public static void main(String[] args) 
	
{
	boolean Username = true, EmailID = true, Password = true;
	if(Username==true && Password == false)
	{
	    System.out.println("Incorrect Password");	
	}
	if(EmailID == false && Password == true)
	{
		System.out.println("Incorrect EmailID");	
	}
	if(EmailID == false || Password == false)
	{
		System.out.println("Incorrect EmailId and Password");
	}
	if(Username != true || Password == false)
	{
		System.out.println("Incorrect Username and Password");	
	}
	if(Username==true && Password == true)
	{
		System.out.println("logged into Facebook");	
	}	
	if(Username!=true || EmailID != false)
	{
		System.out.println("Forgot Username and EmailID ");
	}
	
	
}
}


