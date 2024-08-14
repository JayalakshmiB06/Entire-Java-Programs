package javaByMkt;

public class StringFunctions 
{
	void Functions() 
	{
	String name="School";
	System.out.println(name.length());
	System.out.println(name.charAt(2));
	System.out.println(name.indexOf('o'));
	System.out.println(name.toUpperCase());
	}
    void FunctionsEX() 
    {
    String name ="SCHOOL";
    System.out.println(name.toLowerCase());
	System.out.println(name.concat(" name is ABC Public School"));
	System.out.println(name.contains("SCH"));
    }
    void FunctionsEx1()
    {
	String first_name="Manish";
	String last_name="Tiwari";
	System.out.println(first_name.concat(" ").concat(last_name));
	
    }

public static void main(String[] args) 
{
	StringFunctions F1 = new StringFunctions();
	F1.Functions();
	F1.FunctionsEX();
	F1.FunctionsEx1();

}

}
