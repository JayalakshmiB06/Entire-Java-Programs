//prgm for method Overriding

package JavaAssignmentPrgms;
class  Overriding
{
	void Name (String A)
	{
		System.out.println("My name is" +" "+A);
	}
	void Occupation (String O)
	{
		System.out.println("I am a" +" "+ O);
	}
}

public class MethodOverriding extends Overriding
{
	void Name (String A)
	{
		System.out.println("I'm" + " "+ A);
	}
	void Occupation (String O)
	{
		System.out.println("I'm a"+" "+ O);
	}
	public static void main(String[] args)
	{
		MethodOverriding MO1 = new MethodOverriding();
		MO1.Name("Jayalakshmi");
		MO1.Occupation("Software Tester");

	}

}

// you can only override non static methods
// you can't override constructors since we can't inherit constructors
// you can't override main method  as it is static in nature
