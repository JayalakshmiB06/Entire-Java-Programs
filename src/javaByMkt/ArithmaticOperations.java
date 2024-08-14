package javaByMkt;

public class ArithmaticOperations {
	static void add()
	{
		byte a1 = 120;
		int a2 = 130;
		System.out.println(a1+a2);
	}
	static void sub()
	{
		byte a1 = 120;
		int a2 = 130;
		System.out.println(a1-a2);
	}
	static void mul()
	{
		byte a1 = 120;
		int a2 = 130;
		System.out.println(a1*a2);
	}
	static void div()
	{
		float a1 = 120f;
		float a2 = 130f;
		System.out.println(a1/a2);
	}
	static void mod()
	{
		byte a1 = 120;
		int a2 = 130;
		System.out.println(a1%a2);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
	}

}
