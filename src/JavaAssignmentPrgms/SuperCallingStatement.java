package JavaAssignmentPrgms;
 class Parent_class
{
	 Parent_class() 
	 { 
		 System.out.println("Parent Class Constrctor 1");  
	 }
	 Parent_class(int a)
	 {   
		this();
	  System.out.println("Parent Class Constrctor 2"); 
		
	 } 
}
public class SuperCallingStatement extends Parent_class
{
	 
	SuperCallingStatement()
	{  
	   super(10);
	   System.out.println("Child class");
	}
	

public static void main(String[] args) 
	{
	SuperCallingStatement SC1 = new SuperCallingStatement ();
	
	}
}

//non parameterized super calling statement can be written implicitly and explicitly
// parametrized super calling statement should be written explicitly