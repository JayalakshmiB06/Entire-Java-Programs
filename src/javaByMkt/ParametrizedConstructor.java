package javaByMkt;

public class ParametrizedConstructor 
{
	ParametrizedConstructor(int a)
	{
		System.out.println("Single parameterized Constructor");
	}
	ParametrizedConstructor(String a, Float b)
	{
		System.out.println("Double parameterized Constructor");
	}
	ParametrizedConstructor(int a,float b,double c,char d,String e,boolean f)
	{
		System.out.println("multiple parameterized Constructor");
	}
	ParametrizedConstructor(int a,int b,int c,int d,int e, int f,int g)
	{
		System.out.println("multiple same data type parameterized constructor");
	}
	public static void main(String[] args) 
	{
		new ParametrizedConstructor(25000);
		new ParametrizedConstructor("Test123",3.14f);
		new ParametrizedConstructor(45000,3.12f,3.456789,'A',"Test1234",true);
		new ParametrizedConstructor(100,200,300,400,500,600,700);

	}

}
// Two constructors can't have same parameters
/* ParametrizedConstructor(int a)
{
	System.out.println("Single parameterized Constructor");
}
ParametrizedConstructor(int a)
{
	System.out.println("Double parameterized Constructor");
} */