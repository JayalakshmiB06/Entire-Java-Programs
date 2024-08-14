package JavaAssignmentPrgms;

interface Interface_1
{
	void Abstract_Method1();
	void Abstract_Method2();
}
interface Interface2 extends Interface_1
{
	void Abstract_Method3();
	void Abstract_Method4();
}
public class Interface_EX2 implements Interface2
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
	Interface_EX2 I2 = new Interface_EX2();
	Concrete_Method1();
	I2.Concrete_Method2();
	I2.Abstract_Method1();
	I2.Abstract_Method2();
	I2.Abstract_Method3();
	I2.Abstract_Method4();
}
public void Abstract_Method1() 
{
	System.out.println("Abstract Method 1");
}
public void Abstract_Method2() 
{
	System.out.println("Abstract Method 2");	
}
public void Abstract_Method3() 
{
	System.out.println("Abstract Method 3");
}
public void Abstract_Method4() 
{
	System.out.println("Abstract Method 4");
}

}
