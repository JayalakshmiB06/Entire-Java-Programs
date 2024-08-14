package javaByMkt;

public class ConstructorOverloading
{
	ConstructorOverloading()
	{
		System.out.println("non parameterised constructor");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("parametrized constructor with single parameter");
	}
	ConstructorOverloading(int a, double b)
	{
		System.out.println("parametrized constructor with two parameters");
	}
	ConstructorOverloading(float c,double d)
	{
		System.out.println("parametrized constructor with float and double parameters");
	}
	ConstructorOverloading(char e,String f)
	{
		System.out.println("parametrized constructor with char and String parameters");
	}
	public static void main(String[] args) 
	{
		new ConstructorOverloading();
		new ConstructorOverloading(3500);
		new ConstructorOverloading(45000, 3.123456);
		new ConstructorOverloading(3.12f,3.12);
		new ConstructorOverloading('A',"RCKF0000044614");
		
	}

}
