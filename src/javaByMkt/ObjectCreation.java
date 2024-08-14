package javaByMkt;

public class ObjectCreation {
	public static void add()
	{
		System.out.println(5+4);
	}
	void sub()
	{
		System.out.println(3.14-0.14);
	}
	public static void mul()
	{
		System.out.println(5*4);
	}
	void mod()
	{
		System.out.println(127%128);
	}
	public static void div()
	{
		System.out.println(3450/2810);
	}
	public static void main(String[] args) 
	{
		add();
		ObjectCreation o1 = new ObjectCreation();
		o1.sub();
		mul();
		o1.mod();
		div();
		System.out.println("prgm for calling static and non-static methods inside main method");
	}

}
