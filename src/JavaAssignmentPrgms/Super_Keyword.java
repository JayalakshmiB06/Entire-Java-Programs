//prgm for method Overriding with super keyword

package JavaAssignmentPrgms;
class  MethodOverriding1
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

public class Super_Keyword extends MethodOverriding1

{
	
	void Name (String A)
	{
		super.Name("Jayalakshmi");
		System.out.println("I'm" + " "+ A);
	}
	void Occupation (String O)
	{
		super.Occupation("Software Tester");
		System.out.println("I'm a"+" "+ O);
	}
	public static void main(String[] args)
	{
		Super_Keyword MO1 = new Super_Keyword();
		MO1.Name("Jayalakshmi");
		MO1.Occupation("Software Tester");

	}

}

