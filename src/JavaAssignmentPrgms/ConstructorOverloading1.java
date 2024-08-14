//Constructor Overloading with atleast one constructor having 7 parameters

package JavaAssignmentPrgms;
public class ConstructorOverloading1 {

	ConstructorOverloading1()
	{
		System.out.println("non parameterised constructor");
	}
	ConstructorOverloading1(int a)
	{
		System.out.println("parametrized constructor with single parameter");
	}
	ConstructorOverloading1(int a, double b)
	{
		System.out.println("parametrized constructor with two parameters");
	}
	ConstructorOverloading1(float c,double d)
	{
		System.out.println("parametrized constructor with float and double parameters");
	}
	ConstructorOverloading1(char e,String f)
	{
		System.out.println("parametrized constructor with char and String parameters");
	}
	ConstructorOverloading1( int i,double b, float f, double d, char e,String g,boolean l)
	{
		System.out.println("parametrized constructor with 7 parameters");
	}
	public static void main(String[] args) 
	{
		new ConstructorOverloading1();
		new ConstructorOverloading1(3500);
		new ConstructorOverloading1(45000, 3.123456);
		new ConstructorOverloading1(3.12f,3.12);
		new ConstructorOverloading1('A',"RCKF0000044614");
		new ConstructorOverloading1(236745,300.45,3.14f,234.65,'A',"RCKF0000044614",true);
		
	}

}
