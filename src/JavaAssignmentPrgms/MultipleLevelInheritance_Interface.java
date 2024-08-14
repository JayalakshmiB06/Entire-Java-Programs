package JavaAssignmentPrgms;

interface Interface
{
	void Abstract_Method1();
	void Abstract_Method2();
}
interface Interface_2 
{
	void Abstract_Method3();
	void Abstract_Method4();
}
public class MultipleLevelInheritance_Interface implements Interface,Interface_2 
{

	public static void main(String[] args) 
	{
		MultipleLevelInheritance_Interface MLI1 = new MultipleLevelInheritance_Interface();
		MLI1.Abstract_Method1();
		MLI1.Abstract_Method2();
		MLI1.Abstract_Method3();
		MLI1.Abstract_Method4();

	}

    public void Abstract_Method3() 
	{
		System.out.println("Abstract Method 3");
	}

	public void Abstract_Method4() 
	{
		System.out.println("Abstract Method 4");
	}

	public void Abstract_Method1() 
	{
		System.out.println("Abstract Method 1");
	}

	public void Abstract_Method2() 
	{
		System.out.println("Abstract Method 2");
	}
}
