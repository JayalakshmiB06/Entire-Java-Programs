package JavaAssignmentPrgms;
 interface Interface1
{
	void Absrract_Method1();
	void Absrract_Method2();
}
public class Interface_EX1 implements Interface1
{
	static void Concrete_Method1()
	{
		System.out.println("Concrete Method 1");
	}
	void Concrete_Method2()
	{
		System.out.println("Concrete Method 2");
	}
public static void main(String[] args) 
{
	Interface_EX1 I1= new Interface_EX1();
	Concrete_Method1();
	I1.Concrete_Method2();
	I1.Absrract_Method1();
	I1.Absrract_Method2();
}

public void Absrract_Method1() 
{
	System.out.println("Abstract_Method 1");
	
}
 public void Absrract_Method2() 
{
	System.out.println("Abstract_Method 2");
	
}
}
