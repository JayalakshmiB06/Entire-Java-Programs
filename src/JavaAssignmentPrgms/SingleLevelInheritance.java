// prgm for single  level inheritance
package JavaAssignmentPrgms;
 class Inheritance
{
	void add()
	{
		System.out.println("addition");
	}
	static void mul(int a, int b)
	{
		System.out.println("Multiplication");
	}
}
public class SingleLevelInheritance extends Inheritance
{
	SingleLevelInheritance()
	{
		int a=20,b=4;
	    System.out.println(a/b);
	}
	static void mod (int a, int b)
	{
		System.out.println("Modular");
	}
public static void main(String[] args) 
	{
	SingleLevelInheritance SLI1 = new SingleLevelInheritance();
	SLI1.add();
	mul(25,5);
	mod(30,15);

	}

}
