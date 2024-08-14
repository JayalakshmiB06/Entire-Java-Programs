package javaByMkt;

public class ConstructorEx {
	ConstructorEx()
	{
		System.out.println("Invoke constructor in main method");
	}
	public static void main(String[] args) 
	{
		ConstructorEx M1 = new ConstructorEx(); // Syntax 1 constructor will be invoked/callled the moment you create an object
	    new ConstructorEx(); // syntax 2
	}

}
