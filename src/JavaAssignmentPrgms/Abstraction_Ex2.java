package JavaAssignmentPrgms;
class ConcreteClass
{
	static void ConcreteMethod1()
	{
		System.out.println("ConcreteMethod1");
	}
	void ConcreteMethod2()
	{
		System.out.println("ConcreteMethod2");
	}
}

abstract class Abstract_Class extends ConcreteClass
{
	abstract void abstract_Method1();
	abstract void abstract_Method2();
	void ConcreteMethod3()
	{
		System.out.println("ConcreteMethod3");
	}
	static void ConcreteMethod4()
	{
		System.out.println("ConcreteMethod4");
	}
}

public class Abstraction_Ex2 extends Abstract_Class
{
	void ConcreteMethod5()
	{
		System.out.println("ConcreteMethod5");
	}
	static void ConcreteMethod6()
	{
		System.out.println("ConcreteMethod6");
	}


    void abstract_Method1() 
    {
	System.out.println("Abstract Method 1");
	
    }

    void abstract_Method2() 
    {
    	System.out.println("Abstract Method 2");
	
    }

public static void main(String[] args) 
{
	Abstraction_Ex2 A2 = new Abstraction_Ex2();
	ConcreteMethod6();
	ConcreteMethod1();
	ConcreteMethod4();
	A2.abstract_Method1();
	A2.abstract_Method2();
	A2.ConcreteMethod2();
	A2.ConcreteMethod3();
	A2.ConcreteMethod5();
	

}

}
