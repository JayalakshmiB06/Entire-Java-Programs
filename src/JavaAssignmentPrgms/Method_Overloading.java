//Method Overloading

package JavaAssignmentPrgms;
public class Method_Overloading 
{
	public static void main(String[] args) 
	{
		Method_Overloading  M1 = new Method_Overloading ();
		M1.add();
		add(13,3.5f);
		M1.add(35.25, 40.00);
		add(120,140.00);
	}
void add()
{
	int a =10,b=20;
	System.out.println(a+b);
}
static void add(int a, float b)
{
	System.out.println(a+b);
}
void add (double a, double b)
{
	System.out.println(a+b);
}
static int add(int a, double b)
{
	System.out.println(a+b);
	return a;
	
}
}

