package JavaAssignmentPrgms;
class Inheritance1
{
	void sub (double a, double b)
	{
		System.out.println(a-b);
	}
}
class MultiLevelInheritance1 extends Inheritance1
{
	void add (int a, int b)
	{
		System.out.println(a+b);
	}
	static void add()
	{
		System.out.println("addition");	
	}
}
public class MultiLevelInheritance extends MultiLevelInheritance1
{
	MultiLevelInheritance(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		MultiLevelInheritance MLI1 = new MultiLevelInheritance ("Jayalakshmi");
	    add();
	    MLI1.add(80, 45);
	    MLI1.sub(65.15, 35.25);

	}

}
